package br.com.goldfood.core.dto.entity;

import java.math.BigInteger;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_usuario")
@Data
public class UsuarioEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JoinColumn(name = "id_usuario")
	private Long id;

	@JoinColumn(name = "nome_usuario")
	private String nome;

	@JoinColumn(name = "logradouro_usuario")
	private String logradouro;

	@JoinColumn(name = "cep_usuario")
	private Long cep;

	@JoinColumn(name = "numero_usuario")
	private String numero;

	@JoinColumn(name = "comp_usuario")
	private String complemento;

	@JoinColumn(name = "bairro_usuario")
	private String bairro;

	@JoinColumn(name = "cidade_usuario")
	private String cidade;

	@JoinColumn(name = "estado_usuario")
	private String estado;

	@JoinColumn(name = "telefone_usuario")
	private String telefone;

	@JoinColumn(name = "cpf_usuario")
	private Long cpf;

	@JoinColumn(name = "rg_usuario")
	private Long rg;

	@JoinColumn(name = "tipo_usuario")
	private int tipo;

	@JoinColumn(name = "data_admissao_usuario")
	private LocalDate admissao;

	@JoinColumn(name = "data_demissao_usuario")
	private LocalDate demissao;

	@JoinColumn(name = "status_usuario")
	private int status;

	@JoinColumn(name = "salario_usuario")
	private BigInteger salario;

	@JoinColumn(name = "email_usuario")
	private String email;

	@JoinColumn(name = "login_usuario")
	private String login;

	@JoinColumn(name = "password_usuario")
	private String password;
	
}
