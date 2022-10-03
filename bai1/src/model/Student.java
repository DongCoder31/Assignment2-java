package model;

import java.util.Scanner;

public class Student {
    private String code;
    private String name;
    private int age;
    private int sex;

    public Student() { }

    public Student(String code, String name, int age, int sex) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void inputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Student Information:");
        System.out.print("Code: ");
        this.code =  scanner.next().trim();
        System.out.print("Name: ");
        this.name = scanner.next().trim();
        System.out.print("Age: ");
        this.age = scanner.nextInt();
        System.out.print("Sex: ");
        this.sex = scanner.nextInt();
    }

    public void printStudent() {

        System.out.println();
        System.out.println("Code: " + this.code);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Sex: " + this.sex);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
