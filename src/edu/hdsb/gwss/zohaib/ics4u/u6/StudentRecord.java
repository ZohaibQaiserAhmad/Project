/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zohaib.ics4u.u6;

/**
 *
 * @author 1ahmadzoh
 */
public class StudentRecord {

    //File Size
    protected final int FILE_SIZE = 69;

    //Variable(s)
    //String(s)
    private String name;

    private String courseTitle;

    //Int(s)
    private int grade;
    private int average;
    private int dbID;

    //Double(s)
    private double weight;
    private double studentID;

    //Char(s)
    private char gender;

    //boolean(s)
    private boolean canGraduate;

    //Constants 
    //For name
    private static final int MAXIMUM_CHARACTERS = 15;

    //For grades
    private static final int MINIMUM_GRADE = 9;
    private static final int MAXIMUM_GRADE = 12;

    //For Course lengths
    private static final int MAXIMUM_COURSE = 6;

    //For Average
    private static final int MINIMUM_AVERAGE = 0;
    private static final int MAXIMUM_AVERAGE = 100;

    //For weight (in lbs)
    private static final int MINIMUM_WEIGHT = 85;
    private static final int MAXIMUM_WEIGHT = 130;

    //For Gender (m/f)
    private static final char MALE = 'M';
    private static final char FEMALE = 'F';

    //Constructor (#1) : custom allows all information to be inputed (advanced)
    //: will be used to set other constructors
    public StudentRecord(String name, String courseTitle, int grade, int studentID, int average, double weight, char gender, boolean canGraduate) {

        //Name and course titles both strings set to argument of constructor
        setName(name);
        setCourseTitle(courseTitle);

        //Grade , student id and average all ints set to argument of constructor
        setGrade(grade);
        setStudentID(studentID);
        setAverage(average);

        //Weight is a double of which is set to argument of constructor
        setWeight(weight);

        //Gender is a char that is set to argument of constructor
        setGender(gender);

        //Can graduate is set to argument of constructor
        setCanGraduate(canGraduate);
    }

    //Default Constructor (#2) when no argument is passed into method
    public StudentRecord() {

        //Had used constructor with set values to create new values for basic constructor
        this(null, null, 0, 0, 0, 0.0, (char) 0, false);

    }

    //Semi - advanced constructor with allowing one argument to be set (student id)
    public StudentRecord(int studentID) {
        this(null, null, 0, studentID, 0, 0.0, (char) 0, false);
    }

    public int getDbID() {
        return dbID;
    }

    public void setDbID(int dbID) {
        this.dbID = dbID;
    }

    //Getter for Name (returns name if its set properly)
    public String getName() {

        return name;

    }

    public void setName(String name) {

        StringBuilder temp = new StringBuilder();

        if (name != null) {
            temp.append(name.trim());
        } else {
            temp.append("TBD");
        }

        // trucates or pads the string
        temp.setLength(MAXIMUM_CHARACTERS);
        this.name = temp.toString();
    }

    //returns course title if it is set properly
    public String getCourseTitle() {
        return courseTitle;
    }

    //Sets course title if it
    public void setCourseTitle(String courseTitle) {

          StringBuilder temp = new StringBuilder();

        if (courseTitle != null) {
            temp.append(courseTitle.trim());
        } else {
            temp.append("TBD");
        }

        // trucates or pads the string
        temp.setLength(MAXIMUM_COURSE);
        this.courseTitle = temp.toString();
    }

    //Returns name only if it meets requirement
    public int getGrade() {
        return grade;
    }

    //Sets name based on the requirements
    public void setGrade(int grade) {

        //If grade is less then or equal to max(12) or greater then equal to min(9)
        if (grade <= MINIMUM_GRADE && grade >= MAXIMUM_GRADE) {
            this.grade = grade;
        }
    }

    //Returns student id if the requirements are met
    public double getStudentID() {
        return studentID;
    }

    //Sets student id if student id divided by filesize is 0 - basically student id can't be greater then filesize
    public void setStudentID(double studentID) {

        if (studentID / FILE_SIZE == 0) {
            this.studentID = studentID;
        }
    }

    //returns average if requirements are met 
    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {

        //Set average if it is greater then and equal to min and less then or equal to max
        if (average >= MINIMUM_AVERAGE && average <= MAXIMUM_AVERAGE) {
            this.average = average;
        }
    }

    //returns weight if requirements are met
    public double getWeight() {
        return weight;
    }

    //Sets weight if requirements are met
    public void setWeight(double weight) {

        //IF weight is greater then or equal to min weight or less then or equal to max weight
        if (weight >= MINIMUM_WEIGHT && weight <= MAXIMUM_WEIGHT) {
            this.weight = weight;
        }
    }

    //Returns gender if the requirements are met
    public char getGender() {
        return gender;
    }

    //Sets gender if requirements are met
    public void setGender(char gender) {

        //If gender is male or female in upper case set it 
        if (gender == MALE || gender == FEMALE) {
            this.gender = gender;
        }
    }

    //Returns wheter they can graduate if requirements are met 
    public boolean isCanGraduate() {
        return canGraduate;
    }

    public void setCanGraduate(boolean canGraduate) {

        //If the argument is set to true then they can graduate
        if (canGraduate == true) {
            this.canGraduate = canGraduate;
        }
    }

    //String method that converts it to string
    @Override
    public String toString() {
        return "StudentRecord{" + "name=" + name + ", courseTitle="
                + courseTitle + ", grade=" + grade + ", studentID=" + studentID
                + ", average=" + average + ", weight=" + weight + ", gender="
                + gender + ", canGraduate=" + canGraduate + '}';
    }

}
