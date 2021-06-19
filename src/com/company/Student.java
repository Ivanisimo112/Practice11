package com.company;

public class Student {
    private String name;
    private int years;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", years=" + years +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String name, int years, String faculty, int course) {
        this.name = name;
        this.years = years;
        this.faculty = faculty;
        this.course = course;
    }

    private String faculty;
    private int course;
}
