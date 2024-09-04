package com.example.demo.repository;

import com.example.demo.model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Esta interfaz maneja las operaciones CRUD para la entidad Usuario

@Repository
public interface UsuarioRepository extends JpaRepository<usuario, Long> {

    // Encuentra un usuario por su nombre de usuario
    usuario findByNombreUsuario(String nombreUsuario);
}