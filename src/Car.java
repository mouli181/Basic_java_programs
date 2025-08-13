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

    public String toString(){
        return "Car name  : " + name + " , Car model " + model + " , car price" + price;
    }
}
