package logica;

public class Neg extends OperadorUnario {

    public Neg(String id, Expresion exp) {
		super(id, exp);
	}

	public double evaluar() {
        return exp.evaluar() * -1;
    }
}
