package com.euroscholar.repository;

import com.euroscholar.entity.Favorito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FavoritoRepository extends JpaRepository<Favorito, Long> {

    List<Favorito> findByUsuarioId(Long usuarioId);

    Optional<Favorito> findByUsuarioIdAndOportunidadeId(
            Long usuarioId,
            Long oportunidadeId
    );

    boolean existsByUsuarioIdAndOportunidadeId(
            Long usuarioId,
            Long oportunidadeId
    );

    void deleteByUsuarioIdAndOportunidadeId(
            Long usuarioId,
            Long oportunidadeId
    );
}