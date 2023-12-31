package com.springcore.constructorinjection;

public class Person {
    private String name;
    private int id;

    private Certificate certificate;

    public Person() {
    }

    public Person(int id, String name, Certificate certificate){
        this.id = id;
        this.name = name;
        this.certificate = certificate;
    }

    public String toString(){
        return this.id + " " + this.name + " "+ this.certificate.certificateName;
    }
}
