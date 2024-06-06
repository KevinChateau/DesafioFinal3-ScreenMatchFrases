package com.kcastillo.screenmatchfrases.dto;

public record FraseDTO(
         String titulo,
         String frase,
         String personaje, //Quien citó la frase
         String poster

) {
}
