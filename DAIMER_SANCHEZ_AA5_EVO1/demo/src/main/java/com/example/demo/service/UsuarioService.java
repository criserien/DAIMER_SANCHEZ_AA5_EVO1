package com.example.demo.service;

import com.example.demo.model.usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Esta clase contiene la lógica de negocio para la gestión de usuarios
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Registra un nuevo usuario en la base de datos
    public usuario registrarUsuario(usuario usuario) {
        // Aquí podrías agregar validaciones antes de registrar el usuario
        return usuarioRepository.save(usuario);
    }

    // Método para autenticar a un usuario
    public String autenticarUsuario(String nombreUsuario, String password) {
        usuario usuario = usuarioRepository.findByNombreUsuario(nombreUsuario);
        if (usuario != null && usuario.getPassword().equals(password)) {
            return "Autenticación satisfactoria";
        } else {
            return "Error en la autenticación";
        }
    }
}