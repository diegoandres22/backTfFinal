package com.portfolio.TpF.repository;

import com.portfolio.TpF.model.haskills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface haskillsRepository extends JpaRepository<haskills, Long> {

    public Optional<haskills> findById(int id);
}
