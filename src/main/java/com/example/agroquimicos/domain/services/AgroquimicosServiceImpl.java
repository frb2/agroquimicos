package com.example.agroquimicos.domain.services;

import com.example.agroquimicos.domain.entities.Agroquimicos;
import com.example.agroquimicos.infraestructure.repositories.AgroquimicosRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgroquimicosServiceImpl implements AgroquimicosService{

    @Autowired
    private AgroquimicosRepositoryImpl agroquimicosRepository;

    @Override
    public int crear(Agroquimicos agroquimicos){
        return agroquimicosRepository.crear(agroquimicos);
    }

}
