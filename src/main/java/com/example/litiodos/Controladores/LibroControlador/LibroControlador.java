/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.litiodos.Controladores.LibroControlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author soporte
 */

@RestController
@RequestMapping("/")

public class LibroControlador {
    
    
     @GetMapping("/")
     public String saludo(){
         return ("Bienvenidos");
     }
    
}
