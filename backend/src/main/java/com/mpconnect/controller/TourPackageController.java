package com.mpconnect.controller;

import com.mpconnect.entity.TourPackage;
import com.mpconnect.service.TourPackageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tour-packages")
@RequiredArgsConstructor
public class TourPackageController {

    private final TourPackageService service;

    @GetMapping
    public ResponseEntity<List<TourPackage>> getAllPackages() {
        return ResponseEntity.ok(service.getAllPackages());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TourPackage> getPackage(@PathVariable String id) {
        return ResponseEntity.ok(service.getPackageById(id));
    }

    @PostMapping
    public ResponseEntity<TourPackage> createPackage(@RequestBody TourPackage pack) {
        return ResponseEntity.ok(service.createPackage(pack));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TourPackage> updatePackage(@PathVariable String id, @RequestBody TourPackage pack) {
        return ResponseEntity.ok(service.updatePackage(id, pack));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePackage(@PathVariable String id) {
        service.deletePackage(id);
        return ResponseEntity.noContent().build();
    }
}
