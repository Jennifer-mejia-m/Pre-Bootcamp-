package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Usuario;
import com.example.demo.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //visualizar todos los usuarios

    public List<Usuario>showAll() {
        return usuarioRepository.findAll();
    }

    //visualizar usuario por id

    public Usuario findUsuario(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    //crear nuevo usuario

    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    //actualizar usuario

    public Usuario updatedUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    //eliminar usuario

    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
    
}
