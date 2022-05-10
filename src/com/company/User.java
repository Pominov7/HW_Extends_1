package com.company;

// класс User - БАЗОВЫЙ КЛАСС
public class User {

    //поля
    protected String name;
    protected String surname;

    // конструкторы
    // 1. конструктор без параметров
    public User() {
        name = "NoName";
        surname = "NoSurname";
        System.out.println("Сработал конструктор без параметров класса User: ");
    }

    // 2.  конструктор с одним параметром
    public User(String str) {
        name = surname = str;
    }

    // 3. конструктор с двумя параметрами
    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // методы
    // 1. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        return name + " " + surname;
    }

    // 2. метод получения имени и фамилии
    public String getFullName() {
        return name + " " + surname;
    }
}
