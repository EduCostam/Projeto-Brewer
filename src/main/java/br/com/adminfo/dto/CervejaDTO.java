package br.com.adminfo.dto;

import java.math.BigDecimal;

import org.thymeleaf.util.StringUtils;

import br.com.adminfo.model.Origem;

public class CervejaDTO {
	
	private Long codigo;
	private String sku;
	private String nome;
	private String origem;
	private String foto;
	private BigDecimal valor;
	
	public CervejaDTO(Long codigo, String sku, String nome, Origem origem, String foto, BigDecimal valor) {
		super();
		this.codigo = codigo;
		this.sku = sku;
		this.nome = nome;
		this.origem = origem.getDescricao();
		this.foto = StringUtils.isEmpty(foto) ? "cerveja-mock.png" : foto;;
		this.valor = valor;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	

}
