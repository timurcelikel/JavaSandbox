package java17.basics;

public class ReferenceFields {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Saturn");
        Cat cat2 = cat1;
        cat1.setName("Figaro");
        System.out.println(cat2.getName()); // prints Figaro

        Cat cat3 = new Cat("Saturn");
        Cat cat4 = cat3;
        cat4.setName("Figaro");
        System.out.println(cat3.getName()); // prints Figaro

        // Node temp = head;
        // head = head.next;
        Cat cat5 = new Cat("Saturn");
        Cat cat6 = new Cat("Figaro");
        Cat cat7 = cat5;
        cat5 = cat6;
        System.out.println(cat7.getName()); // prints Saturn
    }
}

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
