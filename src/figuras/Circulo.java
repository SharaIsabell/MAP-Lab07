package figuras;

import figuras.excecoes.CirculoException;
import figuras.interfaces.ElementoConcreto;
import visitors.Visitor;

public class Circulo implements ElementoConcreto{
	public static final double PI = 3.14;
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
		if(raio <= 0) {
			throw new CirculoException("Raio inválido");
		}
	}

	@Override
	public <T> T aceitaVisita(Visitor<T> visitor) {
		return visitor.visitaCirculo(this);
	}

	public double getRaio() {
		return raio;
	}

}
