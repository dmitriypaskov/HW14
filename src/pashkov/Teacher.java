package pashkov;

public class Teacher extends Student {

    private double salaryPerWeek;

    public Teacher(String lastName, String firstName, String dateOfBirth, String contacts, double salaryPerWeek) {
        super(lastName, firstName, dateOfBirth, contacts);
        this.salaryPerWeek = salaryPerWeek;
    }

    public void setSalaryPerWeek(double salaryPerWeek) {
        this.salaryPerWeek = salaryPerWeek;
    }

    public double getSalaryPerWeek() {
        return salaryPerWeek;
    }
}

