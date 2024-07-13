package com.aluracursos.literalura.modelos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLista(
    @JsonAlias("count") Integer numeroResultados,
    @JsonAlias("results") List<DatosLibro> libros
) {}
