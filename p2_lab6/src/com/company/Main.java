package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student();
        student.readStudents();
        //student.printStudents();
        student.sortByName();
        student.writeStudents();
    }
}
