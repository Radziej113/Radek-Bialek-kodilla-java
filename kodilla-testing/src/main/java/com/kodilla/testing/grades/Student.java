package com.kodilla.testing.grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<Integer>();

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double calculateAvg() {
        double number = grades.size();

        if(grades.size()<3) {
            return 0.0;
        }

            int max = grades.get(0);
        int min = grades.get(0);

        for (Integer grade : grades) {
            if (grade > max)
                max = grade;
            else if (grade < min)
                min = grade;
        }

        int sum = 0;

        for (Integer grade : grades) {
            sum = sum + grade;
        }

        double average = (sum - min - max) / (number - 2);

        System.out.printf("Average of this student is %.2f", average);

        return average;
    }
}
