package br.com.goldfood.api.dto;

import java.math.BigInteger;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTORequest {
	
	private String nome;
	private String logradouro;
	private Long cep;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefone;
	private Long cpf;
	private Long rg;
	private int tipo;
	private BigInteger salario;
	private String email;
	private String login;
	private String password;
	
}


