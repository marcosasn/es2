package es2.tdd.calculadorasalario;

public class Funcionario {
	private String mNome, mEmail;
	private double mSalario;
	private Cargo mCargo;
	private CalculadorDesconto mCalculador;

	public Funcionario(String nome, String email, double salario, Cargo cargo) throws Exception {
		if(nome == null || nome.isEmpty()){
			throw new Exception("Nome n�o pode ser nulo ou vazio.");
		}
		if(email == null || email.isEmpty()){
			throw new Exception("E-mail n�o pode ser nulo ou vazio.");
		}
		if(salario <= 0){
			throw new Exception("Sal�rio n�o pode ser menor ou igual a zero.");
		}
		if(cargo == null){
			throw new Exception("Cargo n�o pode ser nulo.");
		}
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

	public void setmSalario(int mSalario) throws Exception {
		if(mSalario <= 0){
			throw new Exception("Sal�rio n�o pode ser menor ou igual a zero.");
		}
		this.mSalario = mSalario;
	}

	public Cargo getmCargo() {
		return mCargo;
	}

	public void setmCargo(Cargo mCargo) throws Exception {
		if(mCargo == null){
			throw new Exception("Cargo n�o pode ser nulo.");
		}
		this.mCargo = mCargo;
	}
}