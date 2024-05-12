package figuras.interfaces;

import visitors.Visitor;

public interface ElementoConcreto {
	public void aceitaVisita(Visitor visitor);
}
