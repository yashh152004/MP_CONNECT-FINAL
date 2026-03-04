package com.mpconnect.controller;

import com.mpconnect.entity.TourProgram;
import com.mpconnect.service.TourProgramService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tour-programs")
@RequiredArgsConstructor
public class TourProgramController {

    private final TourProgramService service;

    @GetMapping
    public ResponseEntity<List<TourProgram>> getAllPrograms() {
        return ResponseEntity.ok(service.getAllPrograms());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TourProgram> getProgram(@PathVariable String id) {
        return ResponseEntity.ok(service.getProgramById(id));
    }

    @PostMapping
    public ResponseEntity<TourProgram> createProgram(@RequestBody TourProgram program) {
        return ResponseEntity.ok(service.createProgram(program));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TourProgram> updateProgram(@PathVariable String id, @RequestBody TourProgram program) {
        return ResponseEntity.ok(service.updateProgram(id, program));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProgram(@PathVariable String id) {
        service.deleteProgram(id);
        return ResponseEntity.noContent().build();
    }
}
