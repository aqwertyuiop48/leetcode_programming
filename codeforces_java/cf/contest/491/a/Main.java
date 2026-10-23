import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new int[]{sc.nextInt(), sc.nextInt()}).ifPresent(v -> System.out.print(
            IntStream.concat(IntStream.rangeClosed(1, v[0]), IntStream.iterate(v[0] + v[1] + 1, x -> x > v[0], x -> x - 1))
                .mapToObj(String::valueOf).collect(Collectors.joining(" ")))));
    }
}
