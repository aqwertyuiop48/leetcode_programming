import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                s.next() instanceof String t
                && Long.valueOf(t) instanceof Long n
                && Long.valueOf(t.chars().map(c -> c - '0').filter(d -> d != 0 && n % d == 0).count()) instanceof Long c
                ? (c == t.length() ? "happier" : c > 0 ? "happy" : "upset")
                : ""));
    }
}
