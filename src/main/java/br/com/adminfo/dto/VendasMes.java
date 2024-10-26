package br.com.adminfo.dto;

public class VendasMes {
	
	private String mes;
	private Integer total;
	
	
	
	public VendasMes() {
		super();
	}
	
	public VendasMes(String mes, Integer total) {
		super();
		this.mes = mes;
		this.total = total;
	}
	
	public String getMes() {
		return mes;
	}
	
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	public Integer getTotal() {
		return total;
	}
	
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	

}
