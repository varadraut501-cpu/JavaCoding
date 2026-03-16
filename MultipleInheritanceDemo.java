package JavaCoding;

interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

// Child class implementing both interfaces
class Child implements Father, Mother {

    public void showFather() {
        System.out.println("This is Father method");
    }

    public void showMother() {
        System.out.println("This is Mother method");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {

        Child c = new Child();

        c.showFather();
        c.showMother();
    }
}