package br.com.goldfood.core.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.goldfood.api.dto.ProdutoDTORequest;
import br.com.goldfood.core.service.ProdutoService;

@Component
public class ProdutoFacade {
	
	@Autowired
	private ProdutoService service;
	
	public String cadastrar(ProdutoDTORequest request) {
		
		return service.cadastrar(request);
	}
}
