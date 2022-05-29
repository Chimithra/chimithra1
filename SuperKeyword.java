package com.company;
class A{
    protected String name = "charu";
}
class B extends A{
    protected String name;
    void display(){
        System.out.println("child class : "+name);
        System.out.println("parent class by super : "+super.name);
    }

}
public class SuperKeyword {
    public static void main(String[] args) {
        B o = new B();
        o.name = "chimi";
        o.display();
        D o1 = new D();
    }
}
class C{
    C(){
        System.out.println("I am C class ");
    }
    C(String Name){
        System.out.println("I have a Name as parameter in Parent class : "+Name);
    }
}
class D extends C{
    D(){
        super("CHIKKI");// if we want parent contractor , super() should be in first of child class
        System.out.println("i am D : child class");
    }
}