package br.com.goldfood.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.goldfood.core.dto.entity.VendaEntity;

public interface VendaRepository extends JpaRepository<VendaEntity, Long>{

}
