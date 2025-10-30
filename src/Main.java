public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        System.out.println("Nombre de la biblioteca: " + biblioteca.getNombre());

        biblioteca.AñadirLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
        biblioteca.AñadirLibro(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605));
        biblioteca.AñadirLibro(new Libro("1984", "George Orwell", 1949));

        libro.MostrarInformacion();

    }
}
