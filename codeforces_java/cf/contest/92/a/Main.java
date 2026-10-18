import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            && (Integer) (s.nextInt() % (n * (n + 1) / 2)) instanceof Integer m
            ? m - IntStream.rangeClosed(1, n).filter(i -> i * (i + 1) / 2 <= m).map(i -> i * (i + 1) / 2).max().orElse(0)
            : 0));
    }
}




