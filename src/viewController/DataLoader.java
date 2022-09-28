package viewController;

import model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataLoader {

    public static ArrayList<Course> loadCoursesFromDB(){
        //Simulating the database
        ArrayList<Course> tempCourseList = new ArrayList<Course>();

        tempCourseList.add(new Course ("ENSF", 609) );
        ArrayList<Offering> tempOffering = new ArrayList<>();
        tempOffering.add(new Offering (1));
        tempOffering.add(new Offering(2));
        tempCourseList.get(0).setOfferingList(tempOffering);

        tempCourseList.add(new Course ("ENSF", 610) );
        tempCourseList.add(new Course ("ENSF", 611) );



        return tempCourseList;

    }
    public static ArrayList<Student> loadStudentsFromDB(){
        ArrayList<Student> tempStudentList = new ArrayList<Student>();
        
        tempStudentList.add(new Student("Joe", 1));
        tempStudentList.add(new Student("Sara", 2));
        tempStudentList.add(new Student("Jane", 3));
        
        return tempStudentList;
    }
}
