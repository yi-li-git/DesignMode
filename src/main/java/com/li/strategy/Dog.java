package com.li.strategy;

public class Dog implements ComParable<Dog>{
    int age ;
    String name;
    int height;

    @Override
    public int compareTo(Dog dog) {
        if (this.age < dog.age) {
            return 1;
        } else if (this.age > dog.age) {
            return -1;
        } else
            return 0;
    }

    @Override
    public String toString() {
        return "Dog{" + "age=" + age + ", name='" + name + '\'' + ", height=" + height + '}';
    }

    public Dog(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }
}
