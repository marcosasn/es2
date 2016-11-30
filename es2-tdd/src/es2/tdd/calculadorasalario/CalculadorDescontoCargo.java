package es2.tdd.calculadorasalario;

public class CalculadorDescontoCargo implements CalculadorDesconto {
	
	private final int SALARIO_LIMIAR_DESENVOLVEDOR = 3000;
	private final int SALARIO_LIMIAR_DBA = 2000;
	private final int SALARIO_LIMIAR_GERENTE = 5000;

	@Override
	public double calcular(Funcionario funcionario) {
		if(funcionario.getmCargo() == Cargo.DESENVOLVEDOR){
			if(funcionario.getmSalarioLiquido() >= SALARIO_LIMIAR_DESENVOLVEDOR){
				return funcionario.getmSalarioLiquido()*0.20;
			}
			return funcionario.getmSalarioLiquido()*0.10;
			
		} else if(funcionario.getmCargo() == Cargo.DBA || funcionario.getmCargo() == Cargo.TESTADOR){
			if(funcionario.getmSalarioLiquido() >= SALARIO_LIMIAR_DBA){
				return funcionario.getmSalarioLiquido()*.25;
			}
			return funcionario.getmSalarioLiquido()*.15;
			
		} else if (funcionario.getmCargo() == Cargo.GERENTE){
			if(funcionario.getmSalarioLiquido() >= SALARIO_LIMIAR_GERENTE){
				return funcionario.getmSalarioLiquido()*.30;
			} 
			return funcionario.getmSalarioLiquido()*.20;
		}
		return 0.0;
	}
}
