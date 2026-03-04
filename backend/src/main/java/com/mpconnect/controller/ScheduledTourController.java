package com.mpconnect.controller;

import com.mpconnect.entity.ScheduledTour;
import com.mpconnect.service.ScheduledTourService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/scheduled-tours")
@RequiredArgsConstructor
public class ScheduledTourController {

    private final ScheduledTourService service;

    @GetMapping
    public ResponseEntity<List<ScheduledTour>> getAllTours() {
        return ResponseEntity.ok(service.getAllTours());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ScheduledTour> getTour(@PathVariable String id) {
        return ResponseEntity.ok(service.getTourById(id));
    }

    @PostMapping
    public ResponseEntity<ScheduledTour> createTour(@RequestBody ScheduledTour tour) {
        return ResponseEntity.ok(service.createTour(tour));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ScheduledTour> updateTour(@PathVariable String id, @RequestBody ScheduledTour tour) {
        return ResponseEntity.ok(service.updateTour(id, tour));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTour(@PathVariable String id) {
        service.deleteTour(id);
        return ResponseEntity.noContent().build();
    }
}
