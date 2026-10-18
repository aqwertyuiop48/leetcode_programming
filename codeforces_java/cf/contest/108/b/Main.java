import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> IntStream.range(0, s.nextInt()).map(i -> s.nextInt()).sorted().toArray()).map(a -> IntStream.range(0, a.length - 1).anyMatch(i -> a[i] < a[i + 1] && 2L * a[i] > a[i + 1]) ? "YES" : "NO").ifPresent(System.out::println);
    }
}
