import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(Scanner::nextInt).ifPresent(n ->
            System.out.println(IntStream.rangeClosed(-n, n).mapToObj(i -> n - Math.abs(i)).map(k ->
                " ".repeat(2 * (n - k)) + IntStream.rangeClosed(-k, k).mapToObj(j -> String.valueOf(k - Math.abs(j)))
                    .collect(Collectors.joining(" "))).collect(Collectors.joining("\n"))));
    }
}
