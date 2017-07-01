package ar.edu.unlam.basica2.bar;

import java.util.TreeSet;

public class Bar {
	
	private Boolean abierto;
	private TreeSet<Cliente> listaDeClientes;

	public Bar(){
		this.abierto = true;	
	}
	
	public void abrir(){
		this.abierto = true;
	}
	
	public void cerrar(){
		this.abierto = false; 
	}
	
	public void ingresarCliente(Cliente cliente){
		this.listaDeClientes.add(cliente);
	}
	
	public Integer obtenerCantidadDeClientes(){
		return this.listaDeClientes.size();
	}
	
	public TreeSet<Cliente> getClientes(){
		return this.listaDeClientes;
	}
}
