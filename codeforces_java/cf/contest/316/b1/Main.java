import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToInt(Integer::parseInt).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer x
            && new int[n + 1] instanceof int[] a && new int[n + 1] instanceof int[] nxt
            && IntStream.rangeClosed(1, n).allMatch(i -> (a[i] = it.nextInt()) >= 0 && (a[i] == 0 || (nxt[a[i]] = i) > 0))
            && Integer.valueOf(IntStream.iterate(x, v -> v != 0, v -> a[v]).reduce((p, q) -> q).getAsInt()) instanceof Integer hx
            && new boolean[n + 1] instanceof boolean[] dp && (dp[0] = true)
            && IntStream.rangeClosed(1, n).filter(h -> a[h] == 0 && h != hx).map(h -> (int) IntStream.iterate(h, v -> v != 0, v -> nxt[v]).count())
                .allMatch(len -> IntStream.iterate(n, s -> s >= len, s -> s - 1).allMatch(s -> dp[s] || (dp[s] = dp[s - len]) || true))
            ? IntStream.rangeClosed(0, n).filter(s -> dp[s]).mapToObj(s -> String.valueOf(s + (int) IntStream.iterate(x, v -> v != 0, v -> a[v]).count())).collect(Collectors.joining("\n")) : "");
    }
}
