public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(1, "Miguel Barrera", "m.barrera@gmail.com");

        TicketSoporte ticket1 = new TicketSoporte(200, "Error al imprimir documentos", usuario1);
        TicketSoporte ticket2 = new TicketSoporte(201, "Problema con el login");

        ticket1.asignarTecnico("Juan Tecno");

        System.out.println("Ticket con usuario y técnico asignado:");
        System.out.println(ticket1.mostrarDetalle());

        System.out.println("\nTicket sin usuario ni técnico:");
        System.out.println(ticket2.mostrarDetalle());
    }
}
