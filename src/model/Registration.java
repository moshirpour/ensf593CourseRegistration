package model;

public class Registration {

    private Offering theOffering;
    private Student theStudent;
    private char theGrade;

    public void register (Offering theOfering, Student theStudent){
        this.theOffering = theOfering;
        this.theStudent = theStudent;
    }
    public void setTheGrade (char theGrade){
        this.theGrade = theGrade;
    }
    public char getTheGrade (){
        return theGrade;
    }


}
