package com.mpconnect.service;

import com.mpconnect.entity.Destination;
import com.mpconnect.repository.DestinationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DestinationService {

    private final DestinationRepository repository;

    public List<Destination> getAllDestinations() {
        return repository.findAll();
    }

    public Destination getDestinationById(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Destination not found"));
    }

    public Destination createDestination(Destination dest) {
        dest.setId(UUID.randomUUID().toString());
        return repository.save(dest);
    }

    public Destination updateDestination(String id, Destination updated) {
        Destination dest = getDestinationById(id);
        if (updated.getName() != null)
            dest.setName(updated.getName());
        if (updated.getDistrict() != null)
            dest.setDistrict(updated.getDistrict());
        if (updated.getBlock() != null)
            dest.setBlock(updated.getBlock());
        if (updated.getVillage() != null)
            dest.setVillage(updated.getVillage());
        if (updated.getContactPerson() != null)
            dest.setContactPerson(updated.getContactPerson());
        if (updated.getContactPhone() != null)
            dest.setContactPhone(updated.getContactPhone());
        if (updated.getAccessibility() != null)
            dest.setAccessibility(updated.getAccessibility());
        return repository.save(dest);
    }

    public void deleteDestination(String id) {
        repository.deleteById(id);
    }
}
