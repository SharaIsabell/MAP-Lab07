package aplicacao;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;
import figuras.excecoes.TrapezioException;
import visitors.CalcularArea;
import visitors.CalcularPerimetro;
import visitors.DesenharFigura;
import visitors.MaximizarFigura;
import visitors.Visitor;

public class Main {

	public static void main(String[] args) throws TrapezioException {
		Visitor<Double> visitorCA = new CalcularArea();
		Visitor<Double> visitorCP = new CalcularPerimetro();
		Visitor<String> visitorDF = new DesenharFigura();
		Visitor<String> visitorMF = new MaximizarFigura();
		Circulo circulo = new Circulo(5);
		
		System.out.println("Círculo");
		System.out.println("Área do Círculo " + circulo.aceitaVisita(visitorCA));
		System.out.printf("Perímetro do Círculo %.2f \n", circulo.aceitaVisita(visitorCP));
		System.out.println("Desenhando: " + circulo.aceitaVisita(visitorDF));
		System.out.println("Maximizando: " + circulo.aceitaVisita(visitorMF));
		
		System.out.println();
		System.out.println("Retângulo");
		Retangulo retangulo = new Retangulo(3, 2);
		
		System.out.println("Área do Retângulo " + retangulo.aceitaVisita(visitorCA));
		System.out.printf("Perímetro do Retângulo %.2f \n", retangulo.aceitaVisita(visitorCP));
		System.out.println("Desenhando: " + retangulo.aceitaVisita(visitorDF));
		System.out.println("Maximizando: " + retangulo.aceitaVisita(visitorMF));
		
		System.out.println();
		System.out.println("Trapézio");
		Trapezio trapezio = new Trapezio(2, 4, 6, 10, 7);
		
		System.out.println("Área do Trapézio " + trapezio.aceitaVisita(visitorCA));
		System.out.printf("Perímetro do Trapézio %.2f \n", trapezio.aceitaVisita(visitorCP));
		System.out.println("Desenhando: " + trapezio.aceitaVisita(visitorDF));
		System.out.println("Maximizando: " + trapezio.aceitaVisita(visitorMF));
		
		System.out.println();
		System.out.println("Triângulo");
		Triangulo triangulo = new Triangulo(2, 2, 3);
		
		System.out.printf("Área do Triângulo %.2f \n", triangulo.aceitaVisita(visitorCA));
		System.out.printf("Perímetro do Triângulo %.2f \n", triangulo.aceitaVisita(visitorCP));
		System.out.println("Desenhando: " + triangulo.aceitaVisita(visitorDF));
		System.out.println("Maximizando: " + triangulo.aceitaVisita(visitorMF));
	}

}
