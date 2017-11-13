package br.com.projuris;

import java.math.BigDecimal;

public class CustoDepartamento {
	
	private String departamento;
	private BigDecimal custo;
	
	public void setDepartamento(String value) {
		this.departamento = value;
	}	
	
	public String getDepartamento() {
		return this.departamento;
	}
	
	public void setCusto(BigDecimal value) {
		this.custo = value;
	}
	
	public BigDecimal getCusto() {
		return this.custo;
	}

}
