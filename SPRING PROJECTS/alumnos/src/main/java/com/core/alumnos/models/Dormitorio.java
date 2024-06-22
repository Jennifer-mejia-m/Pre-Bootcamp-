package com.core.alumnos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@Table(name="dormitorios")
public class Dormitorio extends BaseModel {

    @NotNull
    @Size(min = 2, max=50)
    private String name;

    @OneToMany(mappedBy = "dormitorio", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Estudiante> estudiantes;

}
