package com.mpconnect.service;

import com.mpconnect.entity.Complaint;
import com.mpconnect.repository.ComplaintRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ComplaintService {

    private final ComplaintRepository repository;

    public List<Complaint> getAllComplaints() {
        return repository.findAll();
    }

    public Complaint getComplaintById(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Complaint not found"));
    }

    public Complaint createComplaint(Complaint complaint) {
        complaint.setId(UUID.randomUUID().toString());
        complaint.setCreatedAt(LocalDateTime.now());
        if (complaint.getStatus() == null) {
            complaint.setStatus("New");
        }
        return repository.save(complaint);
    }

    public Complaint updateComplaint(String id, Complaint updatedComplaint) {
        Complaint complaint = getComplaintById(id);
        if (updatedComplaint.getCategory() != null)
            complaint.setCategory(updatedComplaint.getCategory());
        if (updatedComplaint.getLocation() != null)
            complaint.setLocation(updatedComplaint.getLocation());
        if (updatedComplaint.getDescription() != null)
            complaint.setDescription(updatedComplaint.getDescription());
        if (updatedComplaint.getStatus() != null)
            complaint.setStatus(updatedComplaint.getStatus());
        if (updatedComplaint.getPriority() != null)
            complaint.setPriority(updatedComplaint.getPriority());
        if (updatedComplaint.getAssignedTo() != null)
            complaint.setAssignedTo(updatedComplaint.getAssignedTo());
        if (updatedComplaint.getStaffNotes() != null)
            complaint.setStaffNotes(updatedComplaint.getStaffNotes());
        if (updatedComplaint.getPaInstructions() != null)
            complaint.setPaInstructions(updatedComplaint.getPaInstructions());
        return repository.save(complaint);
    }

    public void deleteComplaint(String id) {
        repository.deleteById(id);
    }
}
