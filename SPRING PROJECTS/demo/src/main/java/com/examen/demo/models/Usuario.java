package com.examen.demo.models;

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
    @Size(min=3, max=30)
    private String nombre;

    @Email
    @NotNull
    @Size(min=5, max=20)
    private String email;

    @NotNull
    @Size(min=4, max=10)
    private String contraseña;

    @JsonManagedReference
    @OneToMany(mappedBy = "creador", fetch = FetchType.LAZY)
    private List<Idea> ideas;
    
}
