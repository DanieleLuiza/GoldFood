package br.com.goldfood.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.goldfood.core.dto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
