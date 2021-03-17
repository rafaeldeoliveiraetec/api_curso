package br.sp.gov.etec.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.curso.dto.CursoDto;
import br.sp.gov.etec.curso.entity.CursoEntity;
import br.sp.gov.etec.curso.repository.CursoRepository;

@RestController
@RequestMapping(value = "/curso/v1")
public class CursoController {

	@Autowired
	CursoRepository repository;

	@GetMapping(value = "/consultar_curso")
	public ResponseEntity<?> findAllCurso() {		
		List<CursoEntity> listaCursos = repository.findAll();	
		return ResponseEntity.ok(listaCursos);
	}
	
	@PostMapping(path = "/adicionar_curso" , consumes = "application/json", produces = "application/json" )
	public ResponseEntity<?> AddCurso(@RequestBody CursoDto dto) {		
		CursoEntity request = new CursoEntity(dto.getId(),dto.getNome(),dto.getSigla());
		CursoEntity response = repository.save(request);	
		return ResponseEntity.ok(response);
	}
	
}
