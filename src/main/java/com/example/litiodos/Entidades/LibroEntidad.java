/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.litiodos.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author soporte
 */

@Entity
@NoArgsConstructor
@Getter
@Table(name="LIBROS") //data.sql en resources
public class LibroEntidad {
    
    @Id
    //esto dejarlo comentado @GeneratedValue
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String titulo;
    
    @Column
    private String autor;
    
    //Constructor
    public LibroEntidad(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
}
