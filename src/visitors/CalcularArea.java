package visitors;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public class CalcularArea implements Visitor{

	@Override
	public double visitaRetangulo(Retangulo retangulo) {
		return retangulo.getAltura() * retangulo.getLargura();
	}

	@Override
	public double visitaTriangulo(Triangulo triangulo) {
		 double semiPerimetro = (triangulo.getLados()[1] + triangulo.getLados()[2] + triangulo.getLados()[3]) / 2;
		 double area = Math.sqrt(semiPerimetro * (semiPerimetro - triangulo.getLados()[1]) * (semiPerimetro - triangulo.getLados()[2]) * (semiPerimetro - triangulo.getLados()[3]));
		 return area;
	}

	@Override
	public double visitaCirculo(Circulo circulo) {
		return circulo.PI * Math.pow(circulo.getRaio(), 2);
	}

	@Override
	public double visitaTrapezio(Trapezio trapezio) {
		return ((trapezio.getBaseMaior() + trapezio.getBaseMenor()) * trapezio.getAltura()) / 2;
	}

}
