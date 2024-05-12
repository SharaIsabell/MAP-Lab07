package figuras;

import figuras.excecoes.TrapezioException;
import figuras.interfaces.ElementoConcreto;
import visitors.Visitor;

public class Trapezio implements ElementoConcreto{
	private double baseMaior, baseMenor, lado1, lado2, altura;

	public Trapezio(double baseMaior, double baseMenor, double lado1, double lado2) throws TrapezioException {
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.altura = calcularAltura();
		if(trapezioInvalido()) {
			throw new TrapezioException("Um dos parâmetros é menor do que zero.");
		}
	}

	@Override
	public void aceitaVisita(Visitor visitor) {
		visitor.visitaTrapezio(this);
		
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

	private double calcularAltura(){
		 double cateto1= (baseMaior - baseMenor) / 2;
		 altura = Math.sqrt(Math.pow(cateto1, 2) - Math.pow(lado1, 2));
		 return altura;
	}
	
	private boolean trapezioInvalido(){
		return (baseMenor < 0 || baseMaior < 0 || lado1 < 0 || lado2 < 0);
	}

}
