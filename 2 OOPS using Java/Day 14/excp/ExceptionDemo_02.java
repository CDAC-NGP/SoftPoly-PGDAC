package excp;
public class ExceptionDemo_02 {
    public static void main(String[] args) {
        TestThrows tt=new TestThrows();
        tt.test();
        try{
        tt.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());}
//        tt.show();
    }
}
