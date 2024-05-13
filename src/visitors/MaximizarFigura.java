package visitors;

import java.util.ArrayList;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public class MaximizarFigura implements Visitor<String>{ // Falta fazer

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
