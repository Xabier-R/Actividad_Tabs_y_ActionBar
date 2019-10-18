package com.example.actividad_tabs_y_actionbar;


public class Contactos {
    private String nombre;
    private String estado;
    private int numero;
    private String foto;



    public Contactos(String nombre, String estado, int numero, String foto)
    {
        this.nombre=nombre;
        this.estado=estado;
        this.numero=numero;
        this.foto=foto;


    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
