/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.litiodos.Datos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author soporte
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LibroDatos {
    private String titulo;
    private String autor;
    
    
    
/*
    //@NoArgsConstructor
    public LibroDatos(){

    }
    
    //@AllArgsConstructor
    public LibroDatos(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
    }
    
    //getters
    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    */
    
}


