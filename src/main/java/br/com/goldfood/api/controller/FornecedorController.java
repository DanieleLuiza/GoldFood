package br.com.goldfood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.goldfood.api.dto.FornecedorDTORequest;
import br.com.goldfood.core.dto.entity.FornecedorEntity;
import br.com.goldfood.core.facade.FornecedorFacade;

@RestController
@RequestMapping(value = "fornecedor")
public class FornecedorController {
	
	@Autowired
	private FornecedorFacade facade;
	
	@PostMapping
	public ResponseEntity<String> cadastroFornecedor(@RequestBody FornecedorDTORequest request){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(facade.cadastrar(request));
	}
	
	public ResponseEntity<List<FornecedorEntity>> listarFornecedor(){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(facade.listar());
	}

}
