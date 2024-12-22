package br.com.goldfood.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.goldfood.api.dto.ClienteDTORequest;
import br.com.goldfood.core.dto.entity.ClienteEntity;
import br.com.goldfood.core.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public String cadastrar(ClienteDTORequest request) {
		
		ClienteEntity entity = new ClienteEntity();
		entity.setNome(request.getNome());
		entity.setCpf(request.getCpf());
		entity.setRg(request.getRg());
		entity.setLogradouro(request.getLogradouro());
		entity.setCep(request.getCep());
		entity.setNumero(request.getNumero());
		entity.setComplemento(request.getComplemento());
		entity.setBairro(request.getBairro());
		entity.setCidade(request.getCidade());
		entity.setEstado(request.getEstado());
		entity.setTelefone(request.getTelefone());
		entity.setEmail(request.getEmail());
		
		repository.save(entity);
		
		return "Salvo com Sucesso";
		
	}

}
