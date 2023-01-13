
package com.portfolio.TpF.repository;


import com.portfolio.TpF.model.Estudio;
import com.portfolio.TpF.model.experienciaslaborales;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface estudioRepository extends JpaRepository <Estudio, Long>  {
    
     public Optional<experienciaslaborales> findById(int id);
    
}
