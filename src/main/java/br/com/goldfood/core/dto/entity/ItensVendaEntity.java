package br.com.goldfood.core.dto.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_itens_venda")
@Data
public class ItensVendaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JoinColumn(name = "id_itens_venda")
	private Long id;
	
	@JoinColumn(name = "qtd_itens_venda")
	private String quantidade;
	
	@JoinColumn(name = "valor_itens_venda")
	private String valor;
	
	@JoinColumn(name = "total_itens_venda")
	private String total;
	
	@ManyToOne
    @JoinColumn(name = "id_venda", nullable = false)
    private VendaEntity venda;

}
