public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int nuevoAnio) {
        int anioActual = 2025;
        if (nuevoAnio >= 1900 && nuevoAnio <= anioActual) {
            this.anioPublicacion = nuevoAnio;
        } else {
            System.out.println("Error: Año de publicación fuera del rango permitido (1900 - " + anioActual + ")");
        }
    }
}