import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) (s.nextInt() / 2) instanceof Integer h && (Integer) s.nextInt() instanceof Integer x && (Integer) s.nextInt() instanceof Integer y && (x == h || x == h + 1) && (y == h || y == h + 1) ? "NO" : "YES").ifPresent(System.out::println);
    }
}

