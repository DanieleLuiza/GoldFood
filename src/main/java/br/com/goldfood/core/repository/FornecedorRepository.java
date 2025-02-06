package br.com.goldfood.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.goldfood.core.dto.entity.FornecedorEntity;

public interface FornecedorRepository extends JpaRepository<FornecedorEntity, Long>{

	FornecedorEntity findByIdFornecedor(Long id_busca);

}
