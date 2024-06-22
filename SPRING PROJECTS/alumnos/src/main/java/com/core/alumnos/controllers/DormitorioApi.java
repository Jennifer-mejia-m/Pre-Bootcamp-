package com.core.alumnos.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.core.alumnos.models.Dormitorio;
import com.core.alumnos.services.DormitorioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/dorms")
public class DormitorioApi {

    private final DormitorioService dormitorioService;

    public DormitorioApi(DormitorioService dormitorioService) {
        this.dormitorioService = dormitorioService;
    }

@GetMapping("")
public List<Dormitorio> verDormitorios () {
    return dormitorioService.allDormitorios();
}

@GetMapping("/{id}")
public Dormitorio buscarId(@PathVariable("id")Long id) {
    return dormitorioService.buscarById(id);
}

    
@PostMapping("/new")
public Dormitorio newRoom(@RequestParam(value="name")String name) {
    Dormitorio dormitorio = new Dormitorio(name,null);
    return dormitorioService.createRoom(dormitorio);
}

@PutMapping("/{id}")
public Dormitorio actualizarRoom(@PathVariable("id") Long id,
    @RequestParam(value="name")String name) {
    Dormitorio dormitorio = new Dormitorio(name,null);
    dormitorio.setId(id);
    return dormitorioService.updatedDormitorio(dormitorio);
} 

@DeleteMapping("/{id}")
    public void eliminarRoom(@PathVariable("id")Long id){
        dormitorioService.deleteRoom(id);
    }
}
