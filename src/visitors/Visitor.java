package visitors;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public interface Visitor<T> {
	T visitaRetangulo(Retangulo retangulo);
	T visitaTriangulo(Triangulo triangulo);
	T visitaCirculo(Circulo circulo);
	T visitaTrapezio(Trapezio trapezio);

}
