package es2.tdd.calculadorasalario;

public class CalculadorDescontoCargo implements CalculadorDesconto {

	@Override
	public double calcular(Funcionario funcionario) {
		if(funcionario.getmCargo() == Cargo.DESENVOLVEDOR){
			if(funcionario.getmSalarioLiquido() >= 3000){
				return funcionario.getmSalarioLiquido()*0.20;
			}
			return funcionario.getmSalarioLiquido()*0.10;
		} else if(funcionario.getmCargo() == Cargo.DBA || funcionario.getmCargo() == Cargo.TESTADOR){
			if(funcionario.getmSalarioLiquido() >= 2000){
				return funcionario.getmSalarioLiquido()*.25;
			}
			return funcionario.getmSalarioLiquido()*.15;
		} else if (funcionario.getmCargo() == Cargo.GERENTE){
			if(funcionario.getmSalarioLiquido() >= 5000){
				return funcionario.getmSalarioLiquido()*.30;
			} 
			return funcionario.getmSalarioLiquido()*.20;
		}
		return funcionario.getmSalarioLiquido();
	}
}
