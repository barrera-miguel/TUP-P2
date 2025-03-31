public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Old man and the sea", "Ernest Hemingway", 1952);

        libro1.setAnioPublicacion(1800);
        libro1.setAnioPublicacion(2000);

        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Año de publicación: " + libro1.getAnioPublicacion());

    }
}
