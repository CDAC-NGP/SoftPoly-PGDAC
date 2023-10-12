package abstraction;

import java.util.Scanner;

abstract class LivingThing {

    void eyes() {
        System.out.println("Two Eyes");
    }

    void mouth() {
        System.out.println("One Mouth");
    }

    abstract void legs();
}

class Human extends LivingThing {

    @Override
    void legs() {
        System.out.println("Two Legs");
    }
}

class Animal extends LivingThing {

    @Override
    void legs() {
        System.out.println("Four Legs");
    }
}

public class TestAbstraction {

    static void showProperty(LivingThing t) {
        t.eyes();
        t.mouth();
        t.legs();
    }

    public static void main(String[] args) {
//        LivingThing lt;
//        System.out.println("Property of Human");
//        lt=new Human();
//        lt.eyes();
//        lt.mouth();
//        lt.legs();
//        System.out.println("*************************************");
//        System.out.println("Property of Animal");
//        lt=new Animal();
//        lt.eyes();
//        lt.mouth();
//        lt.legs();

        System.out.println("Whose property want to know");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        if (choice.equals("Human")) {
            System.out.println("Property of Human");
            showProperty(new Human());
        } else {
            System.out.println("Property of Animal");
            showProperty(new Animal());
        }
    }
}
