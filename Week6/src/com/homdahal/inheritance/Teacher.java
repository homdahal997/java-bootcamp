package com.homdahal.inheritance;

public class Teacher {
    private String classes;
    private String levelOfEducation;
    public void teach(){
        System.out.println(" I am a teacher and I am now teaching");
    }
    Teacher(){
        System.out.println(" Inside teacher constructor");
        this.classes = " No Classes Assigned";
        this.levelOfEducation = " No Education level assigned";
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getLevelOfEducation() {
        return levelOfEducation;
    }

    public void setLevelOfEducation(String levelOfEducation) {
        this.levelOfEducation = levelOfEducation;
    }
}
