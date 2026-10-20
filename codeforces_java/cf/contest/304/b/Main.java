import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && java.time.LocalDate.parse(s.next().replace(':', '-')) instanceof java.time.LocalDate d1
            && java.time.LocalDate.parse(s.next().replace(':', '-')) instanceof java.time.LocalDate d2
            ? Math.abs(java.time.temporal.ChronoUnit.DAYS.between(d1, d2)) : "");
    }
}
