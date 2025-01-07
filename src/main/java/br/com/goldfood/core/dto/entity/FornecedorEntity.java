package br.com.goldfood.core.dto.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_fornecedor")
@Data
public class FornecedorEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JoinColumn(name = "id_fornecedor")
	private Long id;
	
	@JoinColumn(name = "nome_fornecedor")
	private String nome;
	
	@JoinColumn(name = "cnpj_fornecedor")
	private String cnpj;
	
	@JoinColumn(name = "ie_fornecedor")
	private String ie;
	
	@JoinColumn(name = "logradouro_fornecedor")
	private String logradouro;
	
	@JoinColumn(name = "cep_fornecedor")
	private String cep;
	
	@JoinColumn(name = "numero_fornecedor")
	private String numero;
	
	@JoinColumn(name = "comp_fornecedor")
	private String complemento;
	
	@JoinColumn(name = "bairro_fornecedor")
	private String bairro;
	
	@JoinColumn(name = "cidade_fornecedor")
	private String cidade;
	
	@JoinColumn(name = "estado_fornecedor")
	private String estado;
	
	@JoinColumn(name = "telefone_fornecedor")
	private String telefone;
	
	@JoinColumn(name = "email_fornecedor")
	private String email;
	
	@JoinColumn(name = "site_fornecedor")
	private String site;

}
