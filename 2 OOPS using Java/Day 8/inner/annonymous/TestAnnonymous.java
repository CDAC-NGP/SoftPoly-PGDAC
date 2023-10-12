package inner.annonymous;
//class ParentOfAnnonymous{
//    void greeting(){
//        System.out.println("Say Hello...");
//    }
//}
interface ParentOfAnnonymous{
    public void greeting();
    void show();
}
class OuterOfAnnonymous{
    ParentOfAnnonymous p2=new ParentOfAnnonymous(){
        @Override
        public void greeting() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void show() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
    ParentOfAnnonymous p=new ParentOfAnnonymous(){
        @Override
        public void greeting() {
            System.out.println("Say Namaste...");
        }
        @Override
        public void show() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
} 
public class TestAnnonymous {
    public static void main(String[] args) {
        OuterOfAnnonymous o=new OuterOfAnnonymous();
        o.p.greeting();
    }
}
