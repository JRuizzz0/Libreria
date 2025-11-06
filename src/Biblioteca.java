import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private int registro;
    private ArrayList<Libro> librosenlabiblioteca;

    public Biblioteca() {
        this.nombre = "DownStreet";
        this.registro = 0;
        this.librosenlabiblioteca = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }


    public void librosenlabiblioteca() {
        ArrayList<String> libros_en_biblioteca = new ArrayList<String>();
        libros_en_biblioteca.add("El fallecimiento del cielo,\nEl fantasma de Canterville,\nEl fundamento del ser,\nFlores en las cumbres,\nLa fe de un misionero y sus dones espirituales,\nLas formas de la felicidad,\nFuenteovejuna,\nLa fierecilla domada,\nLas Formas del Círculo,\nFacundo,\nFelipe III y La Dorada");
        System.out.println(libros_en_biblioteca);
    }

    public void añadirLibro(Libro libro) {
        for (Libro l : librosenlabiblioteca) {
            if (l.getTitulo().equalsIgnoreCase(libro.getTitulo())) {
                System.out.println("El libro '" + libro.getTitulo() + "' ya existe en la biblioteca.");
                return;
            }
        }

        librosenlabiblioteca.add(libro);
        setRegistro(getRegistro() + 1);
        System.out.println("Libro añadido correctamente: " + libro.getTitulo());

    }

    public void mostrarLibros() {
        if (librosenlabiblioteca.isEmpty()) {
            System.out.println("La biblioteca no tiene libros registrados.");
        } else {
            System.out.println("\nLibros en la biblioteca '" + nombre + "':");
            for (Libro libro : librosenlabiblioteca) {
                libro.mostrarInformacion();
            }
        }
    }



}
