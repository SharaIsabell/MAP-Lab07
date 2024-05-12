package figuras.excecoes;

public class TrianguloException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public TrianguloException(String mensagem) {
		super(mensagem);
	}
}
