package com.core.alumnos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.core.alumnos.models.Estudiante;
import com.core.alumnos.repositories.EstudianteRepository;

@Service
public class EstudianteService {

    private final EstudianteRepository estudianteRepository;

    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    //visualizar todos los estudiantes
    public List<Estudiante> allEstudiantes(){
        return estudianteRepository.findAll();
    }

    //visualizar por id
    public Estudiante findEstudiante(Long id){
        return estudianteRepository.findById(id).orElse(null);
    }
    

    //crear un nuevo estudiante
    public Estudiante createStudent(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    //actualizar un estudiante by id
    public Estudiante updatedStudent(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    //eliminar un estudiante

    public void deleteStudent(Long id) {
        estudianteRepository.deleteById(id);
    }
    
}
