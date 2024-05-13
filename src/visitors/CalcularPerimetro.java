package visitors;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public class CalcularPerimetro implements Visitor<Double>{

	@Override
	public Double visitaRetangulo(Retangulo retangulo) {
		return (retangulo.getAltura() * 2) + (2 * retangulo.getLargura());
	}

	@Override
	public Double visitaTriangulo(Triangulo triangulo) {
		double perimetro = 0;
		for(double lado : triangulo.getLados()) {
			perimetro += lado;
		}
		return perimetro;
	}

	@Override
	public Double visitaCirculo(Circulo circulo) {
		return 2 * Circulo.PI * circulo.getRaio();
	}

	@Override
	public Double visitaTrapezio(Trapezio trapezio) {
		return trapezio.getBaseMaior() + trapezio.getBaseMenor() + trapezio.getLado1() + trapezio.getLado2();
	}

}
