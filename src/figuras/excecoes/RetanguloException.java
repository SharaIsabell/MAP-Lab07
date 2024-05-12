package figuras.excecoes;

public class RetanguloException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public RetanguloException(String mensagem) {
		super(mensagem);
	}
}
