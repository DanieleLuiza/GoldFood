package br.com.goldfood.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.goldfood.core.dto.entity.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long>{

}
