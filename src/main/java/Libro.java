/** Represents a book managed by the university library. */
public class Libro {
  private final String titulo;
  private final String autor;
  private boolean disponible = true;

  /** Creates a book with its title and author.
   *
   * @param titulo book title
   *
   * @param autor book author
   */
  public Libro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
  }

  /** Returns the title of this book.
   *
   * @return the book title
   */
  public String getTitulo() {
    return titulo;
  }

  /** Returns the author of this book.
   *
   * @return the book author
   */
  public String getAutor() {
    return autor;
  }

  /** Indicates whether this book is available to borrow.
   *
   * @return true when the book is available
   */
  public boolean estaDisponible() {
    return disponible;
  }

  /** Lends this book.
   *
   * @throws IllegalStateException when the book is already lent
   */
  public void prestar() {
    if (!disponible) {
      throw new IllegalStateException("Libro no disponible");
    }
    disponible = false;
  }

  /** Marks this book as available again. */
  public void devolver() {
    disponible = true;
  }

  /** Compares this book title with another title by value.
   *
   * @param otroTitulo title to compare
   *
   * @return true when both titles are equal, including when both are null
   */
  public boolean esMismoTitulo(String otroTitulo) {
    return java.util.Objects.equals(titulo, otroTitulo);
  }
}
