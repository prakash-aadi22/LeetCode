import java.util.Scanner;

public class q_1108_Defanging_an_IP_Address {
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String address = sc.next();
        System.out.println(defangIPaddr(address));
    }
}
