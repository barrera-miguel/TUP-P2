public class NaveEspacial {

    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = Math.min(combustible, MAX_COMBUSTIBLE);
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible + ".");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades. Combustible restante: " + combustible + ".");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad > 0) {
            combustible = Math.min(combustible + cantidad, MAX_COMBUSTIBLE);
            System.out.println("Combustible recargado. Nivel actual: " + combustible);
        } else {
            System.out.println("Cantidad de recarga inválida.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible);
    }

}
