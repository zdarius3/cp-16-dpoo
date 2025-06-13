package logica;


import java.util.ArrayList;

public class Controladora {
	private String id;
	private ArrayList<Evaluable> expresiones;

	public Controladora(String id) {
		setId(id);
		this.expresiones = new ArrayList<>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id.replaceAll(" ", "").equals("")) {
			throw new IllegalArgumentException("La id no puede estar vacía.");
		}
		else { 
			this.id = id;
		}
	}

	public void addExpresion(Expresion e) {
		expresiones.add(e);
	}

	//inciso d
	public ArrayList<Expresion> obtenerExpMayorResultado() {
		double mayor = Double.MIN_VALUE;
		ArrayList<Expresion> exp = new ArrayList<>();
		for (Evaluable e: expresiones) {
			if (e.evaluar() > mayor) {
				mayor = e.evaluar();
				exp.clear();
				exp.add((Expresion) e);
			}
			else if (e.evaluar() == mayor) {
				exp.add((Expresion) e);
			}
		}
		return exp;
	}

	//inciso e
	public boolean hayExpresionConSuma() {
		boolean res = false;
		int i = 0;
		while (!res && i < expresiones.size()) {
			Expresion aux = (Expresion) expresiones.get(i);
            res = buscarSumaEnExpresion(aux);
			i++;
		}
		return res;
	}

	private boolean buscarSumaEnExpresion(Expresion exp) {
		boolean resAux = false;
 		if (exp instanceof Suma) {
 			resAux = true;
 		}
 		else if (exp instanceof OperadorBinario) {
			OperadorBinario aux = (OperadorBinario) exp;
			Expresion exp1aux = aux.getExp1();
			Expresion exp2aux = aux.getExp2();
			resAux = buscarSumaEnExpresion(exp1aux);
			if(!resAux) {
				resAux = buscarSumaEnExpresion(exp2aux);
			}
		}
		else if (exp instanceof OperadorUnario) {
			OperadorUnario aux2 = (OperadorUnario) exp;
			Expresion expAux = aux2.getExp();
			resAux = buscarSumaEnExpresion(expAux);
		}
		return resAux;
	}
}
