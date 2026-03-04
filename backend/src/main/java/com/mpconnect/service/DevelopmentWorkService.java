package com.mpconnect.service;

import com.mpconnect.entity.DevelopmentWork;
import com.mpconnect.repository.DevelopmentWorkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DevelopmentWorkService {

    private final DevelopmentWorkRepository repository;

    public List<DevelopmentWork> getAllWorks() {
        return repository.findAll();
    }

    public DevelopmentWork getWorkById(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Work not found"));
    }

    public DevelopmentWork createWork(DevelopmentWork work) {
        work.setId(UUID.randomUUID().toString());
        work.setCreatedAt(LocalDateTime.now());
        work.setUpdatedAt(LocalDateTime.now());
        return repository.save(work);
    }

    public DevelopmentWork updateWork(String id, DevelopmentWork updated) {
        DevelopmentWork work = getWorkById(id);
        if (updated.getTitle() != null)
            work.setTitle(updated.getTitle());
        if (updated.getStatus() != null)
            work.setStatus(updated.getStatus());
        if (updated.getBudget() != null)
            work.setBudget(updated.getBudget());

        work.setUpdatedAt(LocalDateTime.now());
        return repository.save(work);
    }

    public void deleteWork(String id) {
        repository.deleteById(id);
    }
}
