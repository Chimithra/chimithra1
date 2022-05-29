package com.company;

interface Languages {
    // by default public static final
    String name = "Chithu my mom";
    // member of Languages
    void chitra(String Name);
    // default method
    default void  child(){
        System.out.println("Chitra has 3 child");
    }
}
class Language implements Languages{
    // abstract member of Languages
    public void chitra(String Name){
        System.out.println("Chitra other Name : "+Name);
        System.out.println("name : "+name);
    }
    // override the default child() method
    public void child(){
        System.out.println("Children are grown");
    }
}
class InterfaceLanguage{
    public static void main(String[] args) {
        Language o = new Language();
        o.chitra("Chithu");
        o.child();
        chitra.staticMethod();
    }
}
// can use static method after java 8
// can use private after java 9 and it act as support method to other methods
interface chitra{
    static void staticMethod(){
        System.out.println("it is static method inside interface");
    }
}