public abstract class Ticket {
    private static int serialNumber;
    private int number = 0;
    public Ticket() {
        number = getNextSerialNumber();
    }
    public abstract double getPrice();

    private static int getNextSerialNumber() {
        return serialNumber += 1;
    }

    public String toString() {
        return "Ticket Number: " + number +
                "\nPrice: " + getPrice();
    }
}
