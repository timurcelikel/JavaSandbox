package java17.basics;

public class StaticInitBlock {
    public static void main(String[] args) {
        System.out.println("Main method called");
        SIBTest sibTest = new SIBTest();
        sibTest.someMethod();
        System.out.println("Owner is: " + SIBTest.owner);
    }
}

class SIBTest {
    public static final String owner;

    static {
        owner = "bob";
        System.out.println("SIBTest static initialization block called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
