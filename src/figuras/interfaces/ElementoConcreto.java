package figuras.interfaces;

import visitors.Visitor;

public interface ElementoConcreto {
	public <T> T aceitaVisita(Visitor<T> visitor);
}
