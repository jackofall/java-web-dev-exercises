package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        System.out.println("Hello");
        // Instantiate your Student class for part 2 here!
        Student jack=new Student();
        jack.setName("Jack");
        jack.setNumberOfCredits(1);
        jack.setGpa(4.0);
        System.out.println("Jack's Name: " + jack.getName());
        System.out.println("Jack's GPA: "+ jack.getGpa());
        System.out.println("Jack's Credits: "+ jack.getNumberOfCredits());
    }
}
