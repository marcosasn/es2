package es2.tdd.calculadorasalario;

public class CalculadorPorCargo implements Calculador {

	@Override
	public double calcular(Funcionario funcionario) {
		if(funcionario.getmCargo() == Cargo.DESENVOLVEDOR){
			if(funcionario.getmSalario() >= 3000){
				return funcionario.getmSalario() - funcionario.getmSalario()*0.20;
			} else {
				return funcionario.getmSalario() - funcionario.getmSalario()*0.10;
			}
			
		} else if(funcionario.getmCargo() == Cargo.DBA){
			if(funcionario.getmSalario() >= 2000){
				return funcionario.getmSalario() - funcionario.getmSalario()*.25;
			} else {
				return funcionario.getmSalario() - funcionario.getmSalario()*.15;
			}
		} else if(funcionario.getmCargo() == Cargo.TESTADOR){
			if(funcionario.getmSalario() >= 2000){
				return funcionario.getmSalario() - funcionario.getmSalario()*.25;
			} else {
				return funcionario.getmSalario() - funcionario.getmSalario()*.15;
			}
		} else if (funcionario.getmCargo() == Cargo.GERENTE){
			if(funcionario.getmSalario() >= 5000){
				return funcionario.getmSalario() - funcionario.getmSalario()*.30;
			} else {
				return funcionario.getmSalario() - funcionario.getmSalario()*.20;
			}
		}
		return 0;
	}
}
