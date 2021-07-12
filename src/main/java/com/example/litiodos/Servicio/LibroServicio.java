/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.litiodos.Servicio;

import com.example.litiodos.Datos.LibroDatos;
import com.example.litiodos.Entidades.LibroEntidad;
import com.example.litiodos.Repositorios.LibroRepositorio;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author soporte
 */

@Service
public class LibroServicio {
    @Autowired
    private LibroRepositorio libroRepositorio;
    
   
    @Autowired
    private LibroEntidadADatos libroEntidadADatos;
    
    // private final LibroEntidadADatos libroEntidadADatos = new LibroEntidadADatos();
    
    public List<LibroDatos> getLibros(){
        return libroRepositorio.findAll()
                .stream()
                .map(libroEntidadADatos::toResponse)
                .collect(Collectors.toList());
        
    }
    
    
    /* public List<LibroDatos> getLibros(){
        return libroRepositorio.findAll()
                .stream()
                .map(libroEntidad->{return libroEntidadADatos.toResponse(libroEntidad);})
                .collect(Collectors.toList());
    } */
    
    
    public LibroEntidad addLibro(LibroDatos libroDatos){
        final LibroEntidad newlibroEntidad = libroEntidadADatos.toEntidad(libroDatos);
        libroRepositorio.save(newlibroEntidad);
        return newlibroEntidad;
    }
    
    /*public LibroDatos findIdLibroEntidad(LibroDatos libroDatos){
        LibroEntidad findLibroEntidad = libroEntidadADatos.toEntidad(libroDatos);
        Optional <LibroEntidad> fE = libroRepositorio.findById(findLibroEntidad.getId());
        
        
    }*/
    
}
