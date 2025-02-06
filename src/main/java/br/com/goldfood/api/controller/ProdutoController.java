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

import br.com.goldfood.api.dto.ObjetoBuscaRequestDTO;
import br.com.goldfood.api.dto.ProdutoDTORequest;
import br.com.goldfood.core.dto.entity.ProdutoEntity;
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
	
	@GetMapping
	public ResponseEntity<List<ProdutoEntity>> listarProduto(){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(facade.listar());
	}
	
	@PostMapping
	public ResponseEntity<ProdutoEntity> listarProdutoId(@RequestBody ObjetoBuscaRequestDTO request){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(facade.listarProdutoId(request));
	}

}
