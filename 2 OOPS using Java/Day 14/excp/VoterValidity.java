package excp;

import java.util.Scanner;

public class VoterValidity {
    void chkValidity(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        
        if(age>=18){
            System.out.println("Congrats, You are eligible for voting...");
        }
        else{
        try{
        throw new InvalidEntryException("Sorry you need to wait "+(18-age)+" years more for voting..");
        }
        catch(Exception ie){
            System.err.println(ie.getMessage());
        }
        }
    }
}
