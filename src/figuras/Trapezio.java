package figuras;

import figuras.excecoes.TrapezioException;
import figuras.interfaces.ElementoConcreto;
import visitors.Visitor;

public class Trapezio implements ElementoConcreto{
	private double baseMaior, baseMenor, lado1, lado2, altura;

	public Trapezio(double baseMaior, double baseMenor, double lado1, double lado2, double altura) throws TrapezioException {
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.altura = altura;
		if(trapezioInvalido()) {
			throw new TrapezioException("Um dos parâmetros é menor do que zero.");
		}
	}

	@Override
	public <T> T aceitaVisita(Visitor<T> visitor) {
		return visitor.visitaTrapezio(this);
	}

	public double getBaseMaior() {
		return baseMaior;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public double getLado1() {
		return lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public double getAltura() {
		return altura;
	}
	
	private boolean trapezioInvalido(){
		return (baseMenor <= 0 || baseMaior <= 0 || lado1 <= 0 || lado2 <= 0 || altura <= 0);
	}

}
