package com.company;

public class ShowUserStudent {

    public static void main(String[] args) {

        // класс User
        User userNoName = new User(); // конструктор без параметров
        System.out.println(userNoName);

        User user = new User("Иван", "Петров");

        //User getters
        System.out.println("Поля класса User вывели с помощью getters:\n" + user.getName() +
                " " + user.getSurname());

        //User setters
        user.setName("Николай");
        user.setSurname("Басков");
        System.out.println("\nИзменили поля класса User с помощью setters:");

        //Вывод изменённых полей User на экран
        System.out.println(user);
        System.out.println();

        // класс Student
        Student studentNoName = new Student(); // конструктор без параметров
        System.out.println(studentNoName);
        System.out.println();

        Student student = new Student("Гарик", "Харламов", 2018);

        //метод получения имени и фамилии класс Student унаследовал от User
        System.out.println(student.getFullName());

        //Student + User getters
        System.out.println("Поля для класса Student унаследовали от User и вывели с помощью getters:\n" +
                student.getName() + " " + student.getSurname() + " поступил в Университет в " +
                student.getYear() + " году");

        System.out.println(student);
    }
}
