/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3VN.Reto3VN.Repositorio;

import Reto3VN.Reto3VN.Interface.InterfaceRoom;
import Reto3VN.Reto3VN.Modelo.Room;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Viviana Naranjo
 */
@Repository
public class RepositorioRoom {
    
    @Autowired
    private InterfaceRoom crud;

    public List<Room> getAll(){
        return (List<Room>) crud.findAll();
    }

    public Optional<Room> getRoom(int id){
        return crud.findById(id);
    }

    public Room save(Room room){
        return crud.save(room);
    }
    public void delete(Room room){
        crud.delete(room);
    }
    
}
