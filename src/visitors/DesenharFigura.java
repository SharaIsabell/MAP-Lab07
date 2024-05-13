package visitors;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public class DesenharFigura implements Visitor<String>{  // Falta fazer

	@Override
	public String visitaRetangulo(Retangulo retangulo) {
		return "";
	}

	@Override
	public String visitaTriangulo(Triangulo triangulo) {
		return "";
	}

	@Override
	public String visitaCirculo(Circulo circulo) {
		return "";
	}

	@Override
	public String visitaTrapezio(Trapezio trapezio) {
		return "";
	}

}
