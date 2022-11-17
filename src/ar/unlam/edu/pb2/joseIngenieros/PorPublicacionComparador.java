package ar.unlam.edu.pb2.joseIngenieros;

import java.util.Comparator;

public class PorPublicacionComparador implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		
		return o1.getAnioDePublicacion().compareTo(o2.getAnioDePublicacion());
	}

	

}
