
package com.portfolio.TpF.repository;

import com.portfolio.TpF.model.Diego;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository 
public interface diegoRepository extends JpaRepository <Diego, Long> {

    public Optional<Diego> findById(int id);
    
}
