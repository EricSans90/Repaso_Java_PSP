import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList<Libro> biblioteca = new ArrayList<>();
        biblioteca.add(new Libro("The Fellowship of the Ring", "J. R. R. Tolkien", 1954));
        biblioteca.add(new Libro("The Two Towers", "J. R. R. Tolkien", 1954));
        biblioteca.add(new Libro("The Return of the King", "J. R. R. Tolkien", 1955));


        for (Libro libro : biblioteca) {
            System.out.println(libro);
        }

    }
}
