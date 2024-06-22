package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Programa;
import com.example.demo.models.Usuario;
import com.example.demo.services.ProgramaService;
import com.example.demo.services.UsuarioService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@AllArgsConstructor
@RequestMapping("/programas")
public class ProgramaApi {

    private final ProgramaService programaService;
    private final UsuarioService usuarioService;
    
//visualizar todos los programas

@GetMapping("")
public List<Programa> getAll() {
    return programaService.showAll();
}

//visualizar programa por id

@GetMapping("/{id}")
public Programa getById(@PathVariable("id")Long id) {
    return programaService.findPrograma(id);
}

//crear programa

@PostMapping("/new")
public Programa crearProgram(
    @RequestParam(value="titulo")String titulo,
    @RequestParam(value="red")String red,
    @RequestParam(value="descripcion")String descripcion,
    @RequestParam(value="usuarioId")Long usuarioId){
        Usuario buscaUsuario = usuarioService.findUsuario(usuarioId);
        if (buscaUsuario == null) {
            return null;
        }
    Programa programa = new Programa(titulo, red, descripcion, buscaUsuario);
    return programaService.crearPrograma(programa);
}

//actualizar programa

@PutMapping("/{id}")
public Programa actualizarPrograma(@PathVariable("id")Long id,
    @RequestParam(value="titulo")String titulo,
    @RequestParam(value="red")String red,
    @RequestParam(value="descripcion")String descripcion,
    @RequestParam(value="usuarioId")Long usuarioId) {
    Usuario buscaUsuario = usuarioService.findUsuario(usuarioId);
    if (buscaUsuario == null) {
        return null;
    }
    Programa programa = programaService.findPrograma(id);
    programa.setTitulo(titulo);
    programa.setRed(red);
    programa.setDescripcion(descripcion);
    programa.setCreador(buscaUsuario);
    return programaService.updatedPprograma(programa);
}

//eliminar programa
@DeleteMapping("/{id}")
public void eliminarUsuario(@PathVariable("id")Long id){
    programaService.eliminarPrograma(id);
}

}
