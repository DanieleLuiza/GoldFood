package br.com.goldfood.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.goldfood.core.dto.entity.ProdutoEntity;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long>{

}
