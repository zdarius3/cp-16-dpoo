package logica;

public abstract class Expresion implements Evaluable {
	private String id;

	public String getId() {
		return id;
	}

	public Expresion(String id) {
		this.id = id;
	}
	
	
    
}
