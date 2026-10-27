import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(s.next()).ifPresent(t -> System.out.print(t.chars().allMatch(c -> c == '4' || c == '7') && t.substring(0, n / 2).chars().map(c -> c - '0').sum() == t.substring(n / 2).chars().map(c -> c - '0').sum() ? "YES" : "NO"))));
    }
}

