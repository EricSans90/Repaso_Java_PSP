public class Ejercicio7 {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[3];
        figuras[0] = new Circulo (5.0);
        figuras[1] = new Cuadrado (4.0);
        figuras[2] = new Circulo (3.0);

        for(int i=0; i<3; i++){
            System.out.println("Área de la figura "+(i+1)+" es: "+figuras[i].calcularArea());
            System.out.println("Perímetro de la figura "+(i+1)+" es: "+figuras[i].calcularPerimetro());
        }
    }
}
