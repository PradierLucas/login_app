package com.example.random.modelos;

import java.io.Serializable;

public class Usuario implements Serializable {
    String nombre_usuario;
    String clave;

    public Usuario() {
    }

    public Usuario(String nombre_usuario, String clave) {
        this.nombre_usuario = nombre_usuario;
        this.clave = clave;

    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre_usuario='" + nombre_usuario + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }
}
