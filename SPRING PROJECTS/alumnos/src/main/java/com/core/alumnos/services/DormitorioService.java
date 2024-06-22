package com.core.alumnos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.core.alumnos.models.Dormitorio;
import com.core.alumnos.repositories.DormitorioRepository;

@Service
public class DormitorioService {

    private final DormitorioRepository dormitorioRepository;

    public DormitorioService(DormitorioRepository dormitorioRepository) {
        this.dormitorioRepository=dormitorioRepository;
    }

    //visualizar todos los dormitorios
    public List<Dormitorio> allDormitorios(){
        return dormitorioRepository.findAll();
    }

    //visualizar por id
    public Dormitorio buscarById(Long id) {
        return dormitorioRepository.findById(id).orElse(null);
    }

    //crear un nuevo dormitorio
    public Dormitorio createRoom(Dormitorio room) {
        return dormitorioRepository.save(room);
    }

    //actualizar un dormitorio by id
    public Dormitorio updatedDormitorio(Dormitorio room) {
        return dormitorioRepository.save(room);
    }

    //eliminar un dormitorio

    public void deleteRoom(Long id) {
        dormitorioRepository.deleteById(id);
    }
    
}
