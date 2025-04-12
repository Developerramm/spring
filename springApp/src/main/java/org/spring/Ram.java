package org.spring;

public class Ram implements Action{

    public  Ram(){
        System.out.println("Ram object is created");
    }
    @Override
    public void eat() {
        System.out.println("Ram eating");
    }

    @Override
    public void sleep() {
        System.out.println("Ram is sleeping");
    }
}
