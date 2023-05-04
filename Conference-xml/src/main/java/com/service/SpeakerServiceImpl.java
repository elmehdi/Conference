package com.service;

import com.model.Speaker;
import com.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;
    public SpeakerServiceImpl(){

    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        this.repository = speakerRepository ;
    }
    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
