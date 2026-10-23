import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> System.out.print(IntStream.range(0, n).map(i -> s.nextInt()).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" ")))));
    }
}
