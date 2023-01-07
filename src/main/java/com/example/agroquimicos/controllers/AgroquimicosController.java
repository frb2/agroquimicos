package com.example.agroquimicos.controllers;

import com.example.agroquimicos.domain.entities.Agroquimicos;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AgroquimicosController {

    @PostMapping(value = {"/crear"},produces = {MediaType.APPLICATION_JSON_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE})
    int crear(@RequestBody Agroquimicos agroquimicos);
}
