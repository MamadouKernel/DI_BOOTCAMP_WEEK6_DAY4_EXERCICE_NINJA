/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exerciceninja.exercice2;

import java.util.ArrayList;

/**
 *
 * @author kernel-mk
 */
public class Course {
    
    private final ArrayList<Student> students;

  public Course(String name) {
    students = new ArrayList<>();
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void removeStudent(Student student) {
    students.remove(student);
  }

  public void printStudents() {
    for (Student student : students) {
      System.out.println(student.getName());
    }
  }
    
}
