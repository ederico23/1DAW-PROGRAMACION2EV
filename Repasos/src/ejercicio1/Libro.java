package ejercicio1;

/**
 * sistema para gestionar libros en una biblioteca 
 * 
 * @author Eder Gracia
 * @version 1.0
 */
public class Libro {
	
	//declaramos variables
	public String titulo;
	private String autor;
	private String isbn;
	private boolean disponible;
	
	/**
	 * @param titulo
	 * @param autor
	 * @param isbn
	 * @param disponible
	 */
	public Libro(String titulo, String autor, String isbn, boolean disponible) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.disponible = disponible;
	}
	
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	/**
	 * @return the disponible
	 */
	public boolean isDisponible() {
		return disponible;
	}
	
	/**
	 * @param disponible the disponible to set
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo +
				", autor=" + autor + ", isbn=" +
				isbn + ", disponible=" + disponible + "]";
	}
	
	







}





