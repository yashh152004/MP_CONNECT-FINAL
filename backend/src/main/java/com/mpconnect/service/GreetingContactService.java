package com.mpconnect.service;

import com.mpconnect.entity.GreetingContact;
import com.mpconnect.repository.GreetingContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GreetingContactService {

    private final GreetingContactRepository repository;

    public List<GreetingContact> getAllContacts() {
        return repository.findAll();
    }

    public GreetingContact getContactById(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Contact not found"));
    }

    public GreetingContact createContact(GreetingContact contact) {
        if (contact.getId() == null || contact.getId().isEmpty()) {
            contact.setId(UUID.randomUUID().toString());
        }
        return repository.save(contact);
    }

    public GreetingContact updateContact(String id, GreetingContact updated) {
        GreetingContact contact = getContactById(id);
        if (updated.getName() != null)
            contact.setName(updated.getName());
        if (updated.getDesignation() != null)
            contact.setDesignation(updated.getDesignation());
        if (updated.getEvent() != null)
            contact.setEvent(updated.getEvent());
        if (updated.getDate() != null)
            contact.setDate(updated.getDate());
        if (updated.getPhone() != null)
            contact.setPhone(updated.getPhone());
        if (updated.getEmail() != null)
            contact.setEmail(updated.getEmail());
        if (updated.getLastGreetedYear() != null)
            contact.setLastGreetedYear(updated.getLastGreetedYear());
        return repository.save(contact);
    }

    public void deleteContact(String id) {
        repository.deleteById(id);
    }
}
