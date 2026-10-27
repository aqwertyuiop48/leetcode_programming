import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(LocalDate.ofYearDay(s.nextInt(), s.nextInt())).ifPresent(d -> System.out.print(d.getDayOfMonth() + " " + d.getMonthValue())));
    }
}

