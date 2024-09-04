package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Esta clase representa a un Usuario en el sistema
@Entity
public class usuario {

    // Identificador único para cada usuario
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre de usuario para la autenticación
    private String nombreUsuario;

    // Contraseña para la autenticación
    private String password;

    // Constructores, getters y setters

    public usuario() {}

    public usuario(String nombreUsuario, String password) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}