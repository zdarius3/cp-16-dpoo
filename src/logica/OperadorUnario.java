package logica;

public abstract class OperadorUnario extends Expresion {
	
    protected Expresion exp;
    
    public OperadorUnario(String id, Expresion exp) {
    	super(id);
		this.exp = exp;
	}


	public Expresion getExp() {
        return exp;
    }
}
