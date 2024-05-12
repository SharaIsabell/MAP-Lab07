package figuras.excecoes;

public class TrapezioException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public TrapezioException(String mensagem) {
		super(mensagem);
	}
}
