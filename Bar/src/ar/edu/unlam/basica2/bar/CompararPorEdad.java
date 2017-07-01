package ar.edu.unlam.basica2.bar;

import java.util.Comparator;

public class CompararPorEdad implements Comparator<Cliente>{

	@Override
	public int compare(Cliente cliente1, Cliente cliente2) {
		return cliente1.getEdad() - cliente2.getEdad();
	}
	
	

}
