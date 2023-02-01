package com.homdahal.inheritance;

public class Teacher {
    private String classes;
    private String levelOfEducation;
    Teacher(){
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
