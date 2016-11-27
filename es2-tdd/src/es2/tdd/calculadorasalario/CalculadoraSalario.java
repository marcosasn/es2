package es2.tdd.calculadorasalario;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraSalario {
	private List<Funcionario> mFuncionarios;
	private Calculador mCalculador;
	
	public CalculadoraSalario(){
		this(new CalculadorPorCargo());
	}
	
	public CalculadoraSalario(Calculador calculador){
		mCalculador = calculador;
		mFuncionarios = new ArrayList<Funcionario>();
	}
	
	public void setFuncionario(Funcionario funcionario){
		mFuncionarios.add(funcionario);
	}
	
	public void resetarListaFuncionarios(){
		mFuncionarios.clear();
	}

	public double calcular() {
		double total=0;
		for (Funcionario funcionario : mFuncionarios) {
			total += mCalculador.calcular(funcionario);
		}
		return total;
	}
	
	public void setCalculador(Calculador calculador){
		mCalculador = calculador;
	}
}
