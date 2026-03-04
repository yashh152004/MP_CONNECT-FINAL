package com.mpconnect.service;

import com.mpconnect.entity.Letter;
import com.mpconnect.repository.LetterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LetterService {

    private final LetterRepository repository;

    public List<Letter> getAllLetters() {
        return repository.findAll();
    }

    public Letter getLetterById(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Letter not found"));
    }

    public Letter createLetter(Letter letter) {
        letter.setId(UUID.randomUUID().toString());
        letter.setCreatedAt(LocalDateTime.now());
        letter.setUpdatedAt(LocalDateTime.now());
        if (letter.getVersion() == null) {
            letter.setVersion(1);
        }
        return repository.save(letter);
    }

    public Letter updateLetter(String id, Letter updatedLetter) {
        Letter letter = getLetterById(id);
        if (updatedLetter.getType() != null)
            letter.setType(updatedLetter.getType());
        if (updatedLetter.getDepartment() != null)
            letter.setDepartment(updatedLetter.getDepartment());
        if (updatedLetter.getTitle() != null)
            letter.setTitle(updatedLetter.getTitle());
        if (updatedLetter.getContent() != null)
            letter.setContent(updatedLetter.getContent());
        if (updatedLetter.getStatus() != null)
            letter.setStatus(updatedLetter.getStatus());
        if (updatedLetter.getTags() != null)
            letter.setTags(updatedLetter.getTags());
        if (updatedLetter.getAttachmentUrl() != null)
            letter.setAttachmentUrl(updatedLetter.getAttachmentUrl());
        letter.setVersion(letter.getVersion() + 1);
        letter.setUpdatedAt(LocalDateTime.now());
        return repository.save(letter);
    }

    public void deleteLetter(String id) {
        repository.deleteById(id);
    }
}
