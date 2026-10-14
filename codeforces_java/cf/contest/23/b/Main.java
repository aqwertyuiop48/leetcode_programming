import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(t ->
            System.out.println(
                IntStream.range(0, t).mapToObj(i -> String.valueOf(Math.max(0, s.nextInt() - 2))).collect(Collectors.joining("\n")))));
    }
}
