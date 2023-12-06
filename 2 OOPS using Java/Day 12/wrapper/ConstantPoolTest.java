package wrapper;
public class ConstantPoolTest {
    public static void main(String[] args) {
        //For Integer family -128 to 127
//        Byte b1=Byte.valueOf("127");
//        Byte b2=Byte.valueOf("127");
//        
//            Short b1=Short.valueOf("156");
//            Short b2=Short.valueOf("156");
//           

//Boolean b1=Boolean.valueOf("false");
//Boolean b2=Boolean.valueOf("false");


//Float b1=Float.valueOf("12.23");
//Float b2=Float.valueOf("12.23");

//Range for character for constant pool '\u0000' to '\u007f'
System.out.println('\u0950');
//Character b1=Character.valueOf('A');
//Character b2=Character.valueOf('A');
Character b1=Character.valueOf('\u0950');
Character b2=Character.valueOf('\u0950');
        System.out.println(b1==b2);
    }
}
