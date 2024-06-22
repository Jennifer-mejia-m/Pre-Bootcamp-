package com.examen.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.examen.demo.models.Usuario;
import com.examen.demo.services.UsuarioServices;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@AllArgsConstructor
@RequestMapping("/usuarios")
public class UsuarioApi {
    
    private final UsuarioServices usuarioServices;

//visualizar todos los usuarios

@GetMapping("")
public List<Usuario> showAll(){
    return usuarioServices.viewList();
}

//visualizar por id

@GetMapping("/{id}")
public Usuario findBy(@PathVariable("id")Long id){
    return usuarioServices.findUsuario(id);
}

//crear usuario

@PostMapping("/new")
public Usuario crearUsuario(
    @RequestParam(value="nombre")String nombre,
    @RequestParam(value="email")String email,
    @RequestParam(value="contraseña")String contraseña){
        Usuario usuario = new Usuario(nombre,email, contraseña, null);
    return usuarioServices.createUsuario(usuario);
}

//actualizar usuario   

@PutMapping("/{id}")
public Usuario actualizarUsuario(@PathVariable("id")Long id,
    @RequestParam(value="nombre")String nombre,
    @RequestParam(value="email")String email,
    @RequestParam(value="contraseña")String contraseña) {
        Usuario usuario = new Usuario(nombre, email, contraseña, null);
        usuario.setId(id);
    return usuarioServices.updateUsuario(usuario);
}

//eliminar usuario

@DeleteMapping("/{id}")
public void eliminarUsuario(@PathVariable("id")Long id){
    usuarioServices.deleteUsuario(id);
}

}
