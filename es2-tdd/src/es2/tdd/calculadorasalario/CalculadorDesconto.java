package es2.tdd.calculadorasalario;

/**
 * 
 * Interface que mant�m o contrato de estrat�gias que realizam c�lculo de
 * descontos de sal�rio.
 * 
 * @author Marcos Nascimento
 * @since 11-26-2016
 */
public interface CalculadorDesconto {

	/**
	 * Calcula o valor de desconto do sal�rio.
	 * 
	 * @param funcionario
	 *            O funcion�rio.
	 * @return O valor a ser descontado do sal�rio.
	 */
	double calcular(Funcionario funcionario);

}
