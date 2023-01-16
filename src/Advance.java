public class Advance extends Ticket{
    private int daysInAdvance;

    public Advance(int daysInAdvance) {
        this.daysInAdvance = daysInAdvance;
    }
    public double getPrice() {
        if (this.daysInAdvance >= 10) {
            return 30;
        } else {
            return 40;
        }
    }

    public String toString() {
        return super.toString() +
                "\ndaysInAdvance: " + daysInAdvance;
    }
}
