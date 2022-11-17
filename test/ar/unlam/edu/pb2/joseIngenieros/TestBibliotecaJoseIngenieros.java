package ar.unlam.edu.pb2.joseIngenieros;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBibliotecaJoseIngenieros {

	@Test
	public void queSePuedaOrdenarLibrosPorCantidadDePaginasDeMayorAMenorEnUnaBiblioteca() {
		Biblioteca joseIngenieros = new Biblioteca();
		Libro libro = new Libro("Farenheit 454",200,"Andrew",Genero.FICCION,1949);
		Libro libro1= new Libro("Como mejorar mi autoestima",500,"Broun",Genero.AUTOAYUDA,1989);
		Libro libro2= new Libro("Economia Mundial",300,"Maslaton",Genero.DIVULGACION,1960);
		
		joseIngenieros.ingresarLibro(libro);
		joseIngenieros.ingresarLibro(libro1);
		joseIngenieros.ingresarLibro(libro2);
		
		joseIngenieros.presentarLibrosOrdenadosPorTamanioDeMayorAMenor();
		
		String primeroObtenido = joseIngenieros.getLibros().get(0).getTitulo();
		String primeroEsperado = "Como mejorar mi autoestima";
		
		assertEquals(primeroObtenido, primeroEsperado);
	}
	
	@Test
	public void queSePuedaOrdenarLibrosPorAutorEnUnaBiblioteca() {
		Biblioteca joseIngenieros = new Biblioteca();
		Libro libro = new Libro("Farenheit 454",200,"Andrew",Genero.FICCION,1949);
		Libro libro1= new Libro("Como mejorar mi autoestima",500,"Broun",Genero.AUTOAYUDA,1989);
		Libro libro2= new Libro("Economia Mundial",300,"Maslaton",Genero.DIVULGACION,1960);
		
		joseIngenieros.ingresarLibro(libro);
		joseIngenieros.ingresarLibro(libro1);
		joseIngenieros.ingresarLibro(libro2);
		
		joseIngenieros.presentarLibrosOrdenadosPorAutor();
		
		String primeroObtenido = joseIngenieros.getLibros().get(0).getTitulo();
		String primeroEsperado = "Economia Mundial";
		
		assertEquals(primeroObtenido, primeroEsperado);
	}
	
	@Test
	public void queSePuedaOrdenarLibrosPorPublicacionEnUnaBiblioteca() {
		Biblioteca joseIngenieros = new Biblioteca();
		Libro libro = new Libro("Farenheit 454",200,"Andrew",Genero.FICCION,1949);
		Libro libro1= new Libro("Como mejorar mi autoestima",500,"Broun",Genero.AUTOAYUDA,1989);
		Libro libro2= new Libro("Economia Mundial",300,"Maslaton",Genero.DIVULGACION,1960);
		
		joseIngenieros.ingresarLibro(libro);
		joseIngenieros.ingresarLibro(libro1);
		joseIngenieros.ingresarLibro(libro2);
		
		joseIngenieros.presentarLibrosOrdenadosPorPublicaion();
		
		String primeroObtenido = joseIngenieros.getLibros().get(0).getTitulo();
		String primeroEsperado = "Farenheit 454";
		
		assertEquals(primeroObtenido, primeroEsperado);
	}
	
	@Test
	public void queSePuedaContaLibrosPorGeneroEnUnaBiblioteca() {
		Biblioteca joseIngenieros = new Biblioteca();
		Libro libro = new Libro("Farenheit 454",200,"Andrew",Genero.FICCION,1949);
		Libro libro1= new Libro("Como mejorar mi autoestima",500,"Broun",Genero.FICCION,1989);
		Libro libro2= new Libro("Economia Mundial",300,"Maslaton",Genero.DIVULGACION,1960);
		
		joseIngenieros.ingresarLibro(libro);
		joseIngenieros.ingresarLibro(libro1);
		joseIngenieros.ingresarLibro(libro2);
		
		joseIngenieros.presentarLibrosPorCadaGenero();
		
		Integer primeroObtenido = joseIngenieros.getLibrosPorGenero().get(Genero.FICCION);
		Integer primeroEsperado = 2;
		
		assertEquals(primeroObtenido, primeroEsperado);
	}

}
