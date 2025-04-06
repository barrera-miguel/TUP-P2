public class Main {
    public static void main(String[] args) {
        TicketSoporte ticket = new TicketSoporte(101, "No puedo acceder al sistema.");

        System.out.println("Detalle del Ticket:");
        System.out.println(ticket.mostrarDetalle());

        ticket.cerrarTicket();
        System.out.println("\nTicket cerrado:");
        System.out.println(ticket.mostrarDetalle());
    }
}
