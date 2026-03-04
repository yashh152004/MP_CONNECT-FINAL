package com.mpconnect.service;

import com.mpconnect.entity.Contact;
import com.mpconnect.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ContactService {

    private final ContactRepository repository;

    public List<Contact> getAllContacts() {
        return repository.findAll();
    }

    public Contact getContactById(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Contact not found"));
    }

    public Contact createContact(Contact contact) {
        contact.setId(UUID.randomUUID().toString());
        return repository.save(contact);
    }

    public Contact updateContact(String id, Contact updated) {
        Contact contact = getContactById(id);
        if (updated.getName() != null)
            contact.setName(updated.getName());
        if (updated.getDesignation() != null)
            contact.setDesignation(updated.getDesignation());
        if (updated.getOrganization() != null)
            contact.setOrganization(updated.getOrganization());
        if (updated.getMobile() != null)
            contact.setMobile(updated.getMobile());
        if (updated.getEmail() != null)
            contact.setEmail(updated.getEmail());
        if (updated.getWhatsapp() != null)
            contact.setWhatsapp(updated.getWhatsapp());
        if (updated.getCategory() != null)
            contact.setCategory(updated.getCategory());
        if (updated.getIsVip() != null)
            contact.setIsVip(updated.getIsVip());
        if (updated.getVillage() != null)
            contact.setVillage(updated.getVillage());

        return repository.save(contact);
    }

    public void deleteContact(String id) {
        repository.deleteById(id);
    }
}
