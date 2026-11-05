import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && new int[b.length / 2 + 4] instanceof int[] a && new int[]{-1, 0} instanceof int[] ps
            && IntStream.range(0, b.length).filter(i -> (b[i] > 47 ? (ps[0] = (ps[0] < 0 ? 0 : ps[0]) * 10 + b[i] - 48) : ps[0] < 0 ? 0 : (a[ps[1]++] = ps[0]) * 0 + (ps[0] = -1)) < -5).count() == 0
            && (ps[0] < 0 || (a[ps[1]] = ps[0]) >= 0)
            && (Integer) a[0] instanceof Integer n && (Integer) a[1] instanceof Integer m
            && new int[n + 1] instanceof int[] t1 && IntStream.rangeClosed(1, n).allMatch(i -> (t1[i] = i & -i) > 0)
            && new int[m + 1] instanceof int[] t2 && new int[n + 1] instanceof int[] last && new int[n + 1] instanceof int[] perm && new int[]{0, 1, 0, 0} instanceof int[] st
            && new IntUnaryOperator[5] instanceof IntUnaryOperator[] f
            && (f[0] = q -> q > n ? 0 : --t1[q] * 0 + f[0].applyAsInt(q + (q & -q))) != null
            && (f[1] = q -> q > m ? 0 : ++t2[q] * 0 + f[1].applyAsInt(q + (q & -q))) != null
            && (f[2] = q -> q > m ? 0 : --t2[q] * 0 + f[2].applyAsInt(q + (q & -q))) != null
            && (f[3] = q -> q > 0 ? t2[q] + f[3].applyAsInt(q - (q & -q)) : 0) != null
            && (f[4] = q -> q < 0 ? st[2] : (st[2] + (1 << q) <= n && t1[st[2] + (1 << q)] < st[3] ? (st[3] -= t1[st[2] += 1 << q]) * 0 : 0) + f[4].applyAsInt(q - 1)) != null
            && IntStream.rangeClosed(1, m).allMatch(t -> (Integer) a[2 * t] instanceof Integer x && (Integer) a[2 * t + 1] instanceof Integer y
                && (last[x] == 0
                    ? y > st[0] && y <= n && (st[2] = 0) == 0 && (st[3] = y - st[0]) > 0
                        && f[4].applyAsInt(20) >= 0
                        && (perm[st[2] + 1] = x) > 0
                        && f[0].applyAsInt(st[2] + 1) == 0
                        && f[1].applyAsInt(t) == 0 && (last[x] = t) > 0 && ++st[0] > 0
                    : 1 + st[0] - f[3].applyAsInt(last[x]) == y
                        && f[2].applyAsInt(last[x]) == 0
                        && f[1].applyAsInt(t) == 0 && (last[x] = t) > 0)
                || (st[1] = 0) < 0)
            && IntStream.rangeClosed(1, n).filter(x -> last[x] == 0).iterator() instanceof PrimitiveIterator.OfInt it
            && new byte[8 * n + 8] instanceof byte[] out && new int[]{0} instanceof int[] ow
            && IntStream.rangeClosed(1, n).allMatch(s -> (perm[s] != 0 || (perm[s] = it.nextInt()) > 0) && (Integer) perm[s] instanceof Integer v
                && (Integer) (v < 10 ? 1 : v < 100 ? 2 : v < 1000 ? 3 : v < 10000 ? 4 : v < 100000 ? 5 : v < 1000000 ? 6 : 7) instanceof Integer len
                && (out[ow[0] + len - 1] = (byte) (48 + v % 10)) > 0
                && (len < 2 || (out[ow[0] + len - 2] = (byte) (48 + v / 10 % 10)) > 0) && (len < 3 || (out[ow[0] + len - 3] = (byte) (48 + v / 100 % 10)) > 0)
                && (len < 4 || (out[ow[0] + len - 4] = (byte) (48 + v / 1000 % 10)) > 0) && (len < 5 || (out[ow[0] + len - 5] = (byte) (48 + v / 10000 % 10)) > 0)
                && (len < 6 || (out[ow[0] + len - 6] = (byte) (48 + v / 100000 % 10)) > 0) && (len < 7 || (out[ow[0] + len - 7] = (byte) (48 + v / 1000000 % 10)) > 0)
                && (out[ow[0] + len] = (byte) (s < n ? 32 : 10)) > 0 && (ow[0] += len + 1) > 0)
            ? new String(out, 0, ow[0]).trim() : "-1");
    }
}

