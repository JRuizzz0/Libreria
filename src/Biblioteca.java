import java.util.ArrayList;


public class Biblioteca {
    private String nombre;
    private int registro;
    private ArrayList<Libro> libros;
    private ArrayList<String> librosIniciales;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.registro = 0;
        this.libros = new ArrayList<>();
        this.librosIniciales = new ArrayList<>();

        librosIniciales.add("El fallecimiento del cielo");
        librosIniciales.add("El fantasma de Canterville");
        librosIniciales.add("El fundamento del ser");
        librosIniciales.add("Flores en las cumbres");
        librosIniciales.add("La fe de un misionero y sus dones espirituales");
        librosIniciales.add("Las formas de la felicidad");
        librosIniciales.add("Fuenteovejuna");
        librosIniciales.add("La fierecilla domada");
        librosIniciales.add("Las Formas del Círculo");
        librosIniciales.add("Facundo");
        librosIniciales.add("Felipe III y La Dorada");
    }


    public String getNombre() {
        return nombre;
    }


    public void mostrarLibrosIniciales() {
        for (String titulo : librosIniciales) {
            System.out.println(" - " + titulo);
        }
    }


    public void añadirLibro(Libro libro) {
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(libro.getTitulo())) {
                System.out.println("El libro '" + libro.getTitulo() + "' ya existe en la biblioteca.");
                return;
            }
        }

        libros.add(libro);
        registro++;
        System.out.println("Libro añadido correctamente: " + libro.getTitulo());
    }


    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No se han añadido nuevos libros todavía.");
        } else {
            System.out.println("Libros nuevos registrados en '" + nombre + "':");
            for (Libro libro : libros) {
                libro.mostrarInformacion();
            }
        }
    }


    public void mostrarColeccionCompleta() {

        for (String titulo : librosIniciales) {
            System.out.println(" - " + titulo);
        }


        for (Libro libro : libros) {
            System.out.println(" - " + libro.getTitulo() + " (Autor: " + libro.getAutor() + ", Año: " + libro.getAño() + ", Género: " + libro.getGenero() + ")");
        }
    }
}
