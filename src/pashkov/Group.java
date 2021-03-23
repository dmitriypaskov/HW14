package pashkov;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Group {
    private final String courseName;
    private final String startDateOfClasses;
    private final int totalNumberOfLessons;
    private final int numberOfLessonsPerWeek;
    private final List<Student> studentList = new ArrayList<>();

    public Group(String courseName, String startDateOfClasses, int totalNumberOfLessons,
                 int numberOfLessonsPerWeek) {
        this.courseName = courseName;
        this.startDateOfClasses = startDateOfClasses;
        this.totalNumberOfLessons = totalNumberOfLessons;
        this.numberOfLessonsPerWeek = numberOfLessonsPerWeek;
    }

    public String callGroupName() {
        return getCourseName() + " " + getStartDateOfClasses();
    }

    public String getDateOfLastClasses() throws ParseException {
        Date tmp = new SimpleDateFormat("dd.MM.yyyy").parse(getStartDateOfClasses());
        LocalDate StartDateOfClasses = tmp.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate EndDateOfClasses = StartDateOfClasses.plusWeeks(getTotalNumberOfLessons() / getNumberOfLessonsPerWeek());
        return EndDateOfClasses.toString();
    }

    public void addStudent(String lastName, String firstName, String dateOfBirth, String contacts) {
        Student student = new Student(lastName, firstName, dateOfBirth, contacts);
        getStudentList().add(student);
        student.getGroups().add(callGroupName());
    }

    public void addTeacher(String lastName, String firstName, String dateOfBirth, String contacts, double salaryPerWeek) {
        Teacher teacher = new Teacher(lastName, firstName, dateOfBirth, contacts, salaryPerWeek);
        getStudentList().add(teacher);
        teacher.getGroups().add(callGroupName());
    }

    public void addStudent(Student student) {
        student.getGroups().add(callGroupName());
        getStudentList().add(student);
    }

    public void printStudentList() {
        for (Student student : getStudentList()) {
            System.out.println(student.getFirstName().charAt(0) + ". " + student.getLastName());
        }
    }

    public void checkStudent(String lastName) {
        for (Student student : getStudentList()) {
            if (student.getLastName().equals(lastName)) {
                System.out.println("A student with this surname is in the group .");
                break;
            } else System.out.println("There is no student with this surname .");
            break;
        }
    }

    public void deleteStudent(String lastName) {
        getStudentList().removeIf(student -> student.getLastName().equals(lastName));
    }

    public void deleteStudent(int index) {
        getStudentList().removeIf(student -> student.getLastName().equals(getStudentList().get(index).getLastName()));
    }

    public String getCourseName() {
        return courseName;
    }

    public String getStartDateOfClasses() {
        return startDateOfClasses;
    }

    public int getTotalNumberOfLessons() {
        return totalNumberOfLessons;
    }

    public int getNumberOfLessonsPerWeek() {
        return numberOfLessonsPerWeek;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
