package ar.edu.unlam.basica2.bar;

import java.util.Comparator;

public class CompararPorNombre implements Comparator<Cliente>{

	@Override
	public int compare(Cliente cliente1, Cliente cliente2) {
		return cliente1.getNombre().compareTo(cliente2.getNombre());
	}
	

}
