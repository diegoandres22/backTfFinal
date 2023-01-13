package com.portfolio.TpF.repository;

import com.portfolio.TpF.model.soskills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface softSkillRepository extends JpaRepository <soskills, Long> {
    
      public Optional<soskills> findById(int id);
    
}
