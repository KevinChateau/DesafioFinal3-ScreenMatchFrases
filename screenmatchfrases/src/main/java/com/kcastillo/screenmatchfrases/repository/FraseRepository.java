package com.kcastillo.screenmatchfrases.repository;

import com.kcastillo.screenmatchfrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface FraseRepository extends JpaRepository<Frase,Long> {

    //JPQL
    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    public Frase obtenerFraseAleatoria();
}
