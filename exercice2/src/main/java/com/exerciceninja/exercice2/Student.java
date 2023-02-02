/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exerciceninja.exercice2;

/**
 *
 * @author kernel-mk
 */
public class Student {
    
  private String name;
  private int age;
  private double GPA;

  public Student(String name, int age, double GPA) {
    this.name = name;
    this.age = age;
    this.GPA = GPA;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getGPA() {
    return GPA;
  }

  public void setGPA(double GPA) {
    this.GPA = GPA;
  }
}


