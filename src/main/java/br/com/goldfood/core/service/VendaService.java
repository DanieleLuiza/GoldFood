package br.com.goldfood.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.goldfood.api.dto.VendaDTORequest;
import br.com.goldfood.core.dto.entity.VendaEntity;
import br.com.goldfood.core.repository.VendaRepository;

@Service
public class VendaService {
	
	@Autowired
	private VendaRepository repository;
//	
//	public String cadastrar(VendaDTORequest request) {
//		VendaEntity entity = new VendaEntity();
//	}

}
