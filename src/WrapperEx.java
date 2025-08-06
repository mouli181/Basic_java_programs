public class WrapperEx {
    public static void main(String[] args) {
        //autoboxing
        int a = 20;
        Integer b = a;
        System.out.println(b);

        //unboxing
        Integer c = 30;
        int d = c;
        System.out.println(d);

        int e = 50;
        Integer f = Integer.valueOf(e);
        System.out.println(f);

        Integer g = 40;
        int h = g.intValue();
        System.out.println(h);
    }
}
