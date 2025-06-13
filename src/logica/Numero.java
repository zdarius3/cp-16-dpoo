package logica;

public class Numero extends Expresion {
    private double valor;
    
    public Numero(String id, int v) {
    	super(id);
    	valor = v;
    }
    
    public double evaluar() {
        return valor;
    }
}
