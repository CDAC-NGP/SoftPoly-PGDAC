package string;

public class StringSorting {

    public static void main(String[] args) {
        String names = "Ramesh,Suresh,Dinesh,bhavesh,Ganesh";
        String n[] = names.split(",");
        for (String name : n) {
            System.out.println(name);
        }
        System.out.println("*****************************");
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i].compareToIgnoreCase(n[j]) <0) {
                    String temp;
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        for (String name : n) {
            System.out.println(name);
        }

    }
}
