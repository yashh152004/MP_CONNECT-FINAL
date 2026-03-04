package com.mpconnect.controller;

import com.mpconnect.entity.Complaint;
import com.mpconnect.service.ComplaintService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/complaints")
@RequiredArgsConstructor
public class ComplaintController {

    private final ComplaintService service;

    @GetMapping
    public ResponseEntity<List<Complaint>> getAllComplaints() {
        return ResponseEntity.ok(service.getAllComplaints());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Complaint> getComplaint(@PathVariable String id) {
        return ResponseEntity.ok(service.getComplaintById(id));
    }

    @PostMapping
    public ResponseEntity<Complaint> createComplaint(@RequestBody Complaint complaint) {
        return ResponseEntity.ok(service.createComplaint(complaint));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Complaint> updateComplaint(@PathVariable String id, @RequestBody Complaint complaint) {
        return ResponseEntity.ok(service.updateComplaint(id, complaint));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteComplaint(@PathVariable String id) {
        service.deleteComplaint(id);
        return ResponseEntity.noContent().build();
    }
}
