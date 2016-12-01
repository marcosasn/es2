package es2.tdd.calculadorasalario;

/**
 * Classe responsavel por manter a estrat�gia de c�lculo do desconto do sal�rio
 * de um funcion�rio utilizando o crit�rio de cargo.
 * 
 * @author Marcos Nascimento
 * @since 11-26-2016
 */
public class CalculadorDescontoCargo implements CalculadorDesconto {

	private final int SALARIO_LIMIAR_DESENVOLVEDOR = 3000;
	private final int SALARIO_LIMIAR_DBA = 2000;
	private final int SALARIO_LIMIAR_GERENTE = 5000;

	/**
	 * Calcula o valor de desconto do sal�rio pelo cargo.
	 * 
	 * @param funcionario
	 *            O funcion�rio.
	 * @return O valor a ser descontado do sal�rio.
	 */
	@Override
	public double calcular(Funcionario funcionario) {
		if (funcionario.getmCargo() == Cargo.DESENVOLVEDOR) {
			if (funcionario.getmSalarioLiquido() >= SALARIO_LIMIAR_DESENVOLVEDOR) {
				return funcionario.getmSalarioLiquido() * 0.20;
			}
			return funcionario.getmSalarioLiquido() * 0.10;

		} else if (funcionario.getmCargo() == Cargo.DBA || funcionario.getmCargo() == Cargo.TESTADOR) {
			if (funcionario.getmSalarioLiquido() >= SALARIO_LIMIAR_DBA) {
				return funcionario.getmSalarioLiquido() * .25;
			}
			return funcionario.getmSalarioLiquido() * .15;

		} else if (funcionario.getmCargo() == Cargo.GERENTE) {
			if (funcionario.getmSalarioLiquido() >= SALARIO_LIMIAR_GERENTE) {
				return funcionario.getmSalarioLiquido() * .30;
			}
			return funcionario.getmSalarioLiquido() * .20;
		}
		return 0.0;
	}
}