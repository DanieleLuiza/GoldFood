package br.com.goldfood.api.dto;

import java.math.BigInteger;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItensVendaDTORequest {
	
	private int qtd_itens_venda;
	private BigInteger valor_itens_venda;
	private BigInteger total_itens_venda;
	private Long id_produto;
	private Long id_venda;

}
