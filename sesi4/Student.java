package sesi4;

import java.util.ArrayList;

public class Student extends Person {
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int MAX_COURSES = 30;
    // private static final int MAX_COURSES = 30;

    public Student(String name, String addres) {
        super(name, addres);
        numCourses = 0;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];

    }

    public String toString() {
        return "Mahasiswa : " + super.toString();
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
    }

    public void printGrades() {
        System.out.print(this);
        for (int i = 0; i < numCourses; ++i) {
            System.out.print("\nMatkul " + courses[i] + ":" + grades[i]);
        }
        System.out.println();
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourses;
    }

    public void add(ArrayList<String> siswa) {
    }

}
