package com.mpconnect.controller;

import com.mpconnect.entity.DevelopmentWork;
import com.mpconnect.service.DevelopmentWorkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/works")
@RequiredArgsConstructor
public class DevelopmentWorkController {

    private final DevelopmentWorkService service;

    @GetMapping
    public ResponseEntity<List<DevelopmentWork>> getAllWorks() {
        return ResponseEntity.ok(service.getAllWorks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DevelopmentWork> getWork(@PathVariable String id) {
        return ResponseEntity.ok(service.getWorkById(id));
    }

    @PostMapping
    public ResponseEntity<DevelopmentWork> createWork(@RequestBody DevelopmentWork work) {
        return ResponseEntity.ok(service.createWork(work));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DevelopmentWork> updateWork(@PathVariable String id, @RequestBody DevelopmentWork work) {
        return ResponseEntity.ok(service.updateWork(id, work));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWork(@PathVariable String id) {
        service.deleteWork(id);
        return ResponseEntity.noContent().build();
    }
}
