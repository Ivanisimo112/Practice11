package com.company;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("student1",18,"inf",1);
        Student student2 = new Student("student2",19,"ipz",2);
        Student student3 = new Student("student3",20,"inf",3);
        University naukma = new University();
        naukma.addStudent(student1);
        naukma.addStudent(student2);
        naukma.addStudent(student3);
        naukma.removeStudent(student3);
        naukma.changeInfoStudent("student2","Ivan",18,"fi",1);
        naukma.allStudents();
        System.out.println("------------------");
        naukma.searchStudentByName("Ivan");
    }
}
