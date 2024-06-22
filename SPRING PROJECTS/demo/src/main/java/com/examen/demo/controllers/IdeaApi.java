package com.examen.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.examen.demo.models.Idea;
import com.examen.demo.models.Usuario;
import com.examen.demo.services.IdeaServices;
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
@RequestMapping("/ideas")
public class IdeaApi {

    private final IdeaServices ideaServices;
    private final UsuarioServices usuarioServices;

//visualizar todas las ideas

@GetMapping("")
public List<Idea> showAll() {
    return ideaServices.showAll();
}

//visualizar idea por id

@GetMapping("/{id}")
public Idea buscarIdea(@PathVariable("id")Long id) {
    return ideaServices.findIdea(id);
}

//crear nueva idea

@PostMapping("/new")
public Idea crearIdea(
    @RequestParam(value="contenido")String contenido,
    @RequestParam(value="usuarioId")Long usuarioId) {
    Usuario buscaUsuario = usuarioServices.findUsuario(usuarioId);
    if (buscaUsuario == null) {
        return null;
    } 
    Idea idea = new Idea(contenido,buscaUsuario);
    return ideaServices.crearIdea(idea);
}

//actualizar idea

@PutMapping("/{id}")
public Idea putMethodName(@PathVariable("id")Long id,
    @RequestParam(value="contenido")String contenido,
    @RequestParam(value="usuarioId")Long usuarioId) {
    Usuario buscaUsuario = usuarioServices.findUsuario(usuarioId);    
    if (buscaUsuario == null) {
        return null;
    }
    Idea idea = ideaServices.findIdea(id);
    idea.setContenido(contenido);
    idea.setCreador(buscaUsuario);
    return ideaServices.updatedIdea(idea);
}

//eliminar idea

@DeleteMapping("/{id}")
public void eliminarIdea(@PathVariable("id")Long id){
    ideaServices.eliminarIdea(id);
}

}
