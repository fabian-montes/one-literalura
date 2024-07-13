package com.aluracursos.literalura.principal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.aluracursos.literalura.modelos.DatosLibro;
import com.aluracursos.literalura.modelos.DatosLista;
import com.aluracursos.literalura.modelos.Libro;
import com.aluracursos.literalura.servicio.ConsumoApi;
import com.aluracursos.literalura.servicio.ConvierteDatos;

public class Principal {
    private String URL = "https://gutendex.com";
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("Elige la opción a través de su número:");
        System.out.println("1- buscar libro por título");
        // System.out.println("2- listar libros registrados");
        // System.out.println("3- listar autores registrados");
        // System.out.println("4- listar autores vivos en un determinado año");
        // System.out.println("5- listar libros por idioma");
        // System.out.println("0- salir");
        buscarLibro();
    }

    private void buscarLibro() {
        System.out.println("Ingrese el nombre del libro que desea buscar");
        String nombreLibro = scanner.nextLine().replace(" ", "%20");

        ConsumoApi consumoApi = new ConsumoApi();
		var json = consumoApi.obtenerDatos(URL+"/books/?search="+nombreLibro);
		// System.out.println(json);

		ConvierteDatos conversor = new ConvierteDatos();
        DatosLista datos = conversor.obtenerDatos(json, DatosLista.class);
        // System.out.println(datos);
        
        List<DatosLibro> datosLibro = datos.libros();

        List<Libro> libros = new ArrayList<>();
        libros = datosLibro.stream()
                .map(d -> new Libro(d))
                .limit(1)
                .collect(Collectors.toList());
        
        libros.stream()
        .forEach(System.out::println);
    }
}
