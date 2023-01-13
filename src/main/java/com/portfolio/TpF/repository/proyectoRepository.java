package com.portfolio.TpF.repository;

import com.portfolio.TpF.model.proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface proyectoRepository extends JpaRepository <proyecto, Long> {
    
     public Optional<proyecto> findById(int id);
}
