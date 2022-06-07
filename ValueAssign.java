package com.company;
class Test{
    int a;
    Test(int x){
        a = x;
    }
    void print1(){
        System.out.println("I am a in class Test without Override "+a);
    }
}
class Test1{
   /* int a;
    Test1(Test o){
        this.a = o.a;
    }*/
    void Method(){
        Test h = new Test(5){
            void print1(){
                System.out.println("Value of a in class Test with override : "+ a);
            }
        };
        h.print1();
    }
    void commonMethod(Test o){
        System.out.println("I am in class without Initialize : "+o.a);
    }
}

public class ValueAssign {
    public static void main(String[] args) {
        Test h1 = new Test(10);
        Test1 h2 = new Test1();
        h2.commonMethod(h1);
        h1.print1();
        h2.Method();
    }
}
