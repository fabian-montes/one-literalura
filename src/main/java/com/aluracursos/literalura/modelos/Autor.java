package com.aluracursos.literalura.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Integer fechaNacimiento;
    private Integer fechaMuerte;
    private String nombre;
    
    public Autor(DatosAutor datosAutor) {
        fechaNacimiento = datosAutor.fechaNacimiento();
        fechaMuerte = datosAutor.fechaMuerte();
        nombre = datosAutor.nombre();
    }

    public Integer getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Integer fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    
    public Integer getFechaMuerte() { return fechaMuerte; }
    public void setFechaMuerte(Integer fechaMuerte) { this.fechaMuerte = fechaMuerte; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
        
    @Override
    public String toString() { return nombre; }
}
