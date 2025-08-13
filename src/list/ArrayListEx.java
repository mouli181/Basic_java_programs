package list;

import mypackage.MyPrivate;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayListEx {
    public static void main(String[] args) {
       Stack l = new Stack();
       l.push("Hello");
       l.push("world");
       l.push("welcome");
       System.out.println(l);
        System.out.println(l.pop());
        System.out.println(l);
        System.out.println(l.peek());


        MyPrivate m = new MyPrivate(10);
        m.display();
    }
}
