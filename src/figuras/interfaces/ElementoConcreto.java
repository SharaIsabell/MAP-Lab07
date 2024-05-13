package figuras.interfaces;

import visitors.Visitor;

public interface ElementoConcreto {
	public <T> void aceitaVisita(Visitor<T> visitor);
}
