package logica;

public class Division extends OperadorBinario {
	
	
    public Division(String id, Expresion exp1, Expresion exp2) {
		super(id, exp1, exp2);
	}

	public double evaluar() {
        return exp1.evaluar() / exp2.evaluar();
    }
}
