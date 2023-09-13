public class Libro {
    private String titulo;
    private String autor;
    private int anyoPublicacion;

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public Libro(String titulo, String autor, int anyoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
    }

    public String getInfoLibro(){
        return "Título: "+getTitulo()+" ,Autor: "+getAutor()+
                " ,Año de publicación: "+getAnyoPublicacion();
    }

    @Override
    public String toString() {
        return getInfoLibro();
    }
}
