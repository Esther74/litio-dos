/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.litiodos.Repositorios;

import com.example.litiodos.Entidades.LibroEntidad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author soporte
 */

@Repository
public interface LibroRepositorio extends JpaRepository <LibroEntidad, Long>{
    List<LibroEntidad> findAllByTitulo(String titulo);
    
    
    
}
