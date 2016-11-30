package es2.tdd.testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import es2.tdd.calculadorasalario.CalculadoraSalario;
import es2.tdd.calculadorasalario.Cargo;
import es2.tdd.calculadorasalario.Funcionario;

public class CalculadoraSalarioTest {
	private CalculadoraSalario cs;
	private List<Funcionario> funcionarios;
	private int[] salarios = {1000,2000,3000,5000};
	private int[] outros = {999, 1001, 1999, 2001, 2999, 3001, 4999, 5001, 0, -1};
	private String[] nomes = {"Antônio Silvestre", "Matheus Solares", "Rodrigo Campos", "Marcos Nascimento"};
	private String[] emails = {"antonio.silvestre@gmail.com", "matheus.solares@gmail.com", "rodrigo.campos@gmail.com",
			"marcos.nascimento@gmail.com"};
	private Cargo[] cargos = {Cargo.DESENVOLVEDOR, Cargo.DBA, Cargo.TESTADOR, Cargo.GERENTE};

	@Before
	public void setUp() throws Exception {}
	
	@Test
	public void Inittest() {
		assertNull(cs);
		assertNull(funcionarios);
	}
	
	@Test
	public void desenvolvedorTest() {
		funcionarios = new ArrayList<Funcionario>();
		cs =  new CalculadoraSalario();
		
		assertNotNull(cs);
		assertNotNull(funcionarios);
		assertEquals(cs.calcular(), 0, 0);
		
		cs.addFuncionario(new Funcionario(nomes[0],emails[0],salarios[1],cargos[0]));
		assertEquals(cs.calcular(), 1800, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[0],emails[0],salarios[2],cargos[0]));
		assertEquals(cs.calcular(), 2400, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[0],emails[0],salarios[0],cargos[0]));
		assertEquals(cs.calcular(), 900, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[0],emails[0],salarios[3],cargos[0]));
		assertEquals(cs.calcular(), 4000, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[0],emails[0],outros[4],cargos[0]));
		assertEquals(outros[4]-(outros[4]*0.10), cs.calcular(), 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[0],emails[0],outros[5],cargos[0]));
		assertEquals(outros[5]-(outros[5]*0.20), cs.calcular(), 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[0],emails[0],outros[8],cargos[0]));
		assertEquals(outros[8]-(outros[8]*0.10), cs.calcular(), 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[0],emails[0],outros[9],cargos[0]));
		assertEquals(outros[9]-(outros[9]*0.10), cs.calcular(), 0);
	}
	
	@Test
	public void dbaTest() {
		funcionarios = new ArrayList<Funcionario>();
		cs =  new CalculadoraSalario();
		
		assertNotNull(cs);
		assertNotNull(funcionarios);
		assertEquals(cs.calcular(), 0, 0);
		
		cs.addFuncionario(new Funcionario(nomes[1],emails[1],salarios[1],cargos[1]));
		assertEquals(cs.calcular(), 1500, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[1],emails[1],salarios[0],cargos[1]));
		assertEquals(cs.calcular(), 850, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[1],emails[1],salarios[2],cargos[1]));
		assertEquals(cs.calcular(), 2250, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[1],emails[1],salarios[3],cargos[1]));
		assertEquals(cs.calcular(), 3750, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[1],emails[1],outros[2],cargos[1]));
		assertEquals(cs.calcular(), outros[2]-outros[2]*0.15, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[1],emails[1],outros[3],cargos[1]));
		assertEquals(cs.calcular(), outros[3]-outros[3]*0.25, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[1],emails[1],outros[8],cargos[1]));
		assertEquals(cs.calcular(), outros[8]-outros[8]*0.15, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[1],emails[1],outros[9],cargos[1]));
		assertEquals(cs.calcular(), outros[9]-outros[9]*0.15, 0);
	}
	
	@Test
	public void testadorTest() {
		funcionarios = new ArrayList<Funcionario>();
		cs =  new CalculadoraSalario();
		
		assertNotNull(cs);
		assertNotNull(funcionarios);
		assertEquals(cs.calcular(), 0, 0);
		
		cs.addFuncionario(new Funcionario(nomes[2],emails[2],salarios[1],cargos[2]));
		assertEquals(cs.calcular(), 1500, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[2],emails[2],salarios[0],cargos[2]));
		assertEquals(cs.calcular(), 850, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[2],emails[2],salarios[2],cargos[2]));
		assertEquals(cs.calcular(), 2250, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[2],emails[2],salarios[3],cargos[2]));
		assertEquals(cs.calcular(), 3750, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[2],emails[2],outros[2],cargos[2]));
		assertEquals(cs.calcular(), outros[2]-outros[2]*0.15, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[2],emails[2],outros[3],cargos[2]));
		assertEquals(cs.calcular(), outros[3]-outros[3]*0.25, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[2],emails[2],outros[8],cargos[2]));
		assertEquals(cs.calcular(), outros[8]-outros[8]*0.15, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[2],emails[2],outros[9],cargos[2]));
		assertEquals(cs.calcular(), outros[9]-outros[9]*0.15, 0);
	}
	
	@Test
	public void gerenteTest() {
		funcionarios = new ArrayList<Funcionario>();
		cs =  new CalculadoraSalario();
		
		assertNotNull(cs);
		assertNotNull(funcionarios);
		assertEquals(cs.calcular(), 0, 0);
		
		cs.addFuncionario(new Funcionario(nomes[3],emails[3],salarios[1],cargos[3]));
		assertEquals(cs.calcular(), 1600, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[3],emails[3],salarios[0],cargos[3]));
		assertEquals(cs.calcular(), 800, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[3],emails[3],salarios[2],cargos[3]));
		assertEquals(cs.calcular(), 2400, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[3],emails[3],salarios[3],cargos[3]));
		assertEquals(cs.calcular(), 3500, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[3],emails[3],outros[6],cargos[3]));
		assertEquals(cs.calcular(), outros[6]-outros[6]*.20, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[3],emails[3],outros[7],cargos[3]));
		assertEquals(cs.calcular(), outros[7]-outros[7]*.30, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[3],emails[3],outros[8],cargos[3]));
		assertEquals(cs.calcular(), outros[8]-outros[8]*.20, 0);
		cs.resetarListaFuncionarios();
		cs.addFuncionario(new Funcionario(nomes[3],emails[3],outros[9],cargos[3]));
		assertEquals(cs.calcular(), outros[9]-outros[9]*.20, 0);
	}
	
	public void popularListaFuncionarios(){
		for(int i=0; i<4; i++){
			funcionarios.add(new Funcionario(nomes[i],emails[i],salarios[0],cargos[i]));
		}
	}
}