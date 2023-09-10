public class Ejercicio3 {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo (5, 3);
        double areaRectangulo = rectangulo.calcularArea();
        System.out.println(areaRectangulo);

        Triangulo triangulo = new Triangulo (5, 3);
        double areaTriangulo = triangulo.calcularArea();
        System.out.println(areaTriangulo);
    }
}
