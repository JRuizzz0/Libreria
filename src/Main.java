public class Main {
    public static void main(String[] args) {


        Biblioteca biblioteca = new Biblioteca();

        System.out.println("Nombre de la biblioteca: " + biblioteca.getNombre());

        System.out.println("Estos son los libros que hay en la biblioteca: \n");
        biblioteca.librosenlabiblioteca();




        biblioteca.añadirLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Drama"));
        biblioteca.añadirLibro(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "Aventura"));
        biblioteca.añadirLibro(new Libro("1984", "George Orwell", 1949, "Ciencia Ficción"));

        biblioteca.añadirLibro(new Libro("Harry Potter", "J.K.Rowling", 1992 , "Fantasía"));
        biblioteca.añadirLibro(new Libro("Geronimo Stilton", "Elisabetta Dami", 2000, "Aventura"));


        biblioteca.mostrarLibros();

    }
}
