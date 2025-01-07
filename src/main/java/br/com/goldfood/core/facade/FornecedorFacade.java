package br.com.goldfood.core.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.goldfood.api.dto.FornecedorDTORequest;
import br.com.goldfood.api.dto.UsuarioDTORequest;
import br.com.goldfood.core.service.FornecedorService;
import br.com.goldfood.core.service.UsuarioService;

@Component
public class FornecedorFacade {
	
	@Autowired
	private FornecedorService service;
	
	public String cadastrar(FornecedorDTORequest request) {
		
		return service.cadastrar(request);
	}

}
