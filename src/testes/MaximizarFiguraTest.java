package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;
import figuras.excecoes.TrapezioException;
import visitors.MaximizarFigura;
import visitors.Visitor;

public class MaximizarFiguraTest {

	static Visitor<String> visitorMF;
	static Circulo circulo;
	static Retangulo retangulo;
	static Trapezio trapezio;
	static Triangulo triangulo;
	
	@BeforeClass
	public static void criarObjetos() throws TrapezioException{
		visitorMF = new MaximizarFigura();
		circulo = new Circulo(8);
		retangulo = new Retangulo(4, 5);
		trapezio = new Trapezio(2, 4, 6, 10, 7);
		triangulo = new Triangulo(7, 5, 6);
	}
	
	@Test
	public void visitaRetanguloTest() {
		assertEquals("Retângulo maximizado com largura 10.0 e altura 8.0", retangulo.aceitaVisita(visitorMF));
	}
	
	@Test
	public void visitaTrianguloTest() {
		assertEquals("Triângulo maximizado com lados 14.0, 10.0 e 12.0", triangulo.aceitaVisita(visitorMF));
	}
	
	@Test
	public void visitaCirculoTest() {
		assertEquals("Círculo maximizado com raio 16.0", circulo.aceitaVisita(visitorMF));
	}

	@Test
	public void visitaTrapezioTest() {
		assertEquals("Trapézio maximizado com base menor 8.0, base maior 4.0, lado 12.0 e 20.0 e altura 14.0", trapezio.aceitaVisita(visitorMF));
	}

}
