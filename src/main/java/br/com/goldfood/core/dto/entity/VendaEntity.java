package br.com.goldfood.core.dto.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_venda")
@Data
public class VendaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JoinColumn(name = "id_venda")
	private Long id;
	
	@JoinColumn(name = "data_venda")
	private String data;
	
	@JoinColumn(name = "valor_venda")
	private String valor;
	
	@JoinColumn(name = "forma_pagamento_venda")
	private String forma_pagamento;
	
	@OneToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private ClienteEntity cliente;
	
	@OneToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private UsuarioEntity usuario;
	
    @OneToMany(mappedBy = "venda", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ItensVendaEntity> itens = new ArrayList<>();
	
	
	 
	
	
	
	
}
