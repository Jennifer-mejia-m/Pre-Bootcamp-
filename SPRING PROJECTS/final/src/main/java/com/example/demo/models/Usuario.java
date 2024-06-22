package com.example.demo.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="usuarios")
public class Usuario extends BaseModel{

    @NotNull
    @Size(min=2, max=40)
    private String nombre;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min = 6)
    private String contraseña;

    @NotNull
    @Size(min = 6)
    private String confirmarContraseña;

    @JsonManagedReference
    @OneToMany(mappedBy = "creador", fetch = FetchType.LAZY)
    private List<Programa> programas;
    
}
