package com.example.demo.services;

import com.example.demo.domain.Note;

import java.util.List;

public interface NoteServices {

    Note findNoteById(Long id);

    List<Note> findAllNotes();

    Note saveNote(Note note);

}
