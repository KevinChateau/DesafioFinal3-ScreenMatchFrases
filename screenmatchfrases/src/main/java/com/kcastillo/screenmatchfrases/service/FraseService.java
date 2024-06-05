package com.kcastillo.screenmatchfrases.service;

import com.kcastillo.screenmatchfrases.dto.FraseDTO;
import com.kcastillo.screenmatchfrases.model.Frase;
import com.kcastillo.screenmatchfrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;


    public List<FraseDTO> obtenerFrases() {
        List<Frase> frases = repository.findAll();
        return frases.stream()
                .map(f -> new FraseDTO(f.getTitulo(), f.getFrase(), f.getPersonaje(), f.getPoster()))
                .collect(Collectors.toList());
    }

}
