package com.company;

class House{
    void displayHouse(){
        System.out.println("This my house");
    }
}
class Home{
    public void Home1(){
        House h = new House(){
            public void displayHouse(){
                System.out.println("This is Inner House by Annonymous class");
            }
        };
        h.displayHouse();
    }
}
public class AnnonymousInnerClass {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.Home1();
        PlayGround p = new PlayGround();
        p.Ground();
    }
}
interface Building{
    void nearPlayGround();
}
class PlayGround{
    void Ground(){
        Building b = new Building(){
            public void nearPlayGround() {
               System.out.println("I am anonymous class of Interface");
            }
        };
        b.nearPlayGround();
    }
}
