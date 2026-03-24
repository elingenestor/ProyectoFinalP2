package com.uqvirtual.edu.co.proyectop2.Model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String idUsuario;
    private String nombreCompleto;
    private String email;   //Debe ser unico
    private String password;
    private String telefono;
    private List<MetodoPago> metodosPago;
    private List<Compra> compras;

    public Usuario (){
        this.metodosPago = new ArrayList<>();
        this.compras = new ArrayList<>();
    }

    public Usuario (String idUsuario, String nombreCompleto, String email, String password){
        this.idUsuario = idUsuario;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
    }

    public List<MetodoPago> getMetodosPago(){
        return metodosPago;
    }
}
