package es2.tdd.calculadorasalario;

/**
 * 
 * Interface que mantém o contrato de estratégias que realizam cálculo de
 * descontos de salário.
 * 
 * @author Marcos Nascimento
 * @since 11-26-2016
 */
public interface CalculadorDesconto {

	/**
	 * Calcula o valor de desconto do salário.
	 * 
	 * @param funcionario
	 *            O funcionário.
	 * @return O valor a ser descontado do salário.
	 */
	double calcular(Funcionario funcionario);

}
