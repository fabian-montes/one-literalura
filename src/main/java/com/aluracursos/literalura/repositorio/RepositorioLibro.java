package com.aluracursos.literalura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aluracursos.literalura.modelos.Libro;

public interface RepositorioLibro extends JpaRepository<Libro, Long> {

}
