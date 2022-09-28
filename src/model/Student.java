package model;

import java.util.ArrayList;

public class Student {

    private String Name;
    private int id;

    private ArrayList <Registration> courseList;

    public Student(String name, int id) {
        Name = name;
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", id=" + id +
                '}';
    }
}
