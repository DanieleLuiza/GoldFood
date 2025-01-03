package br.com.goldfood.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.goldfood.api.dto.ClienteDTORequest;
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

}
