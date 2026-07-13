import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        // Array of size same as enum
        //[_,"Swimming",_,_,_,_,_]
        //No hashing
        // ordinal/index is used
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY, "Swimming");
        map.put(Day.MONDAY, "Walk");

        System.out.println(map);
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, STATURDAY, SUNDAY
}
