package br.com.goldfood.api.dto;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VendaDTORequest {
	
	private Date dataVenda;
	private BigInteger valorVenda;
	private String formaPagamento;
	private Long id_cliente;
	private Long id_usuario;
	private List<ItensVendaDTORequest> listaProdutos;
 
}
