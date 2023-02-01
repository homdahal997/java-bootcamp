package com.homdahal.inheritance;

public class ComputerScience extends Teacher{
    public ComputerScience(){
        System.out.println(" Inside computerscience constructor ");
        this.setClasses(" COMP 101, COMP 102");
        this.setLevelOfEducation(" Bachelor of Science");
    }
}
