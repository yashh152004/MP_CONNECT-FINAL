package com.mpconnect.service;

import com.mpconnect.entity.PlanTodayEvent;
import com.mpconnect.repository.PlanTodayEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PlanTodayEventService {

    private final PlanTodayEventRepository repository;

    public List<PlanTodayEvent> getAllEvents() {
        return repository.findAll();
    }

    public PlanTodayEvent getEventById(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Event not found"));
    }

    public PlanTodayEvent createEvent(PlanTodayEvent event) {
        event.setId(UUID.randomUUID().toString());
        event.setCreatedAt(LocalDateTime.now());

        if (event.getAttendees() != null) {
            event.getAttendees().forEach(att -> {
                if (att.getId() == null) {
                    att.setId(UUID.randomUUID().toString());
                }
            });
        }

        return repository.save(event);
    }

    public PlanTodayEvent updateEvent(String id, PlanTodayEvent updated) {
        PlanTodayEvent event = getEventById(id);
        if (updated.getTitle() != null)
            event.setTitle(updated.getTitle());
        if (updated.getStatus() != null)
            event.setStatus(updated.getStatus());
        if (updated.getDate() != null)
            event.setDate(updated.getDate());

        return repository.save(event);
    }

    public void deleteEvent(String id) {
        repository.deleteById(id);
    }
}
