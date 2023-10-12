package inner.nonstat;
class Outer{
    int x=100;
    class Inner{
        int y=200;
        void display(){
            System.out.println("I'm in non static inner class "+(x+y));
        }
    }
}

public class TestNonStaticInnerCls {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner obj=o.new Inner();
        obj.display();
    }
}
