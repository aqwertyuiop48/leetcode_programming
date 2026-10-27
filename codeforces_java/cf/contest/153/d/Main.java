import java.time.*;
import java.time.format.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && DateTimeFormatter.ofPattern("dd.MM.yyyy") instanceof DateTimeFormatter f
            ? LocalDate.parse(s.next(), f).plusDays(s.nextLong()).format(f)
            : "");
    }
}

