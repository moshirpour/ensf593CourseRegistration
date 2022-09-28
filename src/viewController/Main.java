package viewController;

import model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Student Registration System!");
// DataLoader dl = new DataLoader();

        CourseCat cat = new CourseCat(DataLoader.loadCoursesFromDB());

        System.out.println(cat);
        
        Student st1 = new Student ("James", 11);

       // System.out.println(cat.getCourseList().get(1).getCourseName().charAt(1));
    }

}