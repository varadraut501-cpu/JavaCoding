package JavaCoding;

class Student {
    int rollNo;
    String name;

    // Non-Parameterized Constructor
    Student() {
        rollNo = 100;
        name = "Varad";
        System.out.println("Constructor is called");
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class NonParamConstructor {
    public static void main(String[] args) {

        Student s1 = new Student();   // Constructor automatically called
        s1.display();
    }
}