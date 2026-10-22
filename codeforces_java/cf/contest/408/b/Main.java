import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s && sc.next() instanceof String t
            ? t.chars().anyMatch(c -> s.indexOf(c) < 0) ? "-1" : String.valueOf(t.chars().distinct().mapToLong(c -> Math.min(s.chars().filter(x -> x == c).count(), t.chars().filter(x -> x == c).count())).sum()) : "");
    }
}
