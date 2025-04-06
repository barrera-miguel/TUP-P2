import java.time.LocalDate;

public class TicketSoporte {
    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private Usuario usuario;
    private String tecnicoAsignado;

    public TicketSoporte(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDate.now();
        this.usuario = null;
    }

    public TicketSoporte(int id, String descripcion, Usuario usuario) {
        this(id, descripcion);
        this.usuario = usuario;
    }

    public void cerrarTicket() {
        this.estado = "Cerrado";
    }

    public void asignarTecnico(String tecnico) {
        this.tecnicoAsignado = tecnico;
    }

    public String mostrarDetalle() {
        return "Ticket ID: " + id +
                "\nDescripción: " + descripcion +
                "\nEstado: " + estado +
                "\nFecha de creación: " + fechaCreacion +
                "\nUsuario: " + (usuario != null ? usuario : "No asignado") +
                "\nTécnico asignado: " + (tecnicoAsignado != null ? tecnicoAsignado : "No asignado");
    }
}
