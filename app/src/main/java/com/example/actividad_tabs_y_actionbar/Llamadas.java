package com.example.actividad_tabs_y_actionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Llamadas {
    private Contactos contacto;
    private String hora;
    private String direccion;


    public Llamadas(Contactos contacto, String hora, String direccion) {
        this.contacto = contacto;
        this.hora = hora;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

