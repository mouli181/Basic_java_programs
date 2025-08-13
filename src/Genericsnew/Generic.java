package Genericsnew;

public class Generic {
    public <T> void print(T[] a){
        for(T b : a){
            System.out.println(b);
        }
    }
}

class Main{
    public static void main(String[] args) {
        Generic g = new Generic();
        Integer[] i = {10,20,30,40,50};
        String[] s = {"Hello","welcome","java"};
        Double[] d = {10.5,20.5};
        g.print(d);
        g.print(i);
        g.print(s);
    }
}