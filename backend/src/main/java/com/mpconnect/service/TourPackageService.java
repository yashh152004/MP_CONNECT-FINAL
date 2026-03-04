package com.mpconnect.service;

import com.mpconnect.entity.TourPackage;
import com.mpconnect.repository.TourPackageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TourPackageService {

    private final TourPackageRepository repository;

    public List<TourPackage> getAllPackages() {
        return repository.findAll();
    }

    public TourPackage getPackageById(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Package not found"));
    }

    public TourPackage createPackage(TourPackage pack) {
        pack.setId(UUID.randomUUID().toString());
        return repository.save(pack);
    }

    public TourPackage updatePackage(String id, TourPackage updated) {
        TourPackage pack = getPackageById(id);
        if (updated.getName() != null)
            pack.setName(updated.getName());
        if (updated.getDescription() != null)
            pack.setDescription(updated.getDescription());
        if (updated.getStatus() != null)
            pack.setStatus(updated.getStatus());
        return repository.save(pack);
    }

    public void deletePackage(String id) {
        repository.deleteById(id);
    }
}
