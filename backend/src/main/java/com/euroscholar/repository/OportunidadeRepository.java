package com.euroscholar.repository;

import com.euroscholar.entity.Oportunidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OportunidadeRepository extends JpaRepository<Oportunidade, Long> {

    List<Oportunidade> findByAtivaTrue();

    List<Oportunidade> findByUniversidadeId(Long universidadeId);

    List<Oportunidade> findByGrauAcademicoIgnoreCase(String grauAcademico);

    List<Oportunidade> findByAreaEstudoIgnoreCase(String areaEstudo);

    List<Oportunidade> findByPrazoInscricaoAfter(LocalDate data);

    List<Oportunidade> findByTituloContainingIgnoreCase(String titulo);
}