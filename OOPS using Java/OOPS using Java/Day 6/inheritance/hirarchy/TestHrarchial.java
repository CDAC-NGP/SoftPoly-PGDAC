package inheritance.hirarchy;
class Parent{
    int a=10;
    void show(){
        System.out.println("Parent a= "+a);
    }
}
class Child1 extends Parent{
    int x=100;
    void display1(){
        System.out.println("Child1 x= "+x);
    }
}
class Child2 extends Parent{
    int x=200;
    void display2(){
        System.out.println("Child2 x= "+x);
    }
}
class Child3 extends Parent{
    int x=300;
    void display3(){
        System.out.println("Child3 x= "+x);
    }
}
public class TestHrarchial {
    public static void main(String[] args) {
        Child1 c1=new Child1();
        Child2 c2=new Child2();
        Child3 c3=new Child3();
        
        c1.show();
        c1.display1();
        
        c2.show();
        c2.display2();
        
        c3.show();
        c3.display3();
    }
}
