import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[3] instanceof int[] st && new boolean[1000001] instanceof boolean[] present && new int[1000001] instanceof int[] g && new boolean[1000001] instanceof boolean[] comp
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0 : st[2] == 1 && ((st[1]++ == 0 || (present[st[0]] = true)) && (st[0] = 0) == 0 && (st[2] = 0) == 0)).count() >= 0
            && IntStream.rangeClosed(2, 1000).filter(i -> !comp[i]).filter(i -> IntStream.rangeClosed(i, 1000000 / i).filter(k -> (comp[i * k] = true)).count() >= 0).count() >= 0
            && IntStream.rangeClosed(2, 1000000).filter(i -> !comp[i]).toArray() instanceof int[] primes
            && IntStream.rangeClosed(1, 1023).filter(v -> (g[v] += present[v] ? 1 : 0) >= 0 && Arrays.stream(primes).takeWhile(p -> p <= 1000000 / v).filter(p -> g[p * v] < g[v] && (g[p * v] = g[v]) > 0).count() >= 0).count() >= 0
            && IntStream.range(10, 20).allMatch(b -> (Integer) (1 << b) instanceof Integer lo && (Integer) Math.min(2 * lo - 1, 1000000) instanceof Integer hi
                && IntStream.rangeClosed(lo, hi).filter(v -> (g[v] += present[v] ? 1 : 0) >= 0).count() >= 0
                && Arrays.stream(primes).takeWhile(p -> p <= 1000000 / lo).filter(p -> IntStream.rangeClosed(lo, Math.min(hi, 1000000 / p)).filter(v -> g[p * v] < g[v] && (g[p * v] = g[v]) > 0).count() >= 0).count() >= 0)
            ? Arrays.stream(g).max().getAsInt() : "");
    }
}
