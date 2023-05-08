package java17.basics;

public class FinalDogName {
    public static void main(String[] args) {
        Dog myDog = new Dog("Lady");
        System.out.println(myDog.getName());
    }
}

class Dog {

    private final String name;
    /* The below line creates a compilation error in the Constructor
    private final String name = "Penny";
    */

    public Dog(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /* The below does not compile because name is final
    public void setName(String name) {
        this.name = name;
    }
    */
}
