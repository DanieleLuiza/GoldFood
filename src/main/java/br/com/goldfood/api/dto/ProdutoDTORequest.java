package br.com.goldfood.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoDTORequest {
	
	private String nome;
	private String descricao;
	private String preco;
	private String marca;
	private String tipo;
	private String referencia;
	private String codigoBarra;
	private String quantidade;

}
