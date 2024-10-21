package BasicJava;

class X{
    static {
        Y.display();
    }
}
class Y extends X{
    static void display(){ //missing code
        System.out.println("Java");
    }
}
public class MainClass {
    public static void main(String[] args){
        Y.display();
    }
}
