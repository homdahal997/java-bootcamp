package com.homdahal.inheritance;

public class LessonInheritanceApplication {
    public static void main(String[] args) {
        PhysicsTeacher physicsTeacher = new PhysicsTeacher();
        System.out.println(physicsTeacher.getClasses());
        System.out.println(physicsTeacher.getLevelOfEducation());
        physicsTeacher.teach();
        System.out.println("---------------");

        ComputerScience computerScience = new ComputerScience();
        System.out.println(computerScience.getClasses());
        System.out.println(computerScience.getLevelOfEducation());
        computerScience.teach();
        System.out.println("-----------------------");

        QuantumPhysicsTeacher quantumPhysicsTeacher = new QuantumPhysicsTeacher();
        System.out.println(quantumPhysicsTeacher.getClasses());
        System.out.println(quantumPhysicsTeacher.getLevelOfEducation());
        quantumPhysicsTeacher.teach();
    }

}
