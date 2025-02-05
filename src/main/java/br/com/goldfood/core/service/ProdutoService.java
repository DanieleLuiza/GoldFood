package br.com.goldfood.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.goldfood.api.dto.ProdutoDTORequest;
import br.com.goldfood.core.dto.entity.ProdutoEntity;
import br.com.goldfood.core.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	public String cadastrar(ProdutoDTORequest request) {
		
		ProdutoEntity entity = new ProdutoEntity();
		entity.setNome(request.getNome());
		entity.setDescricao(request.getDescricao());
		entity.setPreco(request.getPreco());
		entity.setMarca(request.getMarca());
		entity.setTipo(request.getTipo());
		entity.setReferencia(request.getReferencia());
		entity.setCodigoBarra(request.getCodigoBarra());
		entity.setQuantidade(request.getQuantidade());
		
		repository.save(entity);
		
		return "Salvo com Sucesso";
		
	}
	
	public List<ProdutoEntity> listar() {
		return repository.findAll();
	}

}
