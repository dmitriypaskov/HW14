package pashkov;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        // 1) Write the class "Group" to display the training group in Hillel, which contains the fields:
        // - course name
        // - start date of classes
        // - total number of lessons
        // - number of lessons per week
        // - a list of students of type Student who have a last name, first name, date of birth and contacts.
        //   Write methods:
        // - a method that gives out the name of the group based on the start date and the name of the course
        // - a method that returns the date of the last lesson
        // - prints the list of students in order in the format:
        //   I. Ivanov
        //   P. Petrov
        //   S. Sidorov
        // - add student
        // - find out if a student with such a surname is in the group
        // - remove a student by last name or number
        // 1.1 *) The student has a list of groups in which he studies.
        //   When a student is added to a group, this group is assigned to him in the list.
        //   The group has a teacher of type Teacher, which has the same fields as Student + salary information.
        Group group = new Group("JavaIntroduction", "28.01.2021",
                16, 2);
        System.out.println(group.callGroupName());
        group.addTeacher("Andriy", "Kadatsky", "someDateOfBirth", "some_eMail", 100);
        group.addStudent("Pashkov", "Dmytro", "15.06.1993", "0933520293");
        group.addStudent("Poroshenko", "Petro", "15.06.1", "0933593");
        group.addStudent("Zelensky", "Volodumur", "15.06.1", "0933593");
        group.addStudent("Tesla", "Nicola", "15.06.1", "0933593");
        group.printStudentList();
        group.checkStudent("Hug");
        group.deleteStudent(2);
        group.printStudentList();
        group.deleteStudent("Poroshenko");
        group.printStudentList();
        System.out.println(group.getDateOfLastClasses());
        Group group1 = new Group("JavaElementary", "28.01.2021",
                32, 2);
        group1.addStudent(group.getStudentList().get(1));
        group1.printStudentList();
        group.getStudentList().get(1).printGroupList();

    }
}
