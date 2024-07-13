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

    public Long getId() { return Id; }
    public void setId(Long id) { Id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public List<String> getIdiomas() { return idiomas; }
    public void setIdiomas(List<String> idiomas) { this.idiomas = idiomas; }

    public Integer getNumeroDescargas() { return numeroDescargas; }
    public void setNumeroDescargas(Integer numeroDescargas) { this.numeroDescargas = numeroDescargas; }

    public List<Autor> getAutores() { return autores; }
    public void setAutores(List<Autor> autores) { this.autores = autores; }
}
