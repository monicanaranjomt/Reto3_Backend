/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3VN.Reto3VN.Servicios;

import Reto3VN.Reto3VN.Modelo.Mascara.CountCliente;
import Reto3VN.Reto3VN.Modelo.Mascara.StatusReservacion;
import Reto3VN.Reto3VN.Modelo.Reservaciones;
import Reto3VN.Reto3VN.Repositorio.RepositorioReservaciones;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Viviana Naranjo
 */
@Service
public class ServiciosReservaciones {
     @Autowired
    private RepositorioReservaciones metodosCrud;

    public List<Reservaciones> getAll(){
        return metodosCrud.getAll();
    }

    public Optional<Reservaciones> getReservation(int reservationId) {
        return metodosCrud.getReservation(reservationId);
    }

    public Reservaciones save(Reservaciones reservation){
        if(reservation.getIdReservation()==null){
            return metodosCrud.save(reservation);
        }else{
            Optional<Reservaciones> e= metodosCrud.getReservation(reservation.getIdReservation());
            if(e.isEmpty()){
                return metodosCrud.save(reservation);
            }else{
                return reservation;
            }
        }
    }

    public Reservaciones update(Reservaciones reservation){
        if(reservation.getIdReservation()!=null){
            Optional<Reservaciones> e= metodosCrud.getReservation(reservation.getIdReservation());
            if(!e.isEmpty()){

                if(reservation.getStartDate()!=null){
                    e.get().setStartDate(reservation.getStartDate());
                }
                if(reservation.getDevolutionDate()!=null){
                    e.get().setDevolutionDate(reservation.getDevolutionDate());
                }
                if(reservation.getStatus()!=null){
                    e.get().setStatus(reservation.getStatus());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return reservation;
            }
        }else{
            return reservation;
        }
    }

    public boolean deleteReservation(int reservationId) {
        Boolean aBoolean = getReservation(reservationId).map(reservation -> {
            metodosCrud.delete(reservation);
            return true;
        }).orElse(false);
        return aBoolean;
    }

    public List<CountCliente> getTopClientes(){
    return metodosCrud.getTopClientes();
    }

    public StatusReservacion getStatusReport(){
        List<Reservaciones> completed=metodosCrud.getReservacionesByStatus("completed");
        List<Reservaciones> cancelled=metodosCrud.getReservacionesByStatus("cancelled");

        StatusReservacion descAmt=new StatusReservacion(completed.size(),cancelled.size());
        return descAmt;
    }
    public List<Reservaciones> getReservacionesPeriod(String d1, String d2){

        // yyyy-MM-dd
        SimpleDateFormat parser=new SimpleDateFormat("yyyy-MM-dd");
        Date dateOne=new Date();
        Date dateTwo=new Date();
        try {
            dateOne=parser.parse(d1);
            dateTwo=parser.parse(d2);
        }catch (ParseException e) {
            e.printStackTrace();
        }
        if(dateOne.before(dateTwo)){
            return metodosCrud.getReservacionesPeriod(dateOne,dateTwo);
        }else{
            return new ArrayList<>();
        }
    }
}
