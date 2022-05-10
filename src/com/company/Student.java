package com.company;


import java.util.Calendar;

// класс Student - наследник User
public class Student extends User {

    //поля
    protected int year; //name и surname были унаследованы от класса User

    // конструкторы

    // 1. конструктор без параметров
    public Student() {
        name = "NoName";
        surname = "NoSurname";
        year = 2021;
        System.out.println("Сработал конструктор без параметров класса Student: ");
    }

    // 2. конструктор с одним параметром
    public Student(int year) {
        this.year = year;
    }

    // 3. конструктор с тремя параметрами
    public Student(String name, String surname, int year) {
        super(name, surname);
        this.year = year;
    }

    // getters and setters для поля year класса Student
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // методы

    // 1. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        return super.getFullName() + " обучается на " + getCourse() + " курсе";
    }

    // 2. метод вывода текущего курса студента
    public int getCourse() {
        Calendar realYear = Calendar.getInstance();
        return realYear.get(Calendar.YEAR) - year;
    }
}
