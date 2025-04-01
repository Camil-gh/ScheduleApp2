package com.scheduleapp.services;

import com.scheduleapp.model.Kierunki;
import com.scheduleapp.repository.KierunkiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KierunkiService {

    @Autowired
    private KierunkiRepository kierunkiRepository;

    public List<Kierunki> getAllKierunki() {
        return kierunkiRepository.findAll();
    }
}
