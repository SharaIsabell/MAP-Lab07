package figuras;

import figuras.excecoes.TrianguloException;
import figuras.interfaces.ElementoConcreto;
import visitors.Visitor;

public class Triangulo implements ElementoConcreto{
	private double lado1, lado2, lado3;
	
	public Triangulo(double lado1, double lado2, double lado3){
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		if(trianguloNaoValido()) {
			throw new TrianguloException("Um dos lados do triângulo é maior do que o outro. Logo, o triângulo não é válido");
		}
	}

	@Override
	public <T> T aceitaVisita(Visitor<T> visitor) {
		return visitor.visitaTriangulo(this);
		
	}
	
	private boolean trianguloNaoValido() {
		return ((lado1 + lado2 < lado3) || (lado1 + lado3 < lado2) || (lado2 + lado3 < lado1));
	}
	
	//Getter
	
	public double[] getLados() {
		return new double[] {lado1, lado2, lado3};
	}

}
