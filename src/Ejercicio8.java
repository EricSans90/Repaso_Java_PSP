import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //Creamos instancia de la clase Scanner
        Scanner scanner = new Scanner(System.in);
        //creamos instancia de la clase Random
        Random rnd = new Random();
        //Generamos random sin límite específico (+ o -)
        //int numeroAdivinar = rnd.nextInt();

        //Generamos random entre 0 y limiteSuperior
        //int limiteSuperior = 100; // por ejemplo, para un número entre 0 y 99
        //int numeroAleatorio = rnd.nextInt(limiteSuperior);

        //Generamos random entre limiteInferior y limiteSuperior
        int limiteInferior = 1;
        int limiteSuperior = 100;
        //limiteSuperior - limiteInferior + 1 da como resultado 100 = al rango del intervalo
        //Luego, sumamos el límite inferior al resultado para desplazar 0 a 99 a 1 a 100.
        int numeroAdivinar = rnd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;

        int intentos = 0;
        boolean adivinado = false;

        System.out.println("Bienvenido al juego de adivinar un número enter 0 y 100.");

        while (adivinado==false){
            System.out.println("Introduce el número a adivinar entre 0 y 100:");
            intentos++;
            int intento = scanner.nextInt();

            if (intento < 1 || intento >100){
                System.out.println("Error, número debe estar entre 1 y 100");
            } else if (intento < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor que el indicado");
            } else if (intento > numeroAdivinar) {
                System.out.println("El número a adivinar es menor que el indicado");
            } else {
                adivinado = true;
                System.out.println("Felicidades por jugar! Has adivinado el número: "+
                        numeroAdivinar+" en "+intentos+" intentos");
            }
        }
    }
}
