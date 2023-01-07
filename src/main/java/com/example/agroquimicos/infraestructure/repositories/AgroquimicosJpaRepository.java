package com.example.agroquimicos.infraestructure.repositories;

import com.example.agroquimicos.domain.entities.Agroquimicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgroquimicosJpaRepository extends JpaRepository<Agroquimicos,Integer> {
}
