package es2.tdd.calculadorasalario;

/**
 * Classe responsavel por manter as informações de funcionário
 * 
 * @author Marcos Nascimento
 * @since 11-26-2016
 */
public class Funcionario {
	private String mNome, mEmail;
	private double mSalario;
	private Cargo mCargo;
	private CalculadorDesconto mCalculador;

	public Funcionario(String nome, String email, double salario, Cargo cargo) throws Exception {
		if (nome == null || nome.isEmpty()) {
			throw new Exception("Nome não pode ser nulo ou vazio.");
		}
		if (email == null || email.isEmpty()) {
			throw new Exception("E-mail não pode ser nulo ou vazio.");
		}
		if (salario <= 0) {
			throw new Exception("Salário não pode ser menor ou igual a zero.");
		}
		if (cargo == null) {
			throw new Exception("Cargo não pode ser nulo.");
		}
		mNome = nome;
		mEmail = email;
		mSalario = salario;
		mCargo = cargo;
	}

	/**
	 * Seta o calculador de desconto do salário.
	 * 
	 * @param calculador
	 *            A estratégia que irá realizar o cálculo de desconto.
	 */
	public void setCalculadorDesconto(CalculadorDesconto calculador) {
		mCalculador = calculador;
	}

	/**
	 * Retorna o salário com desconto.
	 * 
	 * @return O valor do salário.
	 */
	public double getmSalario() {
		if (mCalculador == null) {
			return getmSalarioLiquido();
		}
		return getmSalarioLiquido() - mCalculador.calcular(this);
	}

	/**
	 * Retorna o salário sem desconto.
	 * 
	 * @return O valor do salário.
	 */
	public double getmSalarioLiquido() {
		return mSalario;
	}

	/**
	 * Seta o valor de salário.
	 * 
	 * @param mSalario
	 *            O valor do salário.
	 * @throws Exception
	 *             Se o valor de salário for inferior ou igual à zero.
	 */
	public void setmSalario(double mSalario) throws Exception {
		if (mSalario <= 0) {
			throw new Exception("Salário não pode ser menor ou igual a zero.");
		}
		this.mSalario = mSalario;
	}

	/**
	 * Retorna o cargo.
	 * 
	 * @return O cargo.
	 */
	public Cargo getmCargo() {
		return mCargo;
	}

	/**
	 * Seta o cargo.
	 * 
	 * @param mCargo
	 *            O valor do salário.
	 * @throws Exception
	 *             Se o cargo for nulo.
	 */
	public void setmCargo(Cargo mCargo) throws Exception {
		if (mCargo == null) {
			throw new Exception("Cargo não pode ser nulo.");
		}
		this.mCargo = mCargo;
	}
}