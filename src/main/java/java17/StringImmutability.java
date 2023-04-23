package java17;

public class StringImmutability {
    public static void main(String[] args) {
        String str1 = "abc";
        String r1 = str1;
        str1 = str1 + "def";
        System.out.println("str1: " + str1);

        String r2 = str1;
        System.out.println("r1: " + r1); // abc
        System.out.println("r2: " + r2); // abcdef

        System.out.println(r1 == r2);      //prints: false
        System.out.println(r1.equals(r2)); //prints: false
    }
}