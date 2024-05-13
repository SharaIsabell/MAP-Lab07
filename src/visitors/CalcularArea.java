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
		 double semiPerimetro = (triangulo.getLados()[1] + triangulo.getLados()[2] + triangulo.getLados()[3]) / 2;
		 double area = Math.sqrt(semiPerimetro * (semiPerimetro - triangulo.getLados()[1]) * (semiPerimetro - triangulo.getLados()[2]) * (semiPerimetro - triangulo.getLados()[3]));
		 return area;
	}

	@Override
	public Double visitaCirculo(Circulo circulo) {
		return circulo.PI * Math.pow(circulo.getRaio(), 2);
	}

	@Override
	public Double visitaTrapezio(Trapezio trapezio) {
		return ((trapezio.getBaseMaior() + trapezio.getBaseMenor()) * trapezio.getAltura()) / 2;
	}

}
