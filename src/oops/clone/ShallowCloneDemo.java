package oops.clone;

public class ShallowCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address obj1 = new Address("New York");
        Person obj2 = new Person(obj1,"Ann");
        Person obj3 = (Person) obj2.clone();

        obj3.address.Address = "Los Vegas";
        obj3.name = "Jeba";

        System.out.println("Object one: " + obj2.address.Address);
        System.out.println("Object two: " + obj3.address.Address);
    }
}
