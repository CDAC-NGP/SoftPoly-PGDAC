package overoading;
class Account{
    int accNo;
    String accType;

    public Account(int an) {
        accNo=an;
        accType="Saving";
    }

    public Account(int accNo, String accType) {
        this.accNo = accNo;
        this.accType = accType;
    }
    
    void displayInfo(){
        System.out.println("Your account no is "+accNo+" and belongs to "+accType+" account category");
    }
    
}
public class BankAccount {
    public static void main(String[] args) {
        Account ac=new Account(1110022);
        ac.displayInfo();
        
        Account ac1=new Account(1110022,"Current");
        ac1.displayInfo();
    }
}
