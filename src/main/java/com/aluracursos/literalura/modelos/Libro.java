package com.aluracursos.literalura.modelos;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(unique = true)
    private String titulo;

    private List<String> idiomas;
    private Integer numeroDescargas;
    @Transient
    private List<Autor> autores;

    public Libro(DatosLibro datosLibro) {
        this.titulo = datosLibro.titulo();
        this.idiomas = datosLibro.idiomas();
        this.numeroDescargas = datosLibro.numeroDescargas();
    }

    @Override
    public String toString() {
        return  "----- LIBRO -----\n"+
                " Título: "+titulo+"\n"+
                " Autor: "+"\n"+autores+
                " Idioma: "+idiomas+"\n"+
                " Numero de descargas: "+numeroDescargas+"\n"+
                "-----------------\n";
    }
}
