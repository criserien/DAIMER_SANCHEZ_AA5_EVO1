package com.example.demo.controller;

import com.example.demo.model.usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Endpoint para registrar un nuevo usuario
    @PostMapping("/registro")
    public ResponseEntity<usuario> registrarUsuario(@RequestBody usuario usuario) {
        usuario nuevoUsuario = usuarioService.registrarUsuario(usuario);
        return new ResponseEntity<>(nuevoUsuario, HttpStatus.CREATED);
    }

    // Endpoint para autenticar a un usuario
    @PostMapping("/login")
    public ResponseEntity<String> autenticarUsuario(@RequestParam String nombreUsuario, @RequestParam String password) {
        String mensaje = usuarioService.autenticarUsuario(nombreUsuario, password);
        if ("Autenticación satisfactoria".equals(mensaje)) {
            return new ResponseEntity<>(mensaje, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(mensaje, HttpStatus.UNAUTHORIZED);
        }
    }
}