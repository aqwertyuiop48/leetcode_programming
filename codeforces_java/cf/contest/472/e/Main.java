import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[3] instanceof int[] st && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0 : st[2] > 0 && (v[st[0]++] = st[1]) >= 0 && (st[1] = st[2] = 0) == 0) || true)
                && (Integer) v[0] instanceof Integer n && (Integer) v[1] instanceof Integer m && (Integer) (n * m) instanceof Integer N
                && IntStream.range(0, N).map(c -> v[2 + c]).toArray() instanceof int[] bd && IntStream.range(0, N).map(c -> v[2 + N + c]).toArray() instanceof int[] tg
                && Arrays.equals(IntStream.of(bd).sorted().toArray(), IntStream.of(tg).sorted().toArray())
                ? (n == 1 || m == 1
                        ? (Integer) IntStream.range(0, N * N).filter(code -> code / N != code % N && IntStream.range(0, N).allMatch(x -> (x < code % N ? bd[x < code / N ? x : x + 1] : x == code % N ? bd[code / N] : bd[x - 1 < code / N ? x - 1 : x]) == tg[x])).findFirst().orElse(-1) instanceof Integer w && w >= 0 && (Integer) (w / N) instanceof Integer si && (Integer) (w % N) instanceof Integer sj
                                ? Math.abs(si - sj) + "\n" + IntStream.rangeClosed(0, Math.abs(si - sj)).mapToObj(t -> (Integer) (si + (sj > si ? t : -t)) instanceof Integer idx ? n == 1 ? "1 " + (idx + 1) : (idx + 1) + " 1" : "").collect(Collectors.joining("\n")) : "-1"
                        : new int[N] instanceof int[] rr && new int[N] instanceof int[] cc && IntStream.range(0, N).allMatch(c -> (rr[c] = c / m) >= 0 && (cc[c] = c % m) >= 0)
                        && new boolean[N] instanceof boolean[] fx && new int[N] instanceof int[] vs && new int[N] instanceof int[] par && new int[N] instanceof int[] q && new int[N] instanceof int[] pa && new int[N] instanceof int[] rt
                        && new int[]{-1, -1, -1, 0, 0, 1, 1, 1} instanceof int[] dr && new int[]{-1, 0, 1, -1, 1, -1, 0, 1} instanceof int[] dc
                        && new int[3] instanceof int[] qs && new int[]{-1} instanceof int[] av && new int[1] instanceof int[] f && new int[1] instanceof int[] kk && new int[2] instanceof int[] ix && new StringBuilder() instanceof StringBuilder sb
                        && (Integer) IntStream.range(0, N).filter(c -> bd[c] == tg[0]).findFirst().getAsInt() instanceof Integer s0 && (f[0] = s0) >= 0
                        && Optional.<IntBinaryOperator>of((u, k) -> (Integer) (rr[u] + dr[k]) instanceof Integer r2 && (Integer) (cc[u] + dc[k]) instanceof Integer c2 && r2 >= 0 && r2 < n && c2 >= 0 && c2 < m && (Integer) (r2 * m + c2) instanceof Integer w && w != av[0] && !fx[w] && vs[w] != qs[2] && (vs[w] = qs[2]) > 0 && (par[w] = u) >= -1 && (q[qs[1]++] = w) >= 0 ? 1 : 0).get() instanceof IntBinaryOperator relax
                        && Optional.<IntBinaryOperator>of((src, dst) -> (++qs[2]) > 0 && (qs[0] = 0) == 0 && (qs[1] = 1) == 1 && (q[0] = src) >= 0 && (vs[src] = qs[2]) > 0 && (par[src] = -1) == -1 && IntStream.generate(() -> 0).anyMatch(z -> vs[dst] == qs[2] || qs[0] >= qs[1] || (Integer) q[qs[0]++] instanceof Integer u && relax.applyAsInt(u, 0) + relax.applyAsInt(u, 1) + relax.applyAsInt(u, 2) + relax.applyAsInt(u, 3) + relax.applyAsInt(u, 4) + relax.applyAsInt(u, 5) + relax.applyAsInt(u, 6) + relax.applyAsInt(u, 7) < 0) && vs[dst] == qs[2] ? 1 : 0).get() instanceof IntBinaryOperator bfs
                        && Optional.<IntUnaryOperator>of(dst -> (Integer) (int) IntStream.iterate(dst, x -> x >= 0, x -> par[x]).count() instanceof Integer len && (ix[0] = len) > 0 && IntStream.iterate(dst, x -> x >= 0, x -> par[x]).allMatch(x -> (pa[--ix[0]] = x) >= 0) ? len : 0).get() instanceof IntUnaryOperator getp
                        && Optional.<IntUnaryOperator>of(c -> (Integer) bd[f[0]] instanceof Integer t0 && (bd[f[0]] = bd[c]) >= 0 && (bd[c] = t0) >= 0 && (f[0] = c) >= 0 && kk[0]++ >= 0 && sb.append(rr[c] + 1).append(' ').append(cc[c] + 1).append('\n') != null ? 1 : 0).get() instanceof IntUnaryOperator mv
                        && Optional.<IntUnaryOperator>of(dst -> bfs.applyAsInt(f[0], dst) > 0 && (Integer) getp.applyAsInt(dst) instanceof Integer len && IntStream.range(1, len).allMatch(i -> mv.applyAsInt(pa[i]) > 0) ? 1 : 0).get() instanceof IntUnaryOperator mvTo
                        && Optional.<IntPredicate>of(d -> bd[d] == tg[d] && f[0] != d ? (fx[d] = true) : IntStream.range(0, N).filter(c -> !fx[c] && c != f[0] && bd[c] == tg[d]).reduce((a, b) -> Math.max(Math.abs(rr[a] - rr[d]), Math.abs(cc[a] - cc[d])) <= Math.max(Math.abs(rr[b] - rr[d]), Math.abs(cc[b] - cc[d])) ? a : b) instanceof OptionalInt op && op.isPresent() && (av[0] = -1) == -1 && (Integer) op.getAsInt() instanceof Integer p && bfs.applyAsInt(p, d) > 0 && (Integer) getp.applyAsInt(d) instanceof Integer rl && IntStream.range(0, rl).allMatch(i -> (rt[i] = pa[i]) >= 0)
                                && IntStream.range(0, rl - 1).allMatch(i -> (av[0] = rt[i]) >= -1 && mvTo.applyAsInt(rt[i + 1]) > 0 && mv.applyAsInt(rt[i]) > 0) && (av[0] = -1) == -1 && (fx[d] = true)).get() instanceof IntPredicate place
                        && IntStream.concat(IntStream.concat(IntStream.range(0, (n - 2) * m).map(t -> (n - 1 - t / m) * m + t % m), IntStream.range(0, 2 * (m - 2)).map(t -> (t & 1) == 0 ? m - 1 - t / 2 : m + m - 1 - t / 2)), IntStream.of(m + 1, 1, m)).toArray() instanceof int[] ord
                        && IntStream.of(ord).allMatch(d -> place.test(d))
                                ? kk[0] + "\n" + (rr[s0] + 1) + " " + (cc[s0] + 1) + "\n" + sb : "-1")
                : "-1");
    }
}
