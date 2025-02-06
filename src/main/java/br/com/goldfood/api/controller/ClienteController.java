package br.com.goldfood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.goldfood.api.dto.ClienteDTORequest;
import br.com.goldfood.api.dto.ObjetoBuscaRequestDTO;
import br.com.goldfood.core.dto.entity.ClienteEntity;
import br.com.goldfood.core.facade.ClienteFacade;

@RestController
@RequestMapping(value = "cliente")
public class ClienteController {
	
	@Autowired
	private ClienteFacade facade;
	
	@PostMapping
	public ResponseEntity<String> cadastroCliente(@RequestBody ClienteDTORequest request){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(facade.cadastrar(request));
	}
	
	@GetMapping
	public ResponseEntity<List<ClienteEntity>> listarCliente(){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(facade.listar());
	}
	
	@PostMapping
	public ResponseEntity<ClienteEntity> listarClienteId(@RequestBody ObjetoBuscaRequestDTO request){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(facade.listarClienteId(request));
	}

}
