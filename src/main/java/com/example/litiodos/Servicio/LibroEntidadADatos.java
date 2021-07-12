/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.litiodos.Servicio;

import com.example.litiodos.Datos.LibroDatos;
import com.example.litiodos.Entidades.LibroEntidad;
import org.springframework.stereotype.Component;

/**
 *
 * @author soporte
 */


@Component
public class LibroEntidadADatos {
    
    public LibroDatos toResponse(LibroEntidad libroEntidad){
        return new LibroDatos(libroEntidad.getTitulo(), libroEntidad.getAutor());
    }
    
    public LibroEntidad toEntidad(LibroDatos libroDatos){
        return new LibroEntidad(libroDatos.getTitulo(), libroDatos.getAutor());
    }
}
