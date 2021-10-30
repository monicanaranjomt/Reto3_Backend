/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3VN.Reto3VN.Modelo.Mascara;

import Reto3VN.Reto3VN.Modelo.Cliente;

/**
 *
 * @author Viviana Naranjo
 */
public class CountCliente {

    private Long total;
    private Cliente client;    

    public CountCliente(Long total, Cliente client) {
        this.total = total;
        this.client = client;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    
    }
