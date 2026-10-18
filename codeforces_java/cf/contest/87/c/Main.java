import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            && new int[n + 2] instanceof int[] g
            && new int[n + 2] instanceof int[] px
            && new int[1024] instanceof int[] mark
            && IntStream.rangeClosed(1, n).allMatch(m ->
                IntStream.iterate(2, k -> k * (k + 1) / 2 <= m, k -> k + 1).filter(k -> (m - k * (k - 1) / 2) % k == 0)
                    .map(k -> px[(m - k * (k - 1) / 2) / k + k] ^ px[(m - k * (k - 1) / 2) / k]).allMatch(v -> (mark[v] = m) == m)
                && (g[m] = IntStream.iterate(0, i -> i + 1).filter(i -> mark[i] != m).findFirst().getAsInt()) >= 0
                && (px[m + 1] = px[m] ^ g[m]) >= 0)
            ? IntStream.iterate(2, k -> k * (k + 1) / 2 <= n, k -> k + 1).filter(k -> (n - k * (k - 1) / 2) % k == 0)
                .filter(k -> (px[(n - k * (k - 1) / 2) / k + k] ^ px[(n - k * (k - 1) / 2) / k]) == 0).findFirst().orElse(-1)
            : 0));
    }
}




