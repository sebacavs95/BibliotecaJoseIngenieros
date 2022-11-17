package ar.unlam.edu.pb2.joseIngenieros;

import java.util.Comparator;

public class PorTamanioComparador implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		// TODO Auto-generated method stub
		return o1.getCantidadDePaginas().compareTo(o2.getCantidadDePaginas());
	}
	
}
