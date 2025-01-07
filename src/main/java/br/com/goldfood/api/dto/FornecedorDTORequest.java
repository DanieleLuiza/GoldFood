package br.com.goldfood.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FornecedorDTORequest {
	
	private String nome;
	private String cnpj;
	private String ie;
	private String logradouro;
	private String cep;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefone;
	private String email;
	private String site;

}
