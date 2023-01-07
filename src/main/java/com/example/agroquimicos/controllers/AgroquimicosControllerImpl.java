package com.example.agroquimicos.controllers;

import com.example.agroquimicos.domain.entities.Agroquimicos;
import com.example.agroquimicos.domain.services.AgroquimicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/agroquimicos")
public class AgroquimicosControllerImpl implements AgroquimicosController{

    @Autowired
    private AgroquimicosService agroquimicosService;

    @Override
    public int crear(Agroquimicos agroquimicos) {
        return agroquimicosService.crear(agroquimicos);
    }
}
