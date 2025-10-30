import java.util.ArrayList;

public class Biblioteca {
    private String Nombre;
    private int registro;
    private ArrayList<Libro> libros;



    public Biblioteca() {
        this.Nombre = "DownStreet";
        this.registro = registro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }



    public void AñadirLibro(Libro libro) {

        libros.add(libro);
        System.out.println("Libro añadido: " + libro);


    }

}
