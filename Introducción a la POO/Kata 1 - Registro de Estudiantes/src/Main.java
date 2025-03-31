public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Miguel", "Barrera", "Inglés", 9.5);
        estudiante.mostrarInfo();

        estudiante.subirCalificacion(1.0);
        estudiante.mostrarInfo();

        estudiante.bajarCalificacion(2.5);
        estudiante.mostrarInfo();

    }
}
