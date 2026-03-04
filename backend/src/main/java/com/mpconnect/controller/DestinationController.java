package com.mpconnect.controller;

import com.mpconnect.entity.Destination;
import com.mpconnect.service.DestinationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/destinations")
@RequiredArgsConstructor
public class DestinationController {

    private final DestinationService service;

    @GetMapping
    public ResponseEntity<List<Destination>> getAllDestinations() {
        return ResponseEntity.ok(service.getAllDestinations());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Destination> getDestination(@PathVariable String id) {
        return ResponseEntity.ok(service.getDestinationById(id));
    }

    @PostMapping
    public ResponseEntity<Destination> createDestination(@RequestBody Destination dest) {
        return ResponseEntity.ok(service.createDestination(dest));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Destination> updateDestination(@PathVariable String id, @RequestBody Destination dest) {
        return ResponseEntity.ok(service.updateDestination(id, dest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDestination(@PathVariable String id) {
        service.deleteDestination(id);
        return ResponseEntity.noContent().build();
    }
}
