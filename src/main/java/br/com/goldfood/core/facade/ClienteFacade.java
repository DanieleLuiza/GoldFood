package br.com.goldfood.core.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.goldfood.api.dto.ClienteDTORequest;
import br.com.goldfood.core.service.ClienteService;

@Component
public class ClienteFacade {
	
	@Autowired
	private ClienteService service;
	
	public String cadastrar(ClienteDTORequest request) {
		
		return service.cadastrar(request);
	}

}
