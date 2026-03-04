package com.mpconnect.controller;

import com.mpconnect.entity.GreetingContact;
import com.mpconnect.service.GreetingContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/greetings")
@RequiredArgsConstructor
public class GreetingContactController {

    private final GreetingContactService service;

    @GetMapping
    public ResponseEntity<List<GreetingContact>> getAllContacts() {
        return ResponseEntity.ok(service.getAllContacts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GreetingContact> getContact(@PathVariable String id) {
        return ResponseEntity.ok(service.getContactById(id));
    }

    @PostMapping
    public ResponseEntity<GreetingContact> createContact(@RequestBody GreetingContact contact) {
        return ResponseEntity.ok(service.createContact(contact));
    }

    @PutMapping("/{id}")
    public ResponseEntity<GreetingContact> updateContact(@PathVariable String id,
            @RequestBody GreetingContact contact) {
        return ResponseEntity.ok(service.updateContact(id, contact));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable String id) {
        service.deleteContact(id);
        return ResponseEntity.noContent().build();
    }
}
