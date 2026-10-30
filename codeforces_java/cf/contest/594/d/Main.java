import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            && new int[q] instanceof int[] ql && IntStream.range(0, n + 1).map(i -> -1).toArray() instanceof int[] head && new int[q] instanceof int[] nxt
            && IntStream.range(0, q).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer l && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer r
                && (ql[i] = l) > 0 && (nxt[i] = head[r]) >= -1 && (head[r] = i) >= 0)
            && new int[1000001] instanceof int[] spf
            && IntStream.rangeClosed(2, 1000).filter(p -> spf[p] == 0).allMatch(p -> IntStream.iterate(p * p, j -> j <= 1000000, j -> j + p).filter(j -> spf[j] == 0).allMatch(j -> (spf[j] = p) > 0))
            && new long[1000001] instanceof long[] inv && (inv[1] = 1) == 1
            && IntStream.rangeClosed(2, 1000000).allMatch(i -> (inv[i] = (1000000007L - (1000000007L / i) * inv[(int) (1000000007L % i)] % 1000000007L) % 1000000007L) > 0)
            && IntStream.range(0, n + 2).mapToLong(i -> 1L).toArray() instanceof long[] bit
            && ((LongBinaryOperator) (pos, v) -> IntStream.iterate(n + 1 - (int) pos, j -> j <= n, j -> j + (j & -j)).allMatch(j -> (bit[j] = bit[j] * v % 1000000007L) > 0) ? 1 : 0) instanceof LongBinaryOperator upd
            && ((IntUnaryOperator) x -> spf[x] == 0 ? x : spf[x]) instanceof IntUnaryOperator sp
            && new int[1000001] instanceof int[] last && new long[q] instanceof long[] ans
            && IntStream.rangeClosed(1, n).allMatch(i -> upd.applyAsLong(i, a[i]) >= 0
                && IntStream.iterate(a[i], x -> x > 1, x -> x / sp.applyAsInt(x)).filter(x -> (x / sp.applyAsInt(x)) % sp.applyAsInt(x) != 0).map(sp).allMatch(p ->
                    (last[p] == 0 || upd.applyAsLong(last[p], (long) p * inv[p - 1] % 1000000007L) >= 0) && upd.applyAsLong(i, (long) (p - 1) * inv[p] % 1000000007L) >= 0 && (last[p] = i) > 0)
                && IntStream.iterate(head[i], j -> j >= 0, j -> nxt[j]).allMatch(j -> (ans[j] = IntStream.iterate(n + 1 - ql[j], k -> k > 0, k -> k - (k & -k)).mapToLong(k -> bit[k]).reduce(1L, (x, y) -> x * y % 1000000007L)) > 0))
            ? Arrays.stream(ans).mapToObj(Long::toString).collect(Collectors.joining("\n")) : "");
    }
}
