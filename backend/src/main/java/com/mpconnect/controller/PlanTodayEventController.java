package com.mpconnect.controller;

import com.mpconnect.entity.PlanTodayEvent;
import com.mpconnect.service.PlanTodayEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plan-today-events")
@RequiredArgsConstructor
public class PlanTodayEventController {

    private final PlanTodayEventService service;

    @GetMapping
    public ResponseEntity<List<PlanTodayEvent>> getAllEvents() {
        return ResponseEntity.ok(service.getAllEvents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlanTodayEvent> getEvent(@PathVariable String id) {
        return ResponseEntity.ok(service.getEventById(id));
    }

    @PostMapping
    public ResponseEntity<PlanTodayEvent> createEvent(@RequestBody PlanTodayEvent event) {
        return ResponseEntity.ok(service.createEvent(event));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlanTodayEvent> updateEvent(@PathVariable String id, @RequestBody PlanTodayEvent event) {
        return ResponseEntity.ok(service.updateEvent(id, event));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable String id) {
        service.deleteEvent(id);
        return ResponseEntity.noContent().build();
    }
}
