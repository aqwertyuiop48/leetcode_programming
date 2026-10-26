import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s && (Integer) s.length() instanceof Integer n
            && new int[n + 1] instanceof int[] p && IntStream.range(0, n).allMatch(i -> (p[i + 1] = p[i] + (s.charAt(i) == '(' ? 1 : -1)) > Integer.MIN_VALUE)
            && (Integer) Math.max(0, -p[n]) instanceof Integer need
            && new int[n + 2] instanceof int[] sufMin && (sufMin[n] = Integer.MAX_VALUE) > 0 && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (sufMin[i] = Math.min(sufMin[i + 1], p[i + 1])) > Integer.MIN_VALUE)
            && new int[n + 1] instanceof int[] preMin && (preMin[0] = Integer.MAX_VALUE) > 0 && IntStream.rangeClosed(1, n).allMatch(i -> (preMin[i] = Math.min(preMin[i - 1], p[i])) > Integer.MIN_VALUE)
            && new long[2][2 * n + 1] instanceof long[][] h && new long[2][2 * n + 1] instanceof long[][] pw && new long[]{911382323L, 972663749L} instanceof long[] bs && new long[]{1000000007L, 998244353L} instanceof long[] md
            && IntStream.range(0, 2).allMatch(w -> (pw[w][0] = 1) > 0 && IntStream.range(0, 2 * n).allMatch(i -> (h[w][i + 1] = (h[w][i] * bs[w] + (s.charAt(i % n) == '(' ? 1 : 2)) % md[w]) >= 0 && (pw[w][i + 1] = pw[w][i] * bs[w] % md[w]) >= 0))
            && ((IntBinaryOperator) (i, j) -> (Integer) IntStream.iterate(1 << 20, b -> b > 0, b -> b >> 1).reduce(0, (len, b) -> len + b <= n && IntStream.range(0, 2).allMatch(w ->
                    ((h[w][i + len + b] - h[w][i] * pw[w][len + b]) % md[w] + md[w]) % md[w] == ((h[w][j + len + b] - h[w][j] * pw[w][len + b]) % md[w] + md[w]) % md[w]) ? len + b : len) instanceof Integer lcp
                ? (lcp >= n ? 0 : Integer.compare(s.charAt((i + lcp) % n), s.charAt((j + lcp) % n))) : 0) instanceof IntBinaryOperator cmp
            && (Integer) IntStream.range(0, n).filter(i -> need + (i < n ? sufMin[i] - p[i] : 0) >= 0 && (i == 0 || need + p[n] - p[i] + preMin[i] >= 0)).reduce((a, b) -> cmp.applyAsInt(b, a) < 0 ? b : a).getAsInt() instanceof Integer best
            ? "(".repeat(need) + s.substring(best) + s.substring(0, best) + ")".repeat(Math.max(0, p[n])) : "");
    }
}
