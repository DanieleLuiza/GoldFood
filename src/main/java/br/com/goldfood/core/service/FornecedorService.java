package br.com.goldfood.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.goldfood.api.dto.FornecedorDTORequest;
import br.com.goldfood.core.dto.entity.FornecedorEntity;
import br.com.goldfood.core.repository.FornecedorRepository;

@Service
public class FornecedorService {
	
	@Autowired
	private FornecedorRepository repository;
	
	public String cadastrar(FornecedorDTORequest request){
		
		FornecedorEntity entity = new FornecedorEntity();
		entity.setNome(request.getNome());
		entity.setCnpj(request.getCnpj());
		entity.setIe(request.getIe());
		entity.setLogradouro(request.getLogradouro());
		entity.setCep(request.getCep());
		entity.setNumero(request.getNumero());
		entity.setComplemento(request.getComplemento());
		entity.setBairro(request.getBairro());
		entity.setCidade(request.getCidade());
		entity.setEstado(request.getEstado());
		entity.setTelefone(request.getTelefone());
		entity.setEmail(request.getEmail());
		entity.setSite(request.getSite());
		
		repository.save(entity);
		
		return "Salvo com Sucesso";
	}
	
	public List<FornecedorEntity> listar() {
		return repository.findAll();
	}

}
