/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto3VN.Reto3VN.Interface;

import Reto3VN.Reto3VN.Modelo.Reservaciones;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Viviana Naranjo
 */
public interface InterfaceReservaciones extends CrudRepository<Reservaciones,Integer>{

    
@Query("select c.client, COUNT(c.client) from Reservaciones AS c group by c.client order by COUNT(c.client) desc")
public List<Object[]> countTotalReservacionesByClient(); 

public List<Reservaciones> findAllByStartDateAfterAndStartDateBefore(Date dateOne,Date dateTwo);

public List<Reservaciones> findAllByStatus(String status);
}

