package br.com.goldfood.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDTORequest {
	
	private String nome;
	private Long cpf;
	private Long rg;
	private String Logradouro;
	private Long cep;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefone;
	private String email;

}
