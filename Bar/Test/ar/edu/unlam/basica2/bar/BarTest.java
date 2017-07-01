package ar.edu.unlam.basica2.bar;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class BarTest {

	@Test
	public void testQueNoHayaDuplicados() throws ExcepcionDeEdad {
		TreeSet<Cliente> miSetDeClientes = new TreeSet<Cliente>();
		Bar miBar = new Bar();
		
		Cliente cliente1 = new Cliente("Esteban", 31);
		Cliente cliente2 = new Cliente("Juan", 22);
		Cliente cliente3 = new Cliente("Esteban", 28);
		Cliente cliente4 = new Cliente("Marcos", 30);
		
		miBar.ingresarCliente(cliente1);
		miBar.ingresarCliente(cliente2);
		miBar.ingresarCliente(cliente3);
		miBar.ingresarCliente(cliente4);
		
		Integer esperado = 3;
		Integer obtenido = miBar.obtenerCantidadDeClientes();
		
		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testClientesOrdenadosPorEdad() throws ExcepcionDeEdad {
		
		Bar miBar = new Bar();
		Cliente cliente1 = new Cliente("Esteban", 31);
		Cliente cliente2 = new Cliente("Marco", 25);
		Cliente cliente3 = new Cliente("Mauro", 32);
		
		miBar.ingresarCliente(cliente1);
		miBar.ingresarCliente(cliente2);
		miBar.ingresarCliente(cliente3);

		Integer primerEsperado = 25;
		Integer ultimoEsperado = 32;
		
		Integer primerObtenido = miBar.getClientes().first().getEdad();
		Integer ultimoObtenido = miBar.getClientes().last().getEdad();
		
		Assert.assertEquals(primerEsperado, primerObtenido);
		Assert.assertEquals(ultimoEsperado, ultimoObtenido);
	}
	
	@Test
	public void testClientesOrdenadosPorNombre() throws ExcepcionDeEdad {
		
		Bar miBar = new Bar();
		Cliente cliente1 = new Cliente("Esteban", 31);
		Cliente cliente2 = new Cliente("Marco", 25);
		Cliente cliente3 = new Cliente("Alfonso", 32);
		
		miBar.ingresarCliente(cliente1);
		miBar.ingresarCliente(cliente2);
		miBar.ingresarCliente(cliente3);

		String primerEsperado = "Alfonso";
		String ultimoEsperado = "Marco";
		
		String primerObtenido = miBar.getClientes().first().getNombre();
		String ultimoObtenido = miBar.getClientes().last().getNombre();
		
		Assert.assertEquals(primerEsperado, primerObtenido);
		Assert.assertEquals(ultimoEsperado, ultimoObtenido);
	}
	
	
}

