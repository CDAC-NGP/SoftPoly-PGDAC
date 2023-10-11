package relation.association;
class Person{
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
    void personDetails(){
        System.out.println("Person Name "+name);
        System.out.println("Person Address "+address);
    }
}
class Address{
    private int houseNo;
    private String landMark;
    private String city;
    private String state;
    private String pincode;

    public Address(int houseNo, String landMark, String city, String state, String pincode) {
        this.houseNo = houseNo;
        this.landMark = landMark;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" + "houseNo=" + houseNo + ", landMark=" + landMark + ", city=" + city + ", state=" + state + ", pincode=" + pincode + '}';
    }
}
public class TestAssociation {
    public static void main(String[] args) {
        Person p=new Person("Ramesh", new Address(101, "Hi-Tech City", "Nagpur", "Maharastra", "440030"));
        p.personDetails();
    }
}
