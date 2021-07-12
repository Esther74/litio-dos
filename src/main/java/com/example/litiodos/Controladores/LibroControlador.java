/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.litiodos.Controladores;

import com.example.litiodos.Datos.LibroDatos;
import com.example.litiodos.Entidades.LibroEntidad;
import com.example.litiodos.Servicio.LibroServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8080/libros/get
 * [{"titulo":"El jardin olvidado","autor":"Kate Morton"},
    {"titulo":"El mundo y sus demonios","autor":"Carl Sagan"}]
 * 
 * 
 * en resources: data.sql
 * insert into  libros (id,titulo,autor) values (1,'El mundo y sus demonios','Carl Sagan');
   insert into  libros (id,titulo,autor) values (2,'El jardin olvidado','Kate Morton');
 */

@RestController
@RequestMapping("/libros")

public class LibroControlador {
    
    @Autowired
    private LibroServicio libroServicio;
    
    
     /*@GetMapping("/")
     public String saludo(){
         return ("Bienvenidos a libros");
     }*/
     
     @GetMapping("/get")
     public List<LibroDatos> getLibros(){
         return libroServicio.getLibros();
         //devuelve 200
     }
     
     //{"titulo":"el fuego invisible","autor":"javier sierra"}
    @RequestMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    //Expected status code <201> but was <200>.
    //ahora mismo lo que devuelve es 201
    public LibroEntidad addLibro(@RequestBody LibroDatos libroDatos){
        
        
       LibroEntidad newLibroEntidad = libroServicio.addLibro(libroDatos);
       return newLibroEntidad;
    }
    
}
