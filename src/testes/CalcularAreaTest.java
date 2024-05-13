package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;
import figuras.excecoes.TrapezioException;
import visitors.CalcularArea;
import visitors.Visitor;

public class CalcularAreaTest {

	static Visitor<Double> visitorCA;
	static Circulo circulo;
	static Retangulo retangulo;
	static Trapezio trapezio;
	static Triangulo triangulo;
	
	@BeforeClass
	public static void criarObjetos() throws TrapezioException{
		visitorCA = new CalcularArea();
		circulo = new Circulo(8);
		retangulo = new Retangulo(4, 5);
		trapezio = new Trapezio(2, 4, 6, 10, 7);
		triangulo = new Triangulo(7, 5, 6);
	}
	
	@Test
	public void visitaRetanguloTest() {
		assertEquals(20, retangulo.aceitaVisita(visitorCA), 0);
	}
	
	@Test
	public void visitaTrianguloTest() {
		assertEquals(14, triangulo.aceitaVisita(visitorCA), 1);
	}
	
	@Test
	public void visitaCirculoTest() {
		assertEquals(200.96, circulo.aceitaVisita(visitorCA), 1);
	}

	@Test
	public void visitaTrapezioTest() {
		assertEquals(21, trapezio.aceitaVisita(visitorCA), 1);
	}
}
