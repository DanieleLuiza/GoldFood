package br.com.goldfood.core.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.goldfood.api.dto.UsuarioDTORequest;
import br.com.goldfood.core.dto.entity.UsuarioEntity;
import br.com.goldfood.core.service.UsuarioService;

@Component
public class UsuarioFacade {
	
	@Autowired
	private UsuarioService service;
	
	public String cadastrar(UsuarioDTORequest request) {
		
		return service.cadastrar(request);
	}
	
	public List<UsuarioEntity> listar() {
		
		return service.listar();
	}

}
