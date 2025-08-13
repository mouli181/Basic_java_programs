package polymorphism;

public class Shape {
    void draw(){
        System.out.println("This is shape class");
    }
}

class Circle extends Shape{
    void draw(){
        super.draw();
        System.out.println("This is circle class");
    }
}

class Main{
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
