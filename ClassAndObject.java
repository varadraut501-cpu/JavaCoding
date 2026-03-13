package JavaCoding;

class Student {
    int rollNo;
    String name;

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 101;
        s1.name = "Varad";
        s1.display();
    }
}