public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int año;
    private String genero;

    public Libro(int ISBN, String autor, int año, String genero) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.año = año;
        this.genero = genero;
        this.titulo = titulo;
    }

    public Libro(String cienAñosDeSoledad, String gabrielGarcíaMárquez, int i) {

    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void MostrarInformacion() {
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Autor: " + this.autor);
        System.out.println("Genero: " + this.genero);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Año: " + this.año);

    }


}
