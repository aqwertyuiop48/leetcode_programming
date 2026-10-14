import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(IntStream.generate(s::nextInt).limit(4).toArray()).ifPresent(h ->
            Optional.of(IntStream.range(0, h[2]).mapToObj(i -> IntStream.generate(s::nextInt).limit(2).toArray()).toArray(int[][]::new)).ifPresent(v ->
            Optional.of(new int[(2 * h[3] + 1) * (2 * h[3] + 1)]).ifPresent(memo ->
            Optional.of(new AtomicReference<BiFunction<Integer, Integer, Boolean>>()).filter(r -> r.updateAndGet(o -> (x, y) ->
                memo[(x + h[3]) * (2 * h[3] + 1) + y + h[3]] != 0 ? memo[(x + h[3]) * (2 * h[3] + 1) + y + h[3]] == 1
                : Optional.of(memo[(x + h[3]) * (2 * h[3] + 1) + y + h[3]] = 2).map(z ->
                    Arrays.stream(v).anyMatch(t -> (x + t[0]) * (x + t[0]) + (y + t[1]) * (y + t[1]) <= h[3] * h[3] && !r.get().apply(x + t[0], y + t[1]))
                    ? (memo[(x + h[3]) * (2 * h[3] + 1) + y + h[3]] = 1) == 1 : false).get()) != null).ifPresent(r ->
                System.out.print(r.get().apply(h[0], h[1]) ? "Anton" : "Dasha"))))));
    }
}
