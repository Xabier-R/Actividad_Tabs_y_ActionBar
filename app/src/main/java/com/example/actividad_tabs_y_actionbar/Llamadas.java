package com.example.actividad_tabs_y_actionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Llamadas {
    private Contactos contacto;
    private String hora;
    private int IDdireccion;


    public Llamadas(Contactos contacto, String hora, int direccion) {
        this.contacto = contacto;
        this.hora = hora;
        this.IDdireccion = direccion;
    }


    public Contactos getContacto() {
        return contacto;
    }

    public void setContacto(Contactos contacto) {
        this.contacto = contacto;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getIDDireccion() {
        return IDdireccion;
    }

    public void setIDDireccion(int direccion) {
        this.IDdireccion = direccion;
    }
}

