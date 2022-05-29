package com.company;
public class CopyContructors {
    int Age;
    String Name;
    public CopyContructors(){
        this.Age = 5;
        this.Name = "Chimi";
    }
    public CopyContructors(CopyContructors o){
        this.Name = o.Name;
        this.Age = o.Age;
    }
    void display(){
        System.out.println(Age +" "+ Name);
        //System.out.println(Name);
    }
    public static void main(String [] args){
        CopyContructors o = new CopyContructors();
        o.display();
        CopyContructors o1 = new CopyContructors(o);
        o1.display();
    }
}
