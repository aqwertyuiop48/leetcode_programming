import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nk ->
            System.out.println(
                new boolean[nk[0] + 1] instanceof boolean[] composite
                && IntStream.rangeClosed(2, nk[0]).allMatch(i ->
                    composite[i] || IntStream.iterate(i * i, v -> v <= nk[0], v -> v + i).allMatch(v -> (composite[v] = true)))
                && IntStream.rangeClosed(2, nk[0]).filter(i -> !composite[i]).toArray() instanceof int[] primes
                && IntStream.range(0, primes.length - 1)
                    .filter(i -> primes[i] + primes[i + 1] + 1 <= nk[0] && !composite[primes[i] + primes[i + 1] + 1])
                    .count() >= nk[1]
                ? "YES"
                : "NO")));
    }
}

