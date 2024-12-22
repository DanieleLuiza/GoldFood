package br.com.goldfood.core.dto.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_cliente")
@Data
public class ClienteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@JoinColumn(name = "id_cliente")
	private Long id;
	
	@JoinColumn(name = "nome_cliente")
	private String nome;
	
	@JoinColumn(name = "cpf_cliente")
	private Long cpf;
	
	@JoinColumn(name = "rg_cliente")
	private Long rg;
	
	@JoinColumn(name = "logradouro_cliente")
	private String logradouro;
	
	@JoinColumn(name = "cep_cliente")
	private Long cep;
	
	@JoinColumn(name = "numero_cliente")
	private String numero;
	
	@JoinColumn(name = "complemento_cliente")
	private String complemento;
	
	@JoinColumn(name = "bairro_cliente")
	private String bairro;
	
	@JoinColumn(name = "cidade_cliente")
	private String cidade;
	
	@JoinColumn(name = "estado_cliente")
	private String estado;
	
	@JoinColumn(name = "telefone_cliente")
	private String telefone;
	
	@JoinColumn(name = "email_cliente")
	private String email;


}
