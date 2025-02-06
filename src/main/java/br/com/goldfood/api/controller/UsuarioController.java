package br.com.goldfood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.goldfood.api.dto.ObjetoBuscaRequestDTO;
import br.com.goldfood.api.dto.UsuarioDTORequest;
import br.com.goldfood.core.dto.entity.UsuarioEntity;
import br.com.goldfood.core.facade.UsuarioFacade;

@RestController
@RequestMapping(value = "usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioFacade facade;
	
	@PostMapping
	public ResponseEntity<String> cadastroUsuario(@RequestBody UsuarioDTORequest request){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(facade.cadastrar(request));
		
	}
	
	@GetMapping
	public ResponseEntity<List<UsuarioEntity>> listarUsuario(){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(facade.listar());
	}
	
	@PostMapping
	public ResponseEntity<UsuarioEntity> listarUsuarioId(@RequestBody ObjetoBuscaRequestDTO request){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(facade.listarUsuarioId(request));
	}
	
}
