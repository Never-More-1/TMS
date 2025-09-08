package model;

import java.util.List;

public class Author {
    private String firstName;
    private String lastName;
    private String title;
    private List<String> lines;

    public Author(String firstName, String lastName, String title, List<String> lines) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.lines = lines;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getLines() {
        return lines;
    }
}