public class Car {
    String name;
    String model;
    int price;
    String color;

    public Car(String name,String model,int price,String color){
        this.name = name;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    void display(){
        System.out.println("Car name : " +name);
        System.out.println("Car model : " + model);
        System.out.println(price);
        System.out.println(color);
    }
}
