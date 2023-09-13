public class Cuadrado implements FiguraGeometrica{
    private double lado;

    public double getRadio() {
        return lado;
    }
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return lado*lado;
    }
    @Override
    public double calcularPerimetro() {
        return 4*lado;
    }
}
