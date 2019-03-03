package com.example.demo.bootstrap;

import com.example.demo.domain.Note;
import com.example.demo.repositories.NoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final NoteRepository noteRepository;

    public BootstrapData(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading Notes data");

        Note n1 = new Note();
        n1.setBody("Pick up Milk!");
        noteRepository.save(n1);

        Note n2 = new Note();
        n2.setBody("Ask Larry about the TPS reports.");
        noteRepository.save(n2);

        Note n3 = new Note();
        n3.setBody("Back up hard drive.");
        noteRepository.save(n3);

        System.out.println("Notes saved: " + noteRepository.count());
    }

}
