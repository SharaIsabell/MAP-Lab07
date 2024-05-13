package figuras;

import figuras.excecoes.RetanguloException;
import figuras.interfaces.ElementoConcreto;
import visitors.Visitor;

public class Retangulo implements ElementoConcreto{
	private double altura, largura;
	
	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
		if(!retanguloValido()) {
			throw new RetanguloException("Altura ou largura do retângulo inválidos");
		}
	}
	
	@Override
	public <T> T aceitaVisita(Visitor<T> visitor) {
		return visitor.visitaRetangulo(this);
	}
	
	//Getters

	public double getAltura() {
		return altura;
	}

	public double getLargura() {
		return largura;
	}
	
	private boolean retanguloValido() {
		return(altura > 0 || largura > 0);
	}
}
