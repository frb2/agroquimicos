package com.example.agroquimicos.infraestructure.repositories;

import com.example.agroquimicos.domain.entities.Agroquimicos;
import com.example.agroquimicos.domain.repositories.AgroquimicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AgroquimicosRepositoryImpl implements AgroquimicosRepository {

    @Autowired
    private AgroquimicosJpaRepository agroquimicosJpaRepository;

    @Override
    public int crear(Agroquimicos agroquimicos){
        return agroquimicosJpaRepository.save(agroquimicos).getId();
    }
}
