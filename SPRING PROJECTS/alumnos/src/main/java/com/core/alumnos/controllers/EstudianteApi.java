package com.core.alumnos.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.core.alumnos.models.Dormitorio;
import com.core.alumnos.models.Estudiante;
import com.core.alumnos.services.DormitorioService;
import com.core.alumnos.services.EstudianteService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/estudiantes")
@AllArgsConstructor
public class EstudianteApi {

    private final EstudianteService estudianteService;
    private final DormitorioService dormitorioService;


//visualizar todos los estudiantes
@GetMapping("")
public List<Estudiante>showAll() {
    return estudianteService.allEstudiantes();
}

//buscar por id estudiante
@GetMapping("/{id}")
public Estudiante getById(@PathVariable("id")Long id) {
    return estudianteService.findEstudiante(id);
}

//Crear estudiante
@PostMapping("/new")
public Estudiante crearEstudiante(@RequestParam(value="name")String name,
    @RequestParam(value="dormitorioId")Long dormitorioId){
    Dormitorio buscaRoom = dormitorioService.buscarById(dormitorioId);
    if (buscaRoom == null) {
        return null;
    }
    Estudiante estudiante = new Estudiante(name, buscaRoom);
    return estudianteService.createStudent(estudiante);
}

//Actualizar estudiante
@PutMapping("/{id}")
public Estudiante actualizarEstudiante(@PathVariable("id")Long id,
    @RequestParam(value="name")String name,
    @RequestParam(value="dormitorioId")Long dormitorioId){
    Dormitorio buscarRoom = dormitorioService.buscarById(dormitorioId);
    if (buscarRoom == null) {
        return null;
    }    
    Estudiante estudiante = estudianteService.findEstudiante(id);
    estudiante.setName(name);
    estudiante.setDormitorio(buscarRoom);
    return estudianteService.updatedStudent(estudiante);
}

//Eliminar estudiante

@DeleteMapping("/{id}")
public void eliminarEstudiante(@PathVariable("id")Long id){
    estudianteService.deleteStudent(id);
}
    
}
