package ar.unlam.edu.pb2.joseIngenieros;


public class Libro implements Comparable<Libro>{
	
	private String titulo;
	private Integer cantidadDePaginas;
	private String autor;
	private Genero genero;
	private Integer anioDePublicacion;
	
	public Libro(String titulo, Integer cantidadDePaginas, String autor, Genero genero, Integer anioDePublicacion) {
		
		this.titulo = titulo;
		this.cantidadDePaginas = cantidadDePaginas;
		this.autor = autor;
		this.genero = genero;
		this.anioDePublicacion = anioDePublicacion;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getCantidadDePaginas() {
		return cantidadDePaginas;
	}
	public void setCantidadDePaginas(Integer cantidadDePaginas) {
		this.cantidadDePaginas = cantidadDePaginas;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Genero getGenero() {
		return genero;
	}
	public Integer getAnioDePublicacion() {
		return anioDePublicacion;
	}
	public void setAnioDePublicacion(Integer anioDePublicacion) {
		this.anioDePublicacion = anioDePublicacion;
	}
	
	@Override
	public int compareTo(Libro otroLibro) {
		if (this.titulo.compareTo(otroLibro.titulo) == 0) {
            return this.autor.compareTo(otroLibro.autor);
        }
        return this.titulo.compareTo(otroLibro.titulo);
	}
	
	
}
