package com.example.agroquimicos.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "agroquimicos")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Agroquimicos implements Serializable {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fabricacion")
    private boolean fabricacion;

    @Column(name = "cantidad")
    private String cantidad;

    @Column(name = "insumos")
    private String insumos;

    @Column(name = "fechaFabricacion")
    private Date fechaFabricacion;

}
