package oops.clone;

class Address1 implements Cloneable {
    String city;

    public Address1(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("[DEBUG] Cloning Address: " + this.city);
        return new Address1(this.city); // deep copy of house
    }
}

class Person1 implements Cloneable {
    String name;
    Address1 address;

    public Person1(String name, Address1 address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("[DEBUG] Cloning Person: " + this.name);
        Person1 cloned = (Person1) super.clone(); // shallow copy of person
        System.out.println("[DEBUG] Person cloned (shallow): " + cloned.name);
        cloned.address = (Address1) address.clone(); // deep copy of address
        System.out.println("[DEBUG] Address cloned and assigned to " + cloned.name);
        return cloned;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", City: " + address.city);
    }
}

public class DeepCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address1 address = new Address1("New York"); // Create house
        Person1 person1 = new Person1("Alice", address); // Create Alice

        System.out.println("=== Original Person ===");
        person1.printInfo();

        System.out.println("\n=== Cloning Alice into Bob ===");
        Person1 person2 = (Person1) person1.clone(); // Deep clone

        person2.name = "Bob";                        // Change name
        person2.address.city = "Los Angeles";        // Change Bob's house

        System.out.println("\n=== After Changes ===");
        System.out.print("Original (Alice): ");
        person1.printInfo(); // Alice should still be in New York

        System.out.print("Clone (Bob): ");
        person2.printInfo(); // Bob lives in Los Angeles
    }
}

