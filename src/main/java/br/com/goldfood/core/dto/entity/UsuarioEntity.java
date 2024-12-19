package br.com.goldfood.core.dto.entity;

import java.math.BigInteger;
import java.sql.Date;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Long getCep() {
		return cep;
	}

	public void setCep(Long cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public LocalDate getAdmissao() {
		return admissao;
	}

	public void setAdmissao(LocalDate admissao) {
		this.admissao = admissao;
	}

	public LocalDate getDemissao() {
		return demissao;
	}

	public void setDemissao(LocalDate demissao) {
		this.demissao = demissao;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public BigInteger getSalario() {
		return salario;
	}

	public void setSalario(BigInteger salario) {
		this.salario = salario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
