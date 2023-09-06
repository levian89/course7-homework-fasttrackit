package org.fasttrackit.course7.homework.student;

public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student("Mircea", 100.5);
        Student student2 = new Student("Cucu", 30.5);
        Student student3 = new Student("Vasile", 70.5);
        Student student4 = new Student("Gheorghe", 60);

        System.out.println("Student1: " + student1.getName() + ", grade: " + student1.getGrade());
        System.out.println("Student2: " + student2.getName() + ", grade: " + student2.getGrade());
        System.out.println("Student3: " + student3.getName() + ", grade: " + student3.getGrade());
        System.out.println("Student4: " + student4.getName() + ", grade: " + student4.getGrade());

        System.out.println("Average grade: " + Student.calculateAverageGrade());
    }
}
