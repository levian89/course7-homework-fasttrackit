package org.fasttrackit.course7.homework.student;

public class Student {
    private static double sumOfGrades;
    private static int noOfStudents;
    private final String name;
    private final double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        sumOfGrades += grade;
        noOfStudents++;
    }

    public static double calculateAverageGrade() {
        if (noOfStudents == 0) {
            return -1;
        }
        return (double) sumOfGrades / noOfStudents;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

}
