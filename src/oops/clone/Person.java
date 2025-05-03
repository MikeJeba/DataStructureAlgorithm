package oops.clone;

public class Person implements Cloneable{

    String name;
    Address address;

    public Person(Address address, String name) {
        this.address = address;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
