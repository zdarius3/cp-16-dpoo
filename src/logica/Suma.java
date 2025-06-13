package logica;

public class Suma extends OperadorBinario {
    public Suma(String id, Expresion exp1, Expresion exp2) {
		super(id, exp1, exp2);
	}

	public double evaluar() {
        return exp1.evaluar() + exp2.evaluar();
    }
}
