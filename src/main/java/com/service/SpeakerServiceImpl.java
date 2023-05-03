package com.service;

import com.model.Speaker;
import com.repository.HibernateSpeakerRepositoryImpl;
import com.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;
    public SpeakerServiceImpl() {
        System.out.println("No args constructor");
    }
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("Repository constructor");
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    @Autowired // this will automatically inject the SpeakerRepository bean into that setter - ila dernaha fo9 constructor awyli 3endna constructor injection   
    public void setRepository(SpeakerRepository repository) {
        System.out.println("Repository Setter");
        this.repository = repository;
    }
}
