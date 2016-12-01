package es2.tdd.calculadorasalario;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe respons�vel por agregar e fornecer o valor de sal�rios de
 * funcion�rios.
 * 
 * @author Marcos Nascimento
 * @since 11-26-2016
 */
public class CalculadoraSalario {
	private List<Funcionario> mFuncionarios;
	private CalculadorDesconto mCalculadorDesconto;

	public CalculadoraSalario() {
		this(new CalculadorDescontoCargo());
	}

	public CalculadoraSalario(CalculadorDesconto calculador) {
		if (calculador == null) {
			mCalculadorDesconto = new CalculadorDescontoCargo();
		}
		mCalculadorDesconto = calculador;
		mFuncionarios = new ArrayList<Funcionario>();
	}

	/**
	 * Adiciona um funcion�rio.
	 * 
	 * @param funcionario
	 *            O funcionario a ser adicionado.
	 * @throws Exception
	 *             Se o funcion�rio for nulo.
	 */
	public void addFuncionario(Funcionario funcionario) throws Exception {
		if (funcionario == null) {
			throw new Exception("O funcion�rio n�o pode ser nulo.");
		}
		mFuncionarios.add(funcionario);
	}

	public void resetarListaFuncionarios() {
		mFuncionarios.clear();
	}

	/**
	 * Retorna a soma de sal�rio dos funcion�rios com desconto.
	 * 
	 * @return O valor da soma dos sal�rios.
	 */
	public double calcular() {
		double total = 0;
		for (Funcionario funcionario : mFuncionarios) {
			funcionario.setCalculadorDesconto(mCalculadorDesconto);
			total += funcionario.getmSalario();
		}
		return total;
	}

	/**
	 * Seta o calculador de desconto do sal�rio.
	 * 
	 * @param calculador
	 *            A estrat�gia que ir� realizar o c�lculo de desconto.
	 * @throws Exception
	 *             Se o calculador for nulo.
	 */
	public void setCalculador(CalculadorDesconto calculador) throws Exception {
		if (calculador == null) {
			throw new Exception("O calculador de desconto n�o pode ser nulo.");
		}
		mCalculadorDesconto = calculador;
	}
}