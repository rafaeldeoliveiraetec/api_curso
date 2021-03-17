package br.sp.gov.etec.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.sp.gov.etec.curso.entity.CursoEntity;

public interface CursoRepository extends JpaRepository<CursoEntity, Long>{

}
