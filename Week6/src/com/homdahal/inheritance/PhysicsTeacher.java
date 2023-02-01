package com.homdahal.inheritance;

public class PhysicsTeacher extends Teacher{
    public PhysicsTeacher(){
        System.out.println(" Inside Physics teacher constructor");
        this.setClasses(" PHYS 101, PHYS 102");
        this.setLevelOfEducation(" Masters of Science");
    }
    // this method will override the method in parent class which is teacher
    public void teach(){
        System.out.println(" I am a physics teacher and I am now teaching");
    }

}
