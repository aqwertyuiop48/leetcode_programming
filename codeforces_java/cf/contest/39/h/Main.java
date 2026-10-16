import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(k -> System.out.println(
            IntStream.range(1, k).mapToObj(i -> IntStream.range(1, k)
                .mapToObj(j -> String.format("%" + Integer.toString((k - 1) * (k - 1), k).length() + "s", Integer.toString(i * j, k)))
                .collect(Collectors.joining(" ")).strip()).collect(Collectors.joining("\n")))));
    }
}




