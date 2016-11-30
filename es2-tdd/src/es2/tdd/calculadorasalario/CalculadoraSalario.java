package es2.tdd.calculadorasalario;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraSalario {
	private List<Funcionario> mFuncionarios;
	private CalculadorDesconto mCalculador;
	
	public CalculadoraSalario(){
		this(new CalculadorDescontoCargo());
	}
	
	public CalculadoraSalario(CalculadorDesconto calculador){
		mCalculador = calculador;
		mFuncionarios = new ArrayList<Funcionario>();
	}
	
	public void addFuncionario(Funcionario funcionario){
		mFuncionarios.add(funcionario);
	}
	
	public void resetarListaFuncionarios(){
		mFuncionarios.clear();
	}

	public double calcular() {
		double total=0;
		for (Funcionario funcionario : mFuncionarios) {
			funcionario.setCalculador(mCalculador);
			total += funcionario.getmSalario();
		}
		return total;
	}
	
	public void setCalculador(CalculadorDesconto calculador){
		mCalculador = calculador;
	}
}
