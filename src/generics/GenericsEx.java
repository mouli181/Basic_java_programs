package generics;

public class GenericsEx {
    public <T> void print(T[] arr){
        for(T a : arr){
            System.out.println(a);
        }
    }
}


class Main{
    public static void main(String[] args) {
        Integer[] a = {10,20,30};
        String[] b = {"Hello","welcome"};
        Double[] d = {10.4,20.6};
        GenericsEx g = new GenericsEx();
        g.print(a);
        g.print(b);
        g.print(d);
    }
}