import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer x && (Integer) s.nextInt() instanceof Integer y && (x == n || x == n + 1) && (y == n || y == n + 1) ? "NO" : "YES").ifPresent(System.out::println);
    }
}
