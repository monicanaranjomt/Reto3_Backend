/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3VN.Reto3VN.Modelo.Mascara;

/**
 *
 * @author Viviana Naranjo
 */
public class StatusReservacion {
 
    
    private int completed;
    private int cancelled;

    public StatusReservacion(int completed, int cancelled) {
        this.completed = completed;
        this.cancelled = cancelled;
    }
    
    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public int getCancelled() {
        return cancelled;
    }

    public void setCancelled(int cancelled) {
        this.cancelled = cancelled;
    }
    
    
}
