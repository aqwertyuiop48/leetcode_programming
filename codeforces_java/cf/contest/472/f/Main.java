import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[3] instanceof int[] st && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0 : st[2] > 0 && (v[st[0]++] = st[1]) >= 0 && (st[1] = st[2] = 0) == 0) || true)
                && (Integer) v[0] instanceof Integer n
                && new int[30] instanceof int[] piv && new int[30] instanceof int[] pm && new int[30] instanceof int[] pos && new boolean[n] instanceof boolean[] isB && new int[2] instanceof int[] rg && new int[1] instanceof int[] rc
                && Optional.<IntUnaryOperator>of(val -> (rg[0] = val) >= 0 && (rg[1] = 0) == 0 && IntStream.iterate(29, b -> b >= 0, b -> b - 1).allMatch(b -> (rg[0] >> b & 1) == 0 || piv[b] == 0 || ((rg[0] ^= piv[b]) >= 0 && (rg[1] ^= pm[b]) >= 0) || true) && rg[0] == 0 ? rg[1] : -1).get() instanceof IntUnaryOperator expr
                && IntStream.range(0, n).allMatch(i -> expr.applyAsInt(v[1 + i]) >= 0 || (Integer) (31 - Integer.numberOfLeadingZeros(rg[0])) instanceof Integer hb && (piv[hb] = rg[0]) > 0 && (pm[hb] = rg[1] ^ 1 << rc[0]) >= 0 && (pos[rc[0]] = i) >= 0 && (isB[i] = true) && rc[0]++ >= 0)
                && new int[n] instanceof int[] my && IntStream.range(0, n).allMatch(i -> (my[i] = expr.applyAsInt(v[1 + n + i])) >= 0)
                && new StringBuilder() instanceof StringBuilder sb && new int[1] instanceof int[] cnt
                && Optional.<IntBinaryOperator>of((a, b) -> sb.append(a + 1).append(' ').append(b + 1).append('\n') != null && cnt[0]++ >= 0 ? 1 : 0).get() instanceof IntBinaryOperator add
                && IntStream.range(0, n).filter(i -> !isB[i]).allMatch(i -> add.applyAsInt(i, i) > 0 && IntStream.range(0, rc[0]).filter(k -> (my[i] >> k & 1) != 0).allMatch(k -> add.applyAsInt(i, pos[k]) > 0))
                && IntStream.range(0, rc[0]).map(k -> my[pos[k]]).toArray() instanceof int[] mm && new boolean[30] instanceof boolean[] used && new int[4000] instanceof int[] ra && new int[4000] instanceof int[] rb && new int[1] instanceof int[] rn
                && Optional.<IntBinaryOperator>of((a, b) -> (ra[rn[0]] = a) >= 0 && (rb[rn[0]++] = b) >= 0 ? 1 : 0).get() instanceof IntBinaryOperator rec
                && IntStream.range(0, rc[0]).allMatch(c -> (Integer) IntStream.range(0, rc[0]).filter(i -> !used[i] && (mm[i] >> c & 1) != 0).findFirst().orElse(-1) instanceof Integer i0 && (i0 < 0 || (i0 == c || rec.applyAsInt(i0, c) > 0 && rec.applyAsInt(c, i0) > 0 && rec.applyAsInt(i0, c) > 0 && (Integer) mm[i0] instanceof Integer tt && (mm[i0] = mm[c]) >= 0 && (mm[c] = tt) >= 0) && (used[c] = true) && IntStream.range(0, rc[0]).filter(j -> j != c && (mm[j] >> c & 1) != 0).allMatch(j -> (mm[j] ^= mm[c]) >= 0 && rec.applyAsInt(j, c) > 0)))
                && IntStream.range(0, rc[0]).filter(c -> used[c]).allMatch(c -> IntStream.range(0, rc[0]).filter(j -> !used[j] && (mm[c] >> j & 1) != 0).allMatch(j -> add.applyAsInt(pos[c], pos[j]) > 0))
                && IntStream.range(0, rc[0]).filter(j -> !used[j]).allMatch(j -> add.applyAsInt(pos[j], pos[j]) > 0)
                && IntStream.range(0, rn[0]).allMatch(t -> (Integer) (rn[0] - 1 - t) instanceof Integer u && add.applyAsInt(pos[ra[u]], pos[rb[u]]) > 0) ? cnt[0] + "\n" + sb : "-1");
    }
}
