import java.time.LocalDate;

public class TicketSoporte {
    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;

    public TicketSoporte(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDate.now();
    }

    public void cerrarTicket() {
        this.estado = "Cerrado";
    }

    public String mostrarDetalle() {
        return "Ticket ID: " + id +
                "\nDescripción: " + descripcion +
                "\nEstado: " + estado +
                "\nFecha de creación: " + fechaCreacion;
    }
}
