package ar.unlam.edu.pb2.joseIngenieros;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Biblioteca {
	
	private List<Libro> libros;
	private Map<Genero,Integer> librosPorGenero;
	
	public Biblioteca() {
		this.libros = new LinkedList<Libro>();
		//TreeSet <Libro> libros = new TreeSet <Libro>();
		//TreeSet<Libro> libros2 = (TreeSet<Libro>) libros.descendingSet();
		this.librosPorGenero = new HashMap<Genero,Integer>();
	}
	
	public void ingresarLibro (Libro libro) {
		this.libros.add(libro);
	}
	
	public Integer cantidadDeLibros() {
		return this.libros.size();
	}
	
	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public Map<Genero, Integer> getLibrosPorGenero() {
		return librosPorGenero;
	}

	public void setLibrosPorGenero(Map<Genero, Integer> librosPorGenero) {
		this.librosPorGenero = librosPorGenero;
	}

	public void presentarLibrosPorCadaGenero() {
		 for (Libro libro : this.libros) {
	            Genero k = libro.getGenero();
	            
	            if(librosPorGenero.containsKey(k)) {
	                Integer v = librosPorGenero.get(k) + 1; 
	                librosPorGenero.put(k, v);
	            }
	            else {
	                librosPorGenero.put(k, 1);
	            }
		 }
	}
	
	public void presentarLibrosOrdenadosPorTamanioDeMayorAMenor() {
		Collections.sort(this.libros, Collections.reverseOrder(new PorTamanioComparador()));
	}

	public void presentarLibrosOrdenadosPorAutor() {
		Collections.sort(this.libros, Collections.reverseOrder(new PorAutorComparador()));
	}

	public void presentarLibrosOrdenadosPorPublicaion() {
		Collections.sort(this.libros, (new PorPublicacionComparador()));
	}

}
