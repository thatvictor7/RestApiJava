package com.example.demo.controllers;

import com.example.demo.domain.Note;
import com.example.demo.services.NoteServices;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(NoteControllers.BASE_URL)
public class NoteControllers {

    public static final String BASE_URL = "/api/notes";

    private final NoteServices noteServices;

    public NoteControllers(NoteServices noteServices) {
        this.noteServices = noteServices;
    }

    @GetMapping
    List<Note> getAllNotes() {
        return noteServices.findAllNotes();

    }@GetMapping("/{id}")
    public Note getNotesById(@PathVariable Long id) {
        return noteServices.findNoteById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Note saveNote(@RequestBody Note note) {
        return noteServices.saveNote(note);
    }
}
