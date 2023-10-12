package inheritance.single;
class Parent{
    int a=10;
    void show(){
        System.out.println("a= "+a);
    }
}
class Child extends Parent{
    int b=20;
    void display(){
        System.out.println("b= "+b);
    }
}
public class TestSingleInheritance {
    public static void main(String[] args) {
//        Parent p=new Parent();
////        System.out.println(p.a);
//        p.show();
//        Child c=new Child();
////        System.out.println(c.b);
//c.display();

Child c=new Child();
c.show();
c.display();
    }
}
