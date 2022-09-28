package model;

import java.util.ArrayList;

public class CourseCat {

    private ArrayList <Course> courseList;

    public CourseCat (ArrayList <Course> courseList){
        this.courseList = courseList;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "CourseCat{" +
                "courseList=" + courseList +
                '}';
    }
}
