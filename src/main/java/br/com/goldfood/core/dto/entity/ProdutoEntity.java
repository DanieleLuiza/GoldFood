package br.com.goldfood.core.dto.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_produto")
@Data
public class ProdutoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JoinColumn(name = "id_produto")
	private Long id;
	
	@JoinColumn(name = "nome_produto")
	private String nome;
	
	@JoinColumn(name = "descricao_produto")
	private String descricao;
	
	@JoinColumn(name = "preco_produto")
	private String preco;
	
	@JoinColumn(name = "marca_produto")
	private String marca;
	
	@JoinColumn(name = "tipo_produto")
	private String tipo;
	
	@JoinColumn(name = "referencia_produto")
	private String referencia;
	
	@JoinColumn(name = "codigo_barra_produto")
	private String codigoBarra;
	
	@JoinColumn(name = "quantidade_produto")
	private String quantidade;

}
