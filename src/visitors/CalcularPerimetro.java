package visitors;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public class CalcularPerimetro implements Visitor{

	@Override
	public double visitaRetangulo(Retangulo retangulo) {
		return (retangulo.getAltura() * 2) + (2 * retangulo.getLargura());
	}

	@Override
	public double visitaTriangulo(Triangulo triangulo) {
		double perimetro = 0;
		for(double lado : triangulo.getLados()) {
			perimetro += lado;
		}
		return perimetro;
	}

	@Override
	public double visitaCirculo(Circulo circulo) {
		return 2 * circulo.PI * circulo.getRaio();
	}

	@Override
	public double visitaTrapezio(Trapezio trapezio) {
		return trapezio.getBaseMaior() + trapezio.getBaseMenor() + trapezio.getLado1() + trapezio.getLado2();
	}

}
