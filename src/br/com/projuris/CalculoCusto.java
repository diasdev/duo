package br.com.projuris;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class CalculoCusto implements Calculo {
	
	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios){
		
		return funcionarios.stream().collect(Collectors.groupingBy(f -> f.getCargo(), Collectors.reducing(BigDecimal.ZERO, Funcionario::getSalario, BigDecimal::add)))
				.entrySet()
				.stream()
				.map(s -> {
					CustoCargo objCustoCargo = new CustoCargo();
					objCustoCargo.setCargo(s.getKey());
					objCustoCargo.setCusto(s.getValue());
					return objCustoCargo;})
				.collect(Collectors.toList());
	}

	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios){		
		
		return funcionarios.stream().collect(Collectors.groupingBy(f -> f.getDepartamento(), Collectors.reducing(BigDecimal.ZERO, Funcionario::getSalario, BigDecimal::add)))
				.entrySet()
				.stream()
				.map(s -> {
					CustoDepartamento objCustoDept = new CustoDepartamento();
					objCustoDept.setDepartamento(s.getKey());
					objCustoDept.setCusto(s.getValue());
					return objCustoDept;})
				.collect(Collectors.toList());
		
	}
}
