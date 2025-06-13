package logica;

public abstract class OperadorBinario extends Expresion {
    protected Expresion exp1;
    protected Expresion exp2;

    
    
    public OperadorBinario(String id, Expresion exp1, Expresion exp2) {
    	super(id);
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	public Expresion getExp2() {
        return exp2;
    }

    public void setExp1(Expresion exp1) {
        this.exp1 = exp1;
    }

    public void setExp2(Expresion exp2) {
        this.exp2 = exp2;
    }

    public Expresion getExp1() {
        return exp1;
    }
}
