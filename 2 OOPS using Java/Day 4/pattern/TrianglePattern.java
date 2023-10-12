package pattern;

import java.util.Scanner;

public class TrianglePattern {
    void equilateralTriangle(){
        for(int i=0;i<5;i++){//rows
            for(int j=4;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" "+i);
            }
            System.out.println("");
        }
    }
    void revEquilateralTriangle(){
        for(int i=0;i<4;i++){//rows
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=4;j>i;j--){
                System.out.print(" "+(4-i-1));
            }
            System.out.println("");
        }
    }
    void dynaEquilateralTriangle(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of pattern");
        int size=sc.nextInt();
        char c='A';
        for(int i=0;i<size;i++){//rows
//            for(int j=size;j>0;j--){
//                System.out.print(" ");
//            }
            for(int j=size-1;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
//                System.out.print(" "+(size-i-1));
                if(j==0 || j==i)
                System.out.print(" "+c);
                else if(i==size-1 || i%5==0)
                     System.out.print(" "+c);
                else
                    System.out.print("  ");
            }
            c++;
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        TrianglePattern t=new TrianglePattern();
//        for(int i=0;i<3;i++)
//            t.equilateralTriangle();
//            t.revEquilateralTriangle();
          t.dynaEquilateralTriangle();
//          t.dynaEquilateralTriangle();
    }
}
