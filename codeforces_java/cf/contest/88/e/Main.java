import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            && new int[n + 2] instanceof int[] g
            && new int[n + 2] instanceof int[] pre
            && IntStream.rangeClosed(1, n).allMatch(i ->
                IntStream.rangeClosed(2, 450)
                    .filter(k -> i - k * (k - 1) / 2 >= k && (i - k * (k - 1) / 2) % k == 0)
                    .map(k -> pre[(i - k * (k - 1) / 2) / k + k - 1] ^ pre[(i - k * (k - 1) / 2) / k - 1])
                    .boxed().collect(Collectors.toSet()) instanceof Set<Integer> st
                && (g[i] = IntStream.iterate(0, x -> x + 1).filter(x -> !st.contains(x)).findFirst().getAsInt()) >= 0
                && (pre[i] = pre[i - 1] ^ g[i]) >= 0)
            ? String.valueOf(IntStream.rangeClosed(2, 450)
                .filter(k -> n - k * (k - 1) / 2 >= k && (n - k * (k - 1) / 2) % k == 0
                    && (pre[(n - k * (k - 1) / 2) / k + k - 1] ^ pre[(n - k * (k - 1) / 2) / k - 1]) == 0)
                .findFirst().orElse(-1))
            : ""));
    }
}




