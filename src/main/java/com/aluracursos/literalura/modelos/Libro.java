package com.aluracursos.literalura.modelos;

import java.util.List;

public class Libro {
    private String titulo;
    private List<DatosAutor> autor;
    private List<String> idiomas;
    private Integer numeroDescargas;

    public Libro(DatosLibro datosLibro) {
        this.titulo = datosLibro.titulo();
        this.autor = datosLibro.autor();
        this.idiomas = datosLibro.idiomas();
        this.numeroDescargas = datosLibro.numeroDescargas();
    }

    @Override
    public String toString() {
        return  "----- LIBRO -----\n"+
                " Título: "+titulo+"\n"+
                " Autor: "+"\n"+
                " Idioma: "+idiomas+"\n"+
                " Numero de descargas: "+numeroDescargas+"\n"+
                "-----------------\n";
    }
}
