import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(s.nextInt()).ifPresent(k ->
            Optional.of(s.nextInt()).ifPresent(t ->
                System.out.print(IntStream.range(0, n).mapToObj(i -> String.valueOf(Math.max(0, Math.min(k, (long) n * k * t / 100 - (long) i * k)))).collect(Collectors.joining(" ")))))));
    }
}



