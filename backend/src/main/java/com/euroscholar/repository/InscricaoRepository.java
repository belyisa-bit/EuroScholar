package com.euroscholar.repository;

import com.euroscholar.entity.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InscricaoRepository extends JpaRepository<Inscricao, Long> {

    List<Inscricao> findByUsuarioId(Long usuarioId);

    List<Inscricao> findByOportunidadeId(Long oportunidadeId);

    Optional<Inscricao> findByUsuarioIdAndOportunidadeId(
            Long usuarioId,
            Long oportunidadeId
    );

    List<Inscricao> findByUsuarioIdAndStatusIgnoreCase(
            Long usuarioId,
            String status
    );
}