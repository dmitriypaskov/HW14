package pashkov;

public class Teacher extends Student{

    private final double salaryPerWeek;

    public double getSalaryPerWeek() {
        return salaryPerWeek;
    }

    public Teacher(String lastName, String firstName, String dateOfBirth, String contacts, double salaryPerWeek) {
        super(lastName, firstName, dateOfBirth, contacts);
        this.salaryPerWeek = salaryPerWeek;
    }
}
