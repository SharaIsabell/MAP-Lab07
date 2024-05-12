package visitors;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public interface Visitor {
	public double visitaRetangulo(Retangulo retangulo);
	public double visitaTriangulo(Triangulo triangulo);
	public double visitaCirculo(Circulo circulo);
	public double visitaTrapezio(Trapezio trapezio);

}
