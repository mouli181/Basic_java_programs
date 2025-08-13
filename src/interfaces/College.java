package interfaces;

public interface College {
    void students();

    void staffs();
}

class Myclg implements College{
    public void students(){
        System.out.println("All are welcome");
    }

    public void staffs(){
        System.out.println("Welcome to our college");
    }
}

class Main{
    public static void main(String[] args) {
        College c = new Myclg();
        c.students();
        c.staffs();
    }
}