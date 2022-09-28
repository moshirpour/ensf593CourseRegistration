package model;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private int courseNum;

    private ArrayList <Course> preReqs;
    private ArrayList <Offering> offeringList;


    public Course(String courseName, int courseNum) {
        this.courseName = courseName;
        this.courseNum = courseNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public void setPreReqs (ArrayList<Course> preReqs){
        //this.preReqs = preReqs;
        for (Course c: preReqs)
            this.preReqs.add(c);
    }
    public void setPreReqs (Course c){
        preReqs.add(c);
    }
    public ArrayList <Course> getPreReqs (){
        return preReqs;
    }
    public void setOfferingList (ArrayList<Offering> offeringList){
        this.offeringList = offeringList;
        for (Offering offering: this.offeringList)
            offering.setTheCourse(this);
    }
    public ArrayList <Offering> getOfferingList(){
        return offeringList;
    }


    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseNum=" + courseNum +
                ", preReqs=" + preReqs +
                ", offeringList=" + offeringList +
                '}' + "\n";
    }
}
