package org.spring;

public class Shyam implements Action{
    @Override
    public void eat() {
        System.out.println("Shyam eat");
    }

    @Override
    public void sleep() {
        System.out.println("Shyam sleep");
    }
}
