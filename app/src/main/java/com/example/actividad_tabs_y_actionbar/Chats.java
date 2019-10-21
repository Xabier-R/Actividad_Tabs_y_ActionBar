package com.example.actividad_tabs_y_actionbar;

public class Chats {
    private String nombre;
    private String estado;
    private int IDfoto;

    public Chats(String nombre, String estado, int foto) {
        this.nombre = nombre;
        this.estado = estado;
        this.IDfoto = foto;
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

    public int getFoto() {
        return IDfoto;
    }

    public void setFoto(int foto) {
        this.IDfoto = foto;
    }
}
