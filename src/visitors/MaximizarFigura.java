package visitors;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public class MaximizarFigura implements Visitor<String>{
	@Override
	public String visitaRetangulo(Retangulo retangulo) {
		double alturaMaximizada = retangulo.getAltura() * 2;
		double larguraMaximizada = retangulo.getLargura() * 2;
		return "Retângulo maximizado com largura " + larguraMaximizada + " e altura " + alturaMaximizada;
	}

	@Override
	public String visitaTriangulo(Triangulo triangulo) {
		double lado1Maximizado = triangulo.getLados()[0] * 2;
		double lado2Maximizado = triangulo.getLados()[1] * 2;
		double lado3Maximizado = triangulo.getLados()[2] * 2;
		return "Triângulo maximizado com lados " + lado1Maximizado + ", " + lado2Maximizado + " e " + lado3Maximizado;
	}

	@Override
	public String visitaCirculo(Circulo circulo) {
		double raioMaximizado = circulo.getRaio() * 2;
		return "Círculo maximizado com raio " + raioMaximizado;
	}

	@Override
	public String visitaTrapezio(Trapezio trapezio) {
		double baseMenorMaximizada = trapezio.getBaseMenor() * 2;
		double baseMaiorMaximizada = trapezio.getBaseMaior() * 2;
		double lado1Maximizada = trapezio.getLado1() * 2;
		double lado2Maximizada = trapezio.getLado2() * 2;
		double alturaMaximizada = trapezio.getAltura() * 2;
		
		return "Trapézio maximizado com base menor " + baseMenorMaximizada + ", base maior " + baseMaiorMaximizada 
		+ ", lado " + lado1Maximizada + " e " + lado2Maximizada + " e altura " + alturaMaximizada;
	}

}
