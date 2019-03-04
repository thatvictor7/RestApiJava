package com.example.demo.services;

import com.example.demo.domain.Note;
import com.example.demo.repositories.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServicesImpl implements NoteServices {

    private final NoteRepository noteRepository;

    public NoteServicesImpl(NoteRepository repository) {
        this.noteRepository = repository;
    }

    @Override
    public Note findNoteById(Long id) {
        return noteRepository.findById(id).get();
    }

    @Override
    public List<Note> findAllNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

//    @Override
//    public List<Note> findbyQuery(String query) {
//        System.out.println(noteRepository);
//        return noteRepository.findAll();
//    }
//    @Override
//    public Note findbyQuery(String string) {
//        return noteRepository.findOne(string).get();

//    }
}
