import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] t
            && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[1] = 1) : raw[i] == 45 ? (st[2] = 1) : st[1] == 1 ? (t[(int) st[3]++] = st[2] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) + (st[2] = 0) : 0) < 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1 + n]) instanceof Integer q
            && new int[n + 1] instanceof int[] bit && new int[n + 1] instanceof int[] px && new int[n + 1] instanceof int[] prev
            && IntStream.rangeClosed(1, n).filter(i -> (px[i] = px[i - 1] ^ (int) t[i]) < 0).count() == 0
            && IntStream.rangeClosed(1, n).mapToLong(i -> (t[i] << 20) | i).sorted().toArray() instanceof long[] ks
            && IntStream.range(1, n).filter(p -> (ks[p] >> 20) == (ks[p - 1] >> 20) && (prev[(int) (ks[p] & 1048575)] = (int) (ks[p - 1] & 1048575)) < 0).count() == 0
            && new int[n + 1] instanceof int[] head && new int[q] instanceof int[] nxt && new int[q] instanceof int[] ans
            && IntStream.rangeClosed(0, n).filter(i -> (head[i] = -1) > 0).count() == 0
            && IntStream.range(0, q).filter(i -> (nxt[i] = head[(int) t[2 + n + 2 * i + 1]]) + (head[(int) t[2 + n + 2 * i + 1]] = i) < -5).count() == 0
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] upd && new IntUnaryOperator[1] instanceof IntUnaryOperator[] qry
            && (upd[0] = (j, x) -> j > n ? 0 : (bit[j] ^= x) * 0 + upd[0].applyAsInt(j + (j & -j), x)) != null
            && (qry[0] = j -> j == 0 ? 0 : bit[j] ^ qry[0].applyAsInt(j & (j - 1))) != null
            && IntStream.rangeClosed(1, n).filter(r ->
                (prev[r] > 0 ? upd[0].applyAsInt(prev[r], (int) t[r]) : 0) + upd[0].applyAsInt(r, (int) t[r]) + IntStream.iterate(head[r], e -> e >= 0, e -> nxt[e])
                    .filter(e -> (ans[e] = qry[0].applyAsInt(r) ^ qry[0].applyAsInt((int) t[2 + n + 2 * e] - 1) ^ px[r] ^ px[(int) t[2 + n + 2 * e] - 1]) < -1).count() < -1).count() == 0
            ? Arrays.stream(ans).mapToObj(Integer::toString).collect(Collectors.joining("\n")) : "");
    }
}
