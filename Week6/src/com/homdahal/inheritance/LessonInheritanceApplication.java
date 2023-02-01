package com.homdahal.inheritance;

public class LessonInheritanceApplication {
    public static void main(String[] args) {
        PhysicsTeacher physicsTeacher = new PhysicsTeacher();
        System.out.println(physicsTeacher.getClasses());
        System.out.println(physicsTeacher.getLevelOfEducation());

        ComputerScience computerScience = new ComputerScience();
        System.out.println(computerScience.getClasses());
        System.out.println(computerScience.getLevelOfEducation());
    }

}
