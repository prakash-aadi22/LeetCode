public class Main_Copy {
    public static void charValue() {
        String a = "hello2";
        System.out.println(a.charAt(a.length() - 1));
        System.out.println(a.charAt(a.length() - 1) - '0');
        System.out.println(a.charAt(a.length() - 1) - '1');
        System.out.println(a.charAt(a.length() - 1) - 'a');
        System.out.println(a.charAt(a.length() - 1) - '2');
        System.out.println(a.charAt(a.length() - 1) - '3');
    }

    public static void main(String[] args) {
        charValue();
    }
}
