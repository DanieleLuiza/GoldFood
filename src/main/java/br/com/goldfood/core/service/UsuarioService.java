package br.com.goldfood.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.goldfood.api.dto.ObjetoBuscaRequestDTO;
import br.com.goldfood.api.dto.UsuarioDTORequest;
import br.com.goldfood.core.dto.entity.UsuarioEntity;
import br.com.goldfood.core.repository.UsuarioRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public String cadastrar(UsuarioDTORequest request) {
		
		UsuarioEntity entity = new UsuarioEntity();
		entity.setNome(request.getNome());
		entity.setLogradouro(request.getLogradouro());
		entity.setCep(request.getCep());
		entity.setNumero(request.getNumero());
		entity.setComplemento(request.getComplemento());
		entity.setBairro(request.getBairro());
		entity.setCidade(request.getCidade());
		entity.setEstado(request.getEstado());
		entity.setTelefone(request.getTelefone());
		entity.setCpf(request.getCpf());
		entity.setRg(request.getRg());
		entity.setTipo(request.getTipo());
		entity.setAdmissao(LocalDate.now());
		entity.setStatus(1);
		entity.setSalario(request.getSalario());
		entity.setEmail(request.getEmail());
		entity.setLogin(request.getLogin());
		entity.setPassword(request.getPassword());
		
		repository.save(entity);
		
		return "Salvo com Sucesso";
		
	}

	public List<UsuarioEntity> listar() {
		return repository.findAll();
	}

	public UsuarioEntity listarUsuarioId(ObjetoBuscaRequestDTO request) {
		
		return repository.findByIdUsuario(request.getId_busca());
	}

}
