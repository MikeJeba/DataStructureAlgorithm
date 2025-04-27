package oops;

public class main {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.rollno = 5;
        obj.marks = 50;
        obj.name = "Ann";

//        System.out.println(obj.rollno);
//        System.out.println(obj.marks);
//        System.out.println(obj.name);


    }
}

class Student{
    int rollno;
    String name;
    float marks;
}
