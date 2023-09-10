public class Rectangulo implements Poligono {
    private double ancho;
    private double alto;

    public double getAncho() {
        return ancho;
    }
    public double getAlto() {
        return alto;
    }

    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
