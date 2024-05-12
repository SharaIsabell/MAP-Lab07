package visitors;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public class MaximizarFigura implements Visitor{

	@Override
	public double visitaRetangulo(Retangulo retangulo) {
		return 0;
	}

	@Override
	public double visitaTriangulo(Triangulo triangulo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double visitaCirculo(Circulo circulo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double visitaTrapezio(Trapezio trapezio) {
		// TODO Auto-generated method stub
		return 0;
	}

}
