package com.mpconnect.service;

import com.mpconnect.entity.TourProgram;
import com.mpconnect.repository.TourProgramRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TourProgramService {

    private final TourProgramRepository repository;

    public List<TourProgram> getAllPrograms() {
        return repository.findAll();
    }

    public TourProgram getProgramById(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Program not found"));
    }

    public TourProgram createProgram(TourProgram program) {
        program.setId(UUID.randomUUID().toString());
        program.setCreatedAt(LocalDateTime.now());

        if (program.getParticipants() != null) {
            program.getParticipants().forEach(p -> {
                if (p.getId() == null) {
                    p.setId(UUID.randomUUID().toString());
                }
            });
        }

        return repository.save(program);
    }

    public TourProgram updateProgram(String id, TourProgram updated) {
        TourProgram program = getProgramById(id);
        if (updated.getTitle() != null)
            program.setTitle(updated.getTitle());
        if (updated.getStatus() != null)
            program.setStatus(updated.getStatus());
        if (updated.getStartDate() != null)
            program.setStartDate(updated.getStartDate());
        if (updated.getStartTime() != null)
            program.setStartTime(updated.getStartTime());

        return repository.save(program);
    }

    public void deleteProgram(String id) {
        repository.deleteById(id);
    }
}
