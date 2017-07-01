package ar.edu.unlam.basica2.bar;

public class ExcepcionDeEdad extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ExcepcionDeEdad(){
		super("No se permite la entrada a menores");
	}
}
