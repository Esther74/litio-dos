/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.litiodos.Entidades;

/**
 *
 * @author soporte
 */


public class LibroEntidad {
    
    private Long id;
    private String titulo;
    private String autor;
    
    //Constructor
    public LibroEntidad(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
}
