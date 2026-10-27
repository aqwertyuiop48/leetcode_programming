import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] a
            && new int[m + 2] instanceof int[] pos && IntStream.range(0, m).allMatch(i -> (pos[Integer.parseInt(tk.nextToken())] = i) >= 0)
            && (Long) ((1L << 61) - 1) instanceof Long mod
            && ((LongBinaryOperator) (x, y) -> (Long) Math.multiplyHigh(x, y) instanceof Long hi && (Long) (x * y) instanceof Long lo
                && (Long) ((lo & mod) + (lo >>> 61) + (hi << 3)) instanceof Long r ? (Long) ((r & mod) + (r >>> 61)) instanceof Long q ? q >= mod ? q - mod : q : 0L : 0L) instanceof LongBinaryOperator mul
            && (Long) new Random(917L).nextLong(1000, mod - 1000) instanceof Long bs
            && new long[m + 2] instanceof long[] pw && (pw[0] = 1) == 1 && IntStream.rangeClosed(1, m + 1).allMatch(i -> (pw[i] = mul.applyAsLong(pw[i - 1], bs)) > 0)
            && (Long) Arrays.stream(a).reduce(0L, (h, v) -> (mul.applyAsLong(h, bs) + v) % mod) instanceof Long ha
            && (Long) IntStream.range(0, n).mapToLong(j -> pw[j]).reduce(0L, (x, y) -> (x + y) % mod) instanceof Long sp
            && (Integer) (Integer.highestOneBit(Math.max(1, 2 * m - 1))) instanceof Integer sz0 && (Integer) (sz0 < m ? 2 * sz0 : sz0) instanceof Integer sz
            && new int[2 * sz] instanceof int[] cnt && new long[2 * sz] instanceof long[] hs
            && ((IntBinaryOperator) (p, v) -> (cnt[sz + p] = v > 0 ? 1 : 0) >= 0 && (hs[sz + p] = v) >= 0
                && IntStream.iterate((sz + p) >> 1, i -> i >= 1, i -> i >> 1).allMatch(i -> (cnt[i] = cnt[2 * i] + cnt[2 * i + 1]) >= 0
                    && (hs[i] = (mul.applyAsLong(hs[2 * i], pw[cnt[2 * i + 1]]) + hs[2 * i + 1]) % mod) >= 0) ? 0 : 1) instanceof IntBinaryOperator put
            && IntStream.rangeClosed(1, n).allMatch(v -> put.applyAsInt(pos[v], v) == 0)
            ? IntStream.rangeClosed(0, m - n).filter(x -> (x == 0 || put.applyAsInt(pos[x], 0) == 0 && put.applyAsInt(pos[x + n], x + n) == 0)
                && hs[1] == (ha + mul.applyAsLong(x, sp)) % mod).count() : "");
    }
}

