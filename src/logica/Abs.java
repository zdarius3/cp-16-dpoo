package logica;

public class Abs extends OperadorUnario {
	public Abs(String id, Expresion exp) {
		super(id, exp);
	}

	public double evaluar() {
        return Math.abs(exp.evaluar());
    }
}
