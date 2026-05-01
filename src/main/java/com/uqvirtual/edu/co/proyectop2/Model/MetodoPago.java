package com.uqvirtual.edu.co.proyectop2.Model;

import com.uqvirtual.edu.co.proyectop2.Enums.MetodosPAgo;

public class MetodoPago {
    private String idMetodoPago;
    private MetodosPAgo tipo;
    private String numero;
    private String titular;
    private Usuario usuario;

    public MetodoPago(){
    }

    public MetodoPago(String idMetodoPago, MetodosPAgo tipo, String numero, String titular, Usuario usiario){
        this.idMetodoPago = idMetodoPago;
        this.tipo = tipo;
        this.numero = numero;
        this.titular = titular;
        this.usuario = usiario;
    }

    //getter y setter

    public String getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(String idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public MetodosPAgo getTipo() {
        return tipo;
    }

    public void setTipo(MetodosPAgo tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
