package es2.tdd.calculadorasalario;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraSalario {
	private List<Funcionario> mFuncionarios;
	private CalculadorDesconto mCalculadorDesconto;
	
	public CalculadoraSalario(){
		this(new CalculadorDescontoCargo());
	}
	
	public CalculadoraSalario(CalculadorDesconto calculador){
		mCalculadorDesconto = calculador;
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
			funcionario.setCalculadorDesconto(mCalculadorDesconto);
			total += funcionario.getmSalario();
		}
		return total;
	}
	
	public void setCalculador(CalculadorDesconto calculador){
		mCalculadorDesconto = calculador;
	}
}