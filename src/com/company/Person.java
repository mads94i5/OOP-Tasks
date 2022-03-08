package com.company;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void hasBirthday(){
        this.age += 1;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public Person(String setName, int setAge){
        name = setName;
        age = setAge;
    }
}
