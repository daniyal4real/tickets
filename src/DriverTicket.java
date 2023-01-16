public class DriverTicket {
    public static void main (String[] args) {
        Ticket[] group = new Ticket[5];

        group[0] = new Walkup();
        group[1] = new Advance( 9 );
        group[2] = new Advance( 10 );
        group[3] = new StudentAdvance(9, "Jill");
        group[4] = new StudentAdvance(10, "Annie");

        for (Ticket t: group){
            System.out.println( t + "\n");
        }

    }
}