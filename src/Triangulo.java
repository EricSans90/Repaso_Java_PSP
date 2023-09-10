public class Triangulo implements Poligono{
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }
}
