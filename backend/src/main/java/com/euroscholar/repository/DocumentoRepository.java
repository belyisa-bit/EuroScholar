package com.euroscholar.repository;

import com.euroscholar.entity.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {

    List<Documento> findByInscricaoId(Long inscricaoId);

    List<Documento> findByInscricaoIdAndEnviadoFalse(Long inscricaoId);

    List<Documento> findByInscricaoIdAndEnviadoTrue(Long inscricaoId);

    List<Documento> findByTipoIgnoreCase(String tipo);
}