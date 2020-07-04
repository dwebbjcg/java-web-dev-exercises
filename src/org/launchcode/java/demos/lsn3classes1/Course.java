package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList numberOfStudents;
    private int numberOfCredits;

    public Course(String courseName, ArrayList numberOfStudents, int numberOfCredits) {
        this.courseName = courseName;
        this.numberOfStudents = numberOfStudents;
        this.numberOfCredits = numberOfCredits;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList getNumberOfStudents() {
        return numberOfStudents;
    }

    protected void setNumberOfStudents(ArrayList numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    protected void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
}