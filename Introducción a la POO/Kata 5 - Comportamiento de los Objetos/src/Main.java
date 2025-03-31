public class Main {

    public static void main(String[] args) {

        NaveEspacial nave = new NaveEspacial("Voyager", 50);

        nave.avanzar(60);
        nave.recargarCombustible(40);
        nave.avanzar(60);
        nave.mostrarEstado();

    }
}
