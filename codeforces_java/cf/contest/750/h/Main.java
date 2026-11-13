import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer h && Integer.valueOf(sc.nextInt()) instanceof Integer w && Integer.valueOf(sc.nextInt()) instanceof Integer q
            && Integer.valueOf(w + 2) instanceof Integer W && Integer.valueOf((h + 2) * (w + 2)) instanceof Integer N && new boolean[N] instanceof boolean[] blk
            && IntStream.rangeClosed(1, h).allMatch(r -> sc.next() instanceof String row && IntStream.range(0, w).allMatch(c -> (blk[r * W + c + 1] = row.charAt(c) == '#') || true))
            && new int[]{-W - 1, -W, -W + 1, 1, W + 1, W, W - 1, -1} instanceof int[] off
            && new int[N] instanceof int[] comp && IntStream.range(0, N).allMatch(i -> (comp[i] = -1) < 0)
            && new int[N] instanceof int[] st && new int[]{0, 2} instanceof int[] sp
            && ((IntBinaryOperator) (seed, lab) -> (comp[seed] = lab) >= 0 && (st[0] = seed) >= 0 && (sp[0] = 1) == 1
                && IntStream.iterate(0, k -> sp[0] > 0, k -> k + 1).allMatch(k -> Integer.valueOf(st[--sp[0]]) instanceof Integer cur
                    && IntStream.range(0, 8).allMatch(d -> !blk[cur + off[d]] || comp[cur + off[d]] >= 0 || ((comp[cur + off[d]] = lab) >= 0 && (st[sp[0]++] = cur + off[d]) >= 0))) ? 1 : 0) instanceof IntBinaryOperator fill
            && IntStream.rangeClosed(1, h).allMatch(r -> IntStream.rangeClosed(1, w).allMatch(c -> !blk[r * W + c] || comp[r * W + c] >= 0 || !(r == 1 || c == w) || fill.applyAsInt(r * W + c, 0) >= 0))
            && IntStream.rangeClosed(1, h).allMatch(r -> IntStream.rangeClosed(1, w).allMatch(c -> !blk[r * W + c] || comp[r * W + c] >= 0 || !(r == h || c == 1) || fill.applyAsInt(r * W + c, 1) >= 0))
            && IntStream.range(0, N).allMatch(p -> !blk[p] || comp[p] >= 0 || fill.applyAsInt(p, sp[1]++) >= 0)
            && new long[h * w * 6 + 1024] instanceof long[] keys && new int[1] instanceof int[] kn && IntStream.range(0, 100).filter(t -> t / 10 < t % 10).toArray() instanceof int[] pt
            && IntStream.range(0, 64).filter(t -> t / 8 < t % 8).toArray() instanceof int[] p8
            && IntStream.rangeClosed(1, h).allMatch(r -> IntStream.rangeClosed(1, w).allMatch(c -> Integer.valueOf(r * W + c) instanceof Integer p
                && (blk[p] || (r == 1 && c == 1) || (r == h && c == w)
                    || (r > 1 && r < h && c > 1 && c < w
                        ? IntStream.range(0, 8).filter(d -> blk[p + off[d]] && !blk[p + off[(d + 7) & 7]]).count() < 2
                            || IntStream.of(p8).allMatch(t -> comp[p + off[t / 8]] < 0 || comp[p + off[t % 8]] < 0 || comp[p + off[t / 8]] == comp[p + off[t % 8]]
                                || comp[p + off[t / 8]] == comp[p + off[(t / 8 + 7) & 7]] || comp[p + off[t % 8]] == comp[p + off[(t % 8 + 7) & 7]]
                                || (keys[kn[0]++] = ((long) Math.min(comp[p + off[t / 8]], comp[p + off[t % 8]]) << 20) | Math.max(comp[p + off[t / 8]], comp[p + off[t % 8]])) >= 0)
                        : IntStream.range(0, 10).map(d -> d < 8 ? comp[p + off[d]] : d == 8 ? (r == 1 || c == w ? 0 : -1) : (r == h || c == 1 ? 1 : -1)).toArray() instanceof int[] a
                            && IntStream.range(0, 10).map(i -> i == 0 ? (a[0] == a[7] ? -1 : a[0]) : i < 8 && a[i] == a[i - 1] ? -1 : a[i]).toArray() instanceof int[] b
                            && IntStream.of(pt).allMatch(t -> b[t / 10] < 0 || b[t % 10] < 0 || b[t / 10] == b[t % 10] || (keys[kn[0]++] = ((long) Math.min(b[t / 10], b[t % 10]) << 20) | Math.max(b[t / 10], b[t % 10])) >= 0)))))
            && IntStream.of(0).peek(z -> Arrays.parallelSort(keys, 0, kn[0])).findFirst().isPresent()
            && new int[sp[1]] instanceof int[] slot && IntStream.range(0, sp[1]).allMatch(i -> (slot[i] = i < 2 ? i : -1) < 100000000)
            && new int[N] instanceof int[] tmark && new int[128] instanceof int[] par && new int[128] instanceof int[] cid && new int[]{0} instanceof int[] cn
            && IntStream.range(0, 2).allMatch(i -> (cid[i] = i) >= 0)
            && ((IntUnaryOperator) x -> IntStream.iterate(x, y -> par[y] != y, y -> par[y]).reduce((a, b) -> b) instanceof OptionalInt o && o.isPresent() ? par[o.getAsInt()] : x) instanceof IntUnaryOperator find
            && ((IntBinaryOperator) (a, b) -> par[find.applyAsInt(a)] = find.applyAsInt(b)) instanceof IntBinaryOperator uni
            && ((IntUnaryOperator) z -> tmark[z] > 0 ? find.applyAsInt(tmark[z]) : blk[z] && slot[comp[z]] >= 0 ? find.applyAsInt(slot[comp[z]]) : -1) instanceof IntUnaryOperator grp
            && IntStream.range(0, q).allMatch(qi -> Integer.valueOf(sc.nextInt()) instanceof Integer k && new int[k] instanceof int[] tp
                && IntStream.range(0, k).allMatch(i -> Integer.valueOf(sc.nextInt()) instanceof Integer rr && Integer.valueOf(sc.nextInt()) instanceof Integer cc && (tp[i] = rr * W + cc) > 0 && (tmark[tp[i]] = 2 + i) > 0)
                && IntStream.range(0, k + 2).allMatch(i -> (par[i] = i) >= 0) && (cn[0] = k + 2) > 0
                && IntStream.range(0, k).allMatch(i -> Integer.valueOf(tp[i] / W) instanceof Integer r && Integer.valueOf(tp[i] % W) instanceof Integer c
                    && (!(r == 1 || c == w) || uni.applyAsInt(2 + i, 0) >= 0) && (!(r == h || c == 1) || uni.applyAsInt(2 + i, 1) >= 0)
                    && IntStream.range(0, 8).allMatch(d -> Integer.valueOf(tp[i] + off[d]) instanceof Integer z
                        && (tmark[z] > 0 ? uni.applyAsInt(2 + i, tmark[z]) >= 0
                            : !blk[z] || ((slot[comp[z]] >= 0 || ((slot[comp[z]] = cn[0]) >= 0 && (cid[cn[0]] = comp[z]) >= 0 && (par[cn[0]] = cn[0]) >= 0 && ++cn[0] > 0)) && uni.applyAsInt(2 + i, slot[comp[z]]) >= 0))))
                && Boolean.valueOf(find.applyAsInt(0) != find.applyAsInt(1)
                    && IntStream.range(0, k * 8).allMatch(t -> Integer.valueOf(tp[t / 8] + off[t % 8]) instanceof Integer v && Integer.valueOf(v / W) instanceof Integer vr && Integer.valueOf(v % W) instanceof Integer vc
                        && (vr < 1 || vr > h || vc < 1 || vc > w || blk[v] || tmark[v] > 0 || v == W + 1 || v == h * W + w
                            || !((vr == 1 || vc == w || IntStream.range(0, 8).anyMatch(d -> grp.applyAsInt(v + off[d]) == find.applyAsInt(0)))
                                && (vr == h || vc == 1 || IntStream.range(0, 8).anyMatch(d -> grp.applyAsInt(v + off[d]) == find.applyAsInt(1))))))
                    && !IntStream.range(0, cn[0]).filter(i -> (i < 2 || i >= k + 2) && find.applyAsInt(i) == find.applyAsInt(0))
                        .anyMatch(i -> IntStream.range(0, cn[0]).filter(j -> (j < 2 || j >= k + 2) && find.applyAsInt(j) == find.applyAsInt(1))
                            .anyMatch(j -> cid[i] != cid[j] && Arrays.binarySearch(keys, 0, kn[0], ((long) Math.min(cid[i], cid[j]) << 20) | Math.max(cid[i], cid[j])) >= 0))) instanceof Boolean ok
                && IntStream.range(k + 2, cn[0]).allMatch(i -> (slot[cid[i]] = -1) < 0) && IntStream.range(0, k).allMatch(i -> (tmark[tp[i]] = 0) == 0)
                && System.out.append(ok ? "YES\n" : "NO\n") != null) ? "" : "");
    }
}
