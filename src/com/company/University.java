package com.company;

import java.util.ArrayList;

public class University {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public void changeInfoStudent(String name,String newName,int years,String faculty,int course){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)){
                students.remove(students.get(i));
                break;
            }
        }
        students.add(new Student(newName,years,faculty,course));
    }

    public void searchStudentByName(String name){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)){
                System.out.println(students.get(i).toString());
                break;
            }
        }
    }
    public void allStudents(){
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }
}
