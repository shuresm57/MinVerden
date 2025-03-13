package org.example.minverden.model;

public class Person {

    private String name;
    private String gitHub;
    private int age;
    private String yndlingsfarve;

    public Person(){}

    public Person(String name, String gitHub, int age, String yndlingsfarve){
        this.name = name;
        this.gitHub = gitHub;
        this.age = age;
        this.yndlingsfarve = yndlingsfarve;
    }

    public String getName() {
        return name;
    }

    public String getGitHub() {
        return gitHub;
    }

    public int getAge() {
        return age;
    }

    public String getYndlingsfarve() {
        return yndlingsfarve;
    }
}
