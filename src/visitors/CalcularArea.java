package visitors;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public class CalcularArea implements Visitor<Double>{

	@Override
	public Double visitaRetangulo(Retangulo retangulo) {
		return retangulo.getAltura() * retangulo.getLargura();
	}

	@Override
	public Double visitaTriangulo(Triangulo triangulo) {
		 double semiPerimetro = (triangulo.getLados()[0] + triangulo.getLados()[1] + triangulo.getLados()[2]) / 2;
		 double area = Math.sqrt(semiPerimetro * (semiPerimetro - triangulo.getLados()[0]) * (semiPerimetro - triangulo.getLados()[1]) * (semiPerimetro - triangulo.getLados()[2]));
		 return area;
	}

	@Override
	public Double visitaCirculo(Circulo circulo) {
		return Circulo.PI * Math.pow(circulo.getRaio(), 2);
	}

	@Override
	public Double visitaTrapezio(Trapezio trapezio) {
		return ((trapezio.getBaseMaior() + trapezio.getBaseMenor()) * trapezio.getAltura()) / 2;
	}

}
