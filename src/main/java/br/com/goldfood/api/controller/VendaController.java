package br.com.goldfood.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.goldfood.api.dto.VendaDTORequest;
import br.com.goldfood.core.facade.VendaFacade;

@RestController
@RequestMapping(value = "venda")
public class VendaController {
	
	@Autowired
	private VendaFacade facade;
	
	@PostMapping
	public ResponseEntity<String> cadastroVenda(@RequestBody VendaDTORequest request){
		
//	return ResponseEntity.status(HttpStatus.CREATED).body(facade.cadastrar(request));
	return ResponseEntity.status(HttpStatus.CREATED).body("");

	}


}
