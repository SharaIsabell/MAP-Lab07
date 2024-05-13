package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;
import figuras.excecoes.TrapezioException;
import visitors.CalcularPerimetro;
import visitors.Visitor;

public class CalcularPerimetroTest {

	static Visitor<Double> visitorCP;
	static Circulo circulo;
	static Retangulo retangulo;
	static Trapezio trapezio;
	static Triangulo triangulo;
	
	@BeforeClass
	public static void criarObjetos() throws TrapezioException{
		visitorCP = new CalcularPerimetro();
		circulo = new Circulo(8);
		retangulo = new Retangulo(4, 5);
		trapezio = new Trapezio(2, 4, 6, 10, 7);
		triangulo = new Triangulo(7, 5, 6);
	}
	
	@Test
	public void visitaRetanguloTest() {
		assertEquals(18, retangulo.aceitaVisita(visitorCP), 0);
	}
	
	@Test
	public void visitaTrianguloTest() {
		assertEquals(18, triangulo.aceitaVisita(visitorCP), 1);
	}
	
	@Test
	public void visitaCirculoTest() {
		assertEquals(50.24, circulo.aceitaVisita(visitorCP), 1);
	}

	@Test
	public void visitaTrapezioTest() {
		assertEquals(22, trapezio.aceitaVisita(visitorCP), 1);
	}

}
