package com.mpconnect.service;

import com.mpconnect.entity.ScheduledTour;
import com.mpconnect.repository.ScheduledTourRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ScheduledTourService {

    private final ScheduledTourRepository repository;

    public List<ScheduledTour> getAllTours() {
        return repository.findAll();
    }

    public ScheduledTour getTourById(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Tour not found"));
    }

    public ScheduledTour createTour(ScheduledTour tour) {
        tour.setId(UUID.randomUUID().toString());
        if (tour.getDestinations() != null) {
            tour.getDestinations().forEach(dest -> {
                if (dest.getId() == null) {
                    dest.setId(UUID.randomUUID().toString());
                }
            });
        }
        return repository.save(tour);
    }

    public ScheduledTour updateTour(String id, ScheduledTour updated) {
        ScheduledTour tour = getTourById(id);
        if (updated.getDate() != null)
            tour.setDate(updated.getDate());
        if (updated.getStartTime() != null)
            tour.setStartTime(updated.getStartTime());
        if (updated.getStatus() != null)
            tour.setStatus(updated.getStatus());
        if (updated.getSpecialInstructions() != null)
            tour.setSpecialInstructions(updated.getSpecialInstructions());
        return repository.save(tour);
    }

    public void deleteTour(String id) {
        repository.deleteById(id);
    }
}
