package com.example.javafx;
interface person{
    void greet();
}

public class annonymousInnerClassDemo {
    public static void main(String[] args) {
        person Person = new person(){
            @Override
            public void greet(){
                System.out.println("Nameste!!!");
            }
        };
        Person.greet();
    }

}
