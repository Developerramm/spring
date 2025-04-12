package org.spring;

public class Shyam implements Action{

    public Shyam(){
        System.out.println("Shyam object is created");
    }
    @Override
    public void eat() {
        System.out.println("Shyam eat");
    }

    @Override
    public void sleep() {
        System.out.println("Shyam sleep");
    }
}
