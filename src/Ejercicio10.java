import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una lista de números enteros separados por comas:");
        String entrada = scanner.nextLine();
        String[] numeroComoTexto = entrada.split(",");
        int[] numeros = new int[numeroComoTexto.length];

        for(int i=0; i<numeroComoTexto.length; i++){
            numeros[i]=Integer.parseInt(numeroComoTexto[i].trim());
            // Usamos trim() para eliminar espacios adicionales.
        }

        double suma = 0;
        double minimo = Integer.MAX_VALUE;
        //Integer.MAX_VALUE: Esta constante representa el valor más grande que puede tener un entero
        // (int) en Java. Es 2,147,483,647.
        double maximo = Integer.MIN_VALUE;
        //Integer.MIN_VALUE: Esta constante representa el valor más pequeño que puede tener un entero
        // (int) en Java. Es -2,147,483,648.

        for (int numero : numeros){
            suma = suma + numero;
            if(numero<minimo){
                minimo=numero;
            } else if (numero>maximo) {
                maximo=numero;
            }
        }

        double promedio = suma / numeros.length;

        System.out.println("La suma de los números es: "+suma);
        System.out.println("El promedio de los números es: "+promedio);
        System.out.println("El número mínimo es: "+minimo);
        System.out.println("El número máximo es: "+maximo);

    }
}
