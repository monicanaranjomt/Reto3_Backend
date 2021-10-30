/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto3VN.Reto3VN.Interface;

import Reto3VN.Reto3VN.Modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Viviana Naranjo
 */
public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer>{
    
}
