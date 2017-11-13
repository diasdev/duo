package br.com.projuris;

import java.math.BigDecimal;

public class Funcionario {

	private String cargo;
	private String departamento;
	private BigDecimal salario;

	public Funcionario(String cargo, String depargamento, BigDecimal salario) {
		this.cargo = cargo;
		this.departamento = depargamento;
		this.salario = salario;
	}

	public void setCargo(String value) {
		this.cargo = value;
	}
	
	public String getCargo() {
		return this.cargo;
	}
	
	public void setDepartamento(String value) {
		this.departamento = value;
	}
	
	public String getDepartamento() {
		return this.departamento;
	}
		
	public void setSalario(BigDecimal value) {
		this.salario = value;
	}	
	
	public BigDecimal getSalario() {
		return this.salario;
	}
}
