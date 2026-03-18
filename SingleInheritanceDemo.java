package JavaCoding;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inherits Parent class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();   // Parent class method
        d.bark();  // Child class method
    }
}