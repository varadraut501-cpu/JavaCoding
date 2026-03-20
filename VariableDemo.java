package JavaCoding;

class Demo {
    int a = 10;           // Instance variable
    static int b = 20;    // Static variable

    void display() {
        int c = 30;       // Local variable
        System.out.println("Instance: " + a);
        System.out.println("Static: " + b);
        System.out.println("Local: " + c);
    }
}

public class VariableDemo {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.display();
        obj2.display();
    }
}