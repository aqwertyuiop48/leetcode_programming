import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            ? IntStream.range(0, 4).mapToObj(r -> IntStream.range(0, n).mapToObj(c -> String.valueOf(
                n % 2 == 0
                ? (r == 0 ? "ab".charAt(c / 2 % 2) : r == 3 ? "cd".charAt(c / 2 % 2) : c == 0 ? 'e' : c == n - 1 ? 'j' : r == 1 ? "fg".charAt((c - 1) / 2 % 2) : "hi".charAt((c - 1) / 2 % 2))
                : (r == 0 ? (c == n - 1 ? 'e' : "ab".charAt(c / 2 % 2)) : r == 1 ? (c == n - 1 ? 'e' : "fg".charAt(c / 2 % 2)) : c == 0 ? 'k' : r == 2 ? "hi".charAt((c - 1) / 2 % 2) : "cd".charAt((c - 1) / 2 % 2))
            )).collect(Collectors.joining())).collect(Collectors.joining("\n"))
            : ""));
    }
}





