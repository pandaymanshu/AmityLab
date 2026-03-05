class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the parent class method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class TestOverride {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
