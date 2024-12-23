package br.com.goldfood.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.goldfood.api.dto.ProdutoDTORequest;
import br.com.goldfood.core.facade.ProdutoFacade;

@RestController
@RequestMapping(value = "produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoFacade facade;
	
	@PostMapping
	public ResponseEntity<String> cadastroProduto(@RequestBody ProdutoDTORequest request){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(facade.cadastrar(request));
	}

}
