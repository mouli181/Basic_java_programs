package abstraction;

abstract class Animal {
    //aabstract method
    abstract void sound();

    // concrete method
    void info(){
        System.out.println("Hello");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

class Main{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.info();
        a.sound();
    }
}