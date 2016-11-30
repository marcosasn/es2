package es2.tdd.calculadorasalario;

public class Funcionario {
	private String mNome, mEmail;
	private double mSalario;
	private Cargo mCargo;
	private CalculadorDesconto mCalculador;

	public Funcionario(String nome, String email, double salario, Cargo cargo) {
		mNome = nome;
		mEmail = email;
		mSalario = salario;
		mCargo = cargo;
	}
	
	public void setCalculadorDesconto(CalculadorDesconto calculador){
		mCalculador = calculador;
	}

	public double getmSalario() {
		if(mCalculador == null){
			return getmSalarioLiquido();
		}
		return getmSalarioLiquido() - mCalculador.calcular(this);
	}
		
	public double getmSalarioLiquido() {
		return mSalario;
	}

	public void setmSalario(int mSalario) {
		this.mSalario = mSalario;
	}

	public Cargo getmCargo() {
		return mCargo;
	}

	public void setmCargo(Cargo mCargo) {
		this.mCargo = mCargo;
	}
}