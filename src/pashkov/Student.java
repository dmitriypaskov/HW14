package pashkov;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String lastName;
    private final String firstName;
    private final String dateOfBirth;
    private final String contacts;
    private final List<String> groups = new ArrayList<>();

    public List<String> getGroups() {
        return groups;
    }

    public void printGroupList() {
        for (int i = 0; i < getGroups().size(); i++) {
            System.out.println(getGroups().get(i));
        }
    }

    public Student(String lastName, String firstName, String dateOfBirth, String contacts) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.contacts = contacts;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getContacts() {
        return contacts;
    }
}
