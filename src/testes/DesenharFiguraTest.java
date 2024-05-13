package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;
import figuras.excecoes.TrapezioException;
import visitors.DesenharFigura;
import visitors.Visitor;

public class DesenharFiguraTest {

	static Visitor<String> visitorDF;
	static Circulo circulo;
	static Retangulo retangulo;
	static Trapezio trapezio;
	static Triangulo triangulo;
	
	@BeforeClass
	public static void criarObjetos() throws TrapezioException{
		visitorDF = new DesenharFigura();
		circulo = new Circulo(8);
		retangulo = new Retangulo(4, 5);
		trapezio = new Trapezio(2, 4, 6, 10, 7);
		triangulo = new Triangulo(7, 5, 6);
	}
	
	@Test
	public void visitaRetanguloTest() {
		assertEquals("Retângulo com largura 5.0 e altura 4.0", retangulo.aceitaVisita(visitorDF));
	}
	
	@Test
	public void visitaTrianguloTest() {
		assertEquals("Triângulo com lados 7.0, 5.0 e 6.0", triangulo.aceitaVisita(visitorDF));
	}
	
	@Test
	public void visitaCirculoTest() {
		assertEquals("Círculo com raio 8.0", circulo.aceitaVisita(visitorDF));
	}

	@Test
	public void visitaTrapezioTest() {
		assertEquals("Trapézio com base menor 4.0, base maior 2.0, lado 6.0 e 10.0 e altura 7.0", trapezio.aceitaVisita(visitorDF));
	}

}
