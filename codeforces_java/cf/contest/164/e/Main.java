import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && (Long) (-1000000000000000000L) instanceof Long neg
            && new long[n + 1] instanceof long[] l && new long[n + 1] instanceof long[] r && new long[n + 1] instanceof long[] t
            && IntStream.rangeClosed(1, n).allMatch(i -> (l[i] = Long.parseLong(tk.nextToken())) > 0 && (r[i] = Long.parseLong(tk.nextToken())) > 0 && (t[i] = Long.parseLong(tk.nextToken())) > 0)
            && new int[n + 1] instanceof int[] lc && new int[n + 1] instanceof int[] rc && new int[n + 1] instanceof int[] pri && new int[n + 1] instanceof int[] mk
            && new long[n + 1] instanceof long[] ms && new long[n + 1] instanceof long[] sm && new long[n + 1] instanceof long[] mm && new long[n + 1] instanceof long[] mt
            && (mm[0] = neg) < 0 && new Random(12345L) instanceof Random rnd && IntStream.rangeClosed(1, n).allMatch(i -> (pri[i] = rnd.nextInt()) != 0 || true)
            && ((IntUnaryOperator) v -> (Integer) lc[v] instanceof Integer a && (Integer) rc[v] instanceof Integer b
                && (Long) (mm[a] == neg ? ms[v] : Math.max(mm[a] + t[v], ms[v])) instanceof Long m1
                && (sm[v] = sm[a] + t[v] + sm[b]) >= 0 && (mm[v] = mm[b] == neg ? m1 : Math.max(m1 + sm[b], mm[b])) > Long.MIN_VALUE
                && (mt[v] = Math.max(t[v], Math.max(mt[a], mt[b]))) > 0 && (mk[v] = Math.max(v, Math.max(mk[a], mk[b]))) > 0 ? 0 : 0) instanceof IntUnaryOperator upd
            && new LongBinaryOperator[1] instanceof LongBinaryOperator[] split && new IntBinaryOperator[1] instanceof IntBinaryOperator[] merge
            && (split[0] = (v, val) -> v == 0 ? 0L
                : v < val ? (Long) split[0].applyAsLong(rc[(int) v], val) instanceof Long p && (rc[(int) v] = (int) (p >> 32)) >= 0 && upd.applyAsInt((int) v) == 0 ? (v << 32) | (p & 0xFFFFFFFFL) : 0L
                : (Long) split[0].applyAsLong(lc[(int) v], val) instanceof Long p2 && (lc[(int) v] = (int) (p2 & 0xFFFFFFFFL)) >= 0 && upd.applyAsInt((int) v) == 0 ? (p2 & ~0xFFFFFFFFL) | v : 0L) != null
            && (merge[0] = (a, b) -> a == 0 ? b : b == 0 ? a : pri[a] > pri[b]
                ? (rc[a] = merge[0].applyAsInt(rc[a], b)) >= 0 && upd.applyAsInt(a) == 0 ? a : 0
                : (lc[b] = merge[0].applyAsInt(a, lc[b])) >= 0 && upd.applyAsInt(b) == 0 ? b : 0) != null
            && ((BinaryOperator<long[]>) (x, y) -> new long[]{x[0] + y[0], x[1] == neg ? y[1] : y[1] == neg ? x[1] : Math.max(x[1] + y[0], y[1])}) instanceof BinaryOperator<long[]> comb
            && new long[1024] instanceof long[] preS && new long[1024] instanceof long[] preM && new long[1024] instanceof long[] sufS && new long[1024] instanceof long[] sufM
            && new long[]{0, 0, 0, 0, 0, 0, 0} instanceof long[] g // g: 0 S, 1 li, 2 ti, 3 ri, 4 ans, 5 bestNew, 6 bestK
            && new int[]{0} instanceof int[] fp
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] search
            && (search[0] = (u, f) -> (Long) (long) 0 instanceof Long zero
                && new long[]{preS[f], preM[f]} instanceof long[] pre && new long[]{sufS[f], sufM[f]} instanceof long[] suf
                && new long[]{sm[lc[u]], mm[lc[u]]} instanceof long[] left && new long[]{sm[rc[u]], mm[rc[u]]} instanceof long[] right
                && comb.apply(pre, left) instanceof long[] lst && comb.apply(right, suf) instanceof long[] rst
                && (Long) (Math.max(g[0] - t[u], Math.max(lst[1] + rst[0], rst[1]))) instanceof Long ru
                && (Long) (Math.max(ru + 1, g[1]) + g[2] - 1) instanceof Long na
                && (!(na < g[4] && na <= g[3]) || !(na < g[5] || na == g[5] && u > g[6]) || ((g[5] = na) >= 0 && (g[6] = u) >= 0))
                && new long[]{t[u], ms[u]} instanceof long[] node
                && comb.apply(comb.apply(node, right), suf) instanceof long[] sufLeft && comb.apply(comb.apply(pre, left), node) instanceof long[] preRight
                && Stream.of(lc[u] != 0 ? new long[]{lc[u], pre[0], pre[1], sufLeft[0], sufLeft[1]} : null, rc[u] != 0 ? new long[]{rc[u], preRight[0], preRight[1], suf[0], suf[1]} : null)
                    .filter(Objects::nonNull).map(c -> new long[]{c[0], c[1], c[2], c[3], c[4], Math.max(Math.max(g[0] - mt[(int) c[0]], c[2] + c[3]), c[4]), mk[(int) c[0]]})
                    .map(c -> new long[]{c[0], c[1], c[2], c[3], c[4], Math.max(c[5] + 1, g[1]) + g[2] - 1, c[6]})
                    .sorted((x, y) -> x[5] != y[5] ? Long.compare(x[5], y[5]) : Long.compare(y[6], x[6])).toList() instanceof List<long[]> ch
                && ch.stream().allMatch(c -> c[5] >= g[4] || c[5] > g[3] || c[5] > g[5] || c[5] == g[5] && c[6] <= g[6]
                    || (Integer) fp[0] instanceof Integer fr && (preS[fr] = c[1]) >= 0 && (preM[fr] = c[2]) < Long.MAX_VALUE && (sufS[fr] = c[3]) >= 0 && (sufM[fr] = c[4]) < Long.MAX_VALUE
                    && ++fp[0] > 0 && search[0].applyAsInt((int) c[0], fr) == 0 && --fp[0] >= 0)
                ? 0 : 0) != null
            && new int[]{0} instanceof int[] root && new long[]{0} instanceof long[] ans
            ? IntStream.rangeClosed(1, n).mapToObj(i -> (Long) Math.max(ans[0] + 1, l[i]) instanceof Long s0 && s0 + t[i] - 1 <= r[i]
                    ? (ms[i] = l[i] + t[i] - 1) > 0 && (sm[i] = t[i]) > 0 && (mm[i] = ms[i]) > 0 && (mt[i] = t[i]) > 0 && (mk[i] = i) > 0 && (root[0] = merge[0].applyAsInt(root[0], i)) >= 0 && (ans[0] = Math.max(sm[root[0]], mm[root[0]])) >= 0 ? "0" : ""
                    : root[0] == 0 ? "-1"
                    : (g[0] = sm[root[0]]) >= 0 && (g[1] = l[i]) > 0 && (g[2] = t[i]) > 0 && (g[3] = r[i]) > 0 && (g[4] = ans[0]) >= 0 && (g[5] = ans[0]) >= 0 && (g[6] = -1) < 0
                        && (preS[0] = 0) == 0 && (preM[0] = neg) < 0 && (sufS[0] = 0) == 0 && (sufM[0] = neg) < 0 && (fp[0] = 1) == 1
                        && search[0].applyAsInt(root[0], 0) == 0
                        ? g[6] == -1 ? "-1"
                            : (Long) split[0].applyAsLong(root[0], (int) g[6]) instanceof Long p1 && (Long) split[0].applyAsLong((int) (p1 & 0xFFFFFFFFL), (int) g[6] + 1) instanceof Long p2
                                && (root[0] = merge[0].applyAsInt((int) (p1 >> 32), (int) (p2 & 0xFFFFFFFFL))) >= 0
                                && (ms[i] = l[i] + t[i] - 1) > 0 && (sm[i] = t[i]) > 0 && (mm[i] = ms[i]) > 0 && (mt[i] = t[i]) > 0 && (mk[i] = i) > 0 && (lc[i] = 0) == 0 && (rc[i] = 0) == 0
                                && (root[0] = merge[0].applyAsInt(root[0], i)) >= 0 && (ans[0] = Math.max(sm[root[0]], mm[root[0]])) >= 0 ? String.valueOf(g[6]) : "" : "").collect(Collectors.joining(" ")) : "");
    }
}

