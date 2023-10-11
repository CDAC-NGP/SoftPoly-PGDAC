package inheritance.multilevel;
class GrandParent{
    int x=100;
    void test(){
        System.out.println("x= "+x);
    }
}
class Parent extends GrandParent{
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
public class TestMultiInheritance {
    public static void main(String[] args) {
        Child c=new Child();
        
        c.test();
        c.show();
        c.display();
    }
}
