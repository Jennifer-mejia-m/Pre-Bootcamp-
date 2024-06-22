package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Usuario;
import com.example.demo.services.UsuarioService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@AllArgsConstructor
@RequestMapping("/usuarios")
public class UsuarioApi {

    private final UsuarioService usuarioService;

//visualizar todos los usuarios

@GetMapping("")
public List<Usuario> getAll() {
    return usuarioService.showAll();
}
  
//visualizar usuario por id

@GetMapping("/{id}")
public Usuario getUsuarioId(@PathVariable("id")Long id) {
    return usuarioService.findUsuario(id);
}

//crear usuario

@PostMapping("/new")
public Usuario newUsuario(
    @RequestParam (value="nombre")String nombre,
    @RequestParam(value="email")String email,
    @RequestParam(value="contraseña")String contraseña,
    @RequestParam(value="confirmPass")String confirmPass) {
        Usuario usuario = new Usuario(nombre, email, contraseña, confirmPass, null);
        return usuarioService.crearUsuario(usuario);
        }
  
//actualizar usuario

@PutMapping("/{id}")
public Usuario updatedUser(@PathVariable("id")Long id,
    @RequestParam(value="nombre")String nombre,
    @RequestParam(value="email")String email,
    @RequestParam(value="contraseña")String contraseña,
    @RequestParam(value="confirmPass")String confirmPass) {
        Usuario usuario = new Usuario(nombre, email, contraseña, confirmPass, null);
        usuario.setId(id);
    return usuarioService.updatedUsuario(usuario);
}

//eliminar usuario

@DeleteMapping("/{id}")
public void eliminarUser(@PathVariable("id")Long id) {
    usuarioService.eliminarUsuario(id);
}

}


    

