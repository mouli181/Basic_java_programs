package enumerations;

public enum Day {
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
}

class EnumMain{
    public static void main(String[] args) {
        Day d = Day.valueOf("Friday");
        System.out.println(d);

        for(Day day : Day.values()){
            System.out.println(day);
        }
    }
}
