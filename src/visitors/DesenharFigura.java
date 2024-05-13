package visitors;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public class DesenharFigura implements Visitor<String>{

	@Override
	public String visitaRetangulo(Retangulo retangulo) {
		return "Retângulo com largura " + retangulo.getLargura() + " e altura " + retangulo.getAltura();
	}

	@Override
	public String visitaTriangulo(Triangulo triangulo) {
		return "Triângulo com lados " + triangulo.getLados()[0] + ", " + triangulo.getLados()[1] + " e " + triangulo.getLados()[2];
	}

	@Override
	public String visitaCirculo(Circulo circulo) {
		return "Círculo com raio " + circulo.getRaio();
	}

	@Override
	public String visitaTrapezio(Trapezio trapezio) {
		return "Trapézio com base menor " + trapezio.getBaseMenor() + ", base maior " + trapezio.getBaseMaior() 
		+ ", lado " + trapezio.getLado1() + " e " + trapezio.getLado2() + " e altura " + trapezio.getAltura();
	}

}
