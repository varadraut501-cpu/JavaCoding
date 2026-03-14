package JavaCoding;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// First child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Second child class
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();   // Parent method
        d.bark();  // Dog method

        c.eat();   // Parent method
        c.meow();  // Cat method
    }
}