package com.euroscholar.repository;

import com.euroscholar.entity.Universidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversidadeRepository extends JpaRepository<Universidade, Long> {

    List<Universidade> findByPaisIgnoreCase(String pais);

    List<Universidade> findByNomeContainingIgnoreCase(String nome);

    List<Universidade> findByAtivaTrue();
}