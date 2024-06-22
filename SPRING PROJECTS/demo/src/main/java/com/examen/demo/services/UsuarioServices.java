package com.examen.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examen.demo.models.Usuario;
import com.examen.demo.repositories.UsuarioRepository;

@Service
public class UsuarioServices {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServices(UsuarioRepository usuarioRepository) {
        this.usuarioRepository=usuarioRepository;
    }

    //visualizar todos los usuarios

    public List<Usuario>viewList(){
        return usuarioRepository.findAll();
    }

    //visualizar usuario por Id

    public Usuario findUsuario(Long id){
        return usuarioRepository.findById(id).orElse(null);
    }

    //crear nuevo usuario

    public Usuario createUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //actualizar usuario

    public Usuario updateUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //eliminar usuario

    public void deleteUsuario(Long id){
        usuarioRepository.deleteById(id);
    }
    
}
