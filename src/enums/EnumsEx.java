package enums;

import java.util.EnumSet;

public class EnumsEx {
    public enum Day{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
    }
}

class Enumex{
    public static void main(String[] args) {
        EnumSet<Day> weekend = EnumSet.of(Day.Saturday,Day.Sunday);

       for(Day d : weekend){
           System.out.println(d);
       }
    }
}
