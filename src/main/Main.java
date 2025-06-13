package main;
import java.util.ArrayList;
import java.util.ResourceBundle.Control;

import logica.*;

public class Main {
    public static void main (String[] args) {
    	Controladora c = new Controladora("1");
    	Suma s1 = new Suma("suma1", new Numero(null,9), new Resta(null,new Numero(null, 5), new Numero(null, 3)));
    	Resta r1 = new Resta("resta1", new Numero(null, 5), new Resta(null, new Numero(null, 5), 
    			new Numero(null, 3)));
    	Multiplicacion m1 = new Multiplicacion("mult1", new Numero(null, 5), 
    			new Resta(null, new Numero(null, 5), new Numero(null, 3)));
    	Division d1 = new Division("div1", new Numero(null, 5), new Resta(null, new Numero(null, 5), 
    			new Numero(null, 3)));
    	Abs abs1 = new Abs("abs1", new Suma(null, new Numero(null, 2), new Numero(null, -3)));
    	
    	c.addExpresion(r1);
    	c.addExpresion(m1);
    	c.addExpresion(d1);
    	c.addExpresion(abs1);
    	//c.addExpresion(s1);  quitando la suma pura para dejar una resta que contiene sumas
    	
    	
    	//inciso d
    	ArrayList<Expresion> expMayor =  c.obtenerExpMayorResultado();
    	System.out.println("Expresiones con mayor resultado: ");
    	for (Expresion e: expMayor) {
    		System.out.println("ID: " + e.getId() + " | Resultado: " + e.evaluar());
    	}
    	
    	//inciso e
    	Resta r2 = new Resta("resta1", new Numero(null, 5), new Suma(null, new Numero(null, 5), 
    			new Numero(null, 3)));
    	c.addExpresion(r2);
    	
    	boolean e = c.hayExpresionConSuma();
    	if(e) {
    		System.out.println("Sirvio");
    	}
    	else {
    		System.out.println("No sirvio");
    	}
    	
    }
    
}
