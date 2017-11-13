package br.com.projuris;

import java.math.BigDecimal;

public class CustoCargo {
	private String cargo;
	private BigDecimal custo;
	
	public void setCargo(String value) {
		this.cargo = value;
	}	
	
	public String getCargo() {
		return this.cargo;
	}
	
	public void setCusto(BigDecimal value) {
		this.custo = value;
	}
	
	public BigDecimal getCusto() {
		return this.custo;
	}
}
