package com.company;
abstract class Chitra {
        abstract void chimithra1();// if method is abstract then holding class should be abstract
        void chimithra2() {
            System.out.println("This is Chimithra1 Smily");
        }
}
class Meena extends Chitra { // class should be abstract
    void chimithra1(){ // Or abstract parent class method should be defined in derived class
        System.out.println("Other name of chimithra is Meena");
    }
}
public class AbstractionProgram{
    public static void main(String[] args) {
        Meena o = new Meena();
        o.chimithra2();
        o.chimithra1();
    }
}
