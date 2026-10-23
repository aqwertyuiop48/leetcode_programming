import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(sc -> sc.nextInt()).ifPresent(n -> System.out.println(IntStream.range(0, n).mapToObj(i ->
            "*".repeat(Math.abs(i - n / 2)) + "D".repeat(n - 2 * Math.abs(i - n / 2)) + "*".repeat(Math.abs(i - n / 2))).collect(Collectors.joining("\n"))));
    }
}
