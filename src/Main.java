public class Main {
    public static void main(String[] args) {


        Biblioteca biblioteca = new Biblioteca("DownStreet");

        System.out.println("Bienvenido a la biblioteca: " + biblioteca.getNombre());
        System.out.println("\nEstos son los libros que ya existen en la biblioteca:\n");
        biblioteca.mostrarLibrosIniciales();

        biblioteca.añadirLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Drama"));
        biblioteca.añadirLibro(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "Aventura"));
        biblioteca.añadirLibro(new Libro("1984", "George Orwell", 1949, "Ciencia Ficción"));
        biblioteca.añadirLibro(new Libro("Harry Potter", "J.K. Rowling", 1997, "Fantasía"));
        biblioteca.añadirLibro(new Libro("Geronimo Stilton", "Elisabetta Dami", 2000, "Aventura"));

        System.out.println("Libros añadidos recientemente: ");
        biblioteca.mostrarLibros();

        System.out.println("Lista completa actualizada de la biblioteca '" + biblioteca.getNombre() + "':\n");
        biblioteca.mostrarColeccionCompleta();
    }

}
