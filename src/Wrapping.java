public class Wrapping {
    public static void main(String[] args) {
        //Wrapping
        int a = 50;
        Integer b = Integer.valueOf(a);
        System.out.println(b);

        //unwrapping
        int c = b.intValue();
        System.out.println(c);

        //Autoboxing
        int d = 100;
        Integer e = d;
        System.out.println(e);

        //unboxing
        int f = e;
        System.out.println(f);
    }
}
