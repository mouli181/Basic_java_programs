package enums;

public enum Day {
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
}

class Main{
    public static void main(String[] args) {
        Day d = Day.Tuesday;
        System.out.println(d);

        for(Day day : Day.values()){
            System.out.println(day);
        }
    }
}
