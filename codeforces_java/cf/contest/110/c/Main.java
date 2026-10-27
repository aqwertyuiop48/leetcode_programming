import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextInt()).map(n -> IntStream.rangeClosed(0, n / 7).filter(b -> (n - 7 * b) % 4 == 0).max().stream().mapToObj(b -> "4".repeat((n - 7 * b) / 4) + "7".repeat(b)).findFirst().orElse("-1")).ifPresent(System.out::println);
    }
}

