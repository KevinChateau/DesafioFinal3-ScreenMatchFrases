package com.kcastillo.screenmatchfrases.repository;

import com.kcastillo.screenmatchfrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase,Long> {

}
