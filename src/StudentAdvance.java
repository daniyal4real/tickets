public class StudentAdvance extends Advance{
    private String studentID;
    public StudentAdvance(int daysInAdvance, String studentID) {
        super(daysInAdvance);
        this.studentID = studentID;
    }

    public double getPrice() {
        return super.getPrice() / 2;
    }

    public String toString() {
        return super.toString() +
                "\nstudent ID required: " + studentID;
    }
}
