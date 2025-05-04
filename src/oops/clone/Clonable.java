package oops.clone;

class City implements Cloneable{

    String city;

    public City(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new City(this.city);
    }
}

class Jeba implements Cloneable{
    String name;
    City address;

    public Jeba(String name, City address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Jeba cloned = (Jeba) super.clone();
        cloned.address = (City) address.clone();
        return cloned;
    }
}

public class Clonable {
    public static void main(String[] args) throws CloneNotSupportedException {
       City city = new City("New York");
       Jeba obj1 = new Jeba("Ann",city);
       Jeba obj2 = (Jeba) obj1.clone();

       obj2.address.city = "Los Vegas";
       obj2.name = "Jovitha";

       System.out.println("Object 1 " + obj1.address.city);
       System.out.println("Object  2 " + obj2.address.city);
    }
}
