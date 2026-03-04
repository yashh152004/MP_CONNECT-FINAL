package com.mpconnect.controller;

import com.mpconnect.entity.Letter;
import com.mpconnect.service.LetterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/letters")
@RequiredArgsConstructor
public class LetterController {

    private final LetterService service;

    @GetMapping
    public ResponseEntity<List<Letter>> getAllLetters() {
        return ResponseEntity.ok(service.getAllLetters());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Letter> getLetter(@PathVariable String id) {
        return ResponseEntity.ok(service.getLetterById(id));
    }

    @PostMapping
    public ResponseEntity<Letter> createLetter(@RequestBody Letter letter) {
        return ResponseEntity.ok(service.createLetter(letter));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Letter> updateLetter(@PathVariable String id, @RequestBody Letter letter) {
        return ResponseEntity.ok(service.updateLetter(id, letter));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLetter(@PathVariable String id) {
        service.deleteLetter(id);
        return ResponseEntity.noContent().build();
    }
}
