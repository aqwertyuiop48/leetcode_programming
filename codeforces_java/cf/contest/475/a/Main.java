import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextInt()).ifPresent(k -> System.out.print("+------------------------+\n" + IntStream.range(0, 4).mapToObj(r -> "|" + IntStream.range(0, 11).mapToObj(c -> r == 2 && c > 0 ? ".." : ((c == 0 ? r : 4 + 3 * (c - 1) + (r == 3 ? 2 : r)) < k ? "O" : "#") + ".").collect(Collectors.joining()) + (r == 2 ? "..|" : r == 0 ? "|D|)" : r == 1 ? "|.|" : "|.|)")).collect(Collectors.joining("\n")) + "\n+------------------------+"));
    }
}
