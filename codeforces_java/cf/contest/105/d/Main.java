import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : i < raw.length && raw[i] == '-'
                        ? (ps[3] = 1) > 0 && (ps[2] = 1) > 0
                        : (ps[2] != 1 || ((g[ps[1]++] = ps[3] == 1 ? -ps[0] : ps[0]) != Integer.MIN_VALUE && (ps[0] = 0) == 0 && (ps[3] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) g[0] instanceof Integer n
            && (Integer) g[1] instanceof Integer m
            && (Integer) (n * m) instanceof Integer nm
            && IntStream.concat(Arrays.stream(g, 2, 2 + 2 * nm), IntStream.of(0)).filter(v -> v >= 0).sorted().toArray() instanceof int[] srt
            && IntStream.range(0, srt.length).filter(i -> i == 0 || srt[i] != srt[i - 1]).map(i -> srt[i]).toArray() instanceof int[] vs
            && (Integer) vs.length instanceof Integer kk
            && IntStream.range(0, nm).map(i -> Arrays.binarySearch(vs, g[2 + i])).toArray() instanceof int[] pc
            && IntStream.range(0, nm).map(i -> g[2 + nm + i] < 0 ? -1 : Arrays.binarySearch(vs, g[2 + nm + i])).toArray() instanceof int[] sc
            && new int[kk] instanceof int[] cnt
            && IntStream.range(0, nm).allMatch(i -> ++cnt[pc[i]] > 0)
            && IntStream.range(0, kk).toArray() instanceof int[] p
            && IntStream.range(0, kk).toArray() instanceof int[] val
            && Arrays.stream(new int[kk]).map(x -> 1).toArray() instanceof int[] sz
            && IntStream.range(0, kk).map(i -> cnt[i] > 0 ? i : -1).toArray() instanceof int[] cur
            && IntStream.range(0, kk).mapToObj(i -> new ArrayList<Integer>()).collect(Collectors.toList()) instanceof List<ArrayList<Integer>> lst
            && IntStream.range(0, nm).allMatch(i -> sc[i] < 0 || lst.get(pc[i]).add(i))
            && new boolean[nm] instanceof boolean[] rm
            && new int[601 * 601] instanceof int[] rk
            && new int[] {300, 300, 0} instanceof int[] sp
            && new int[] {-1, 0, 1, 0} instanceof int[] dr
            && new int[] {0, 1, 0, -1} instanceof int[] dc
            && IntStream.range(0, 1220).allMatch(s -> IntStream.range(0, s / 2 + 1).allMatch(j ->
                (sp[0] += dr[s % 4]) * 0 == 0
                && (sp[1] += dc[s % 4]) * 0 == 0
                && (sp[0] < 0 || sp[0] > 600 || sp[1] < 0 || sp[1] > 600 || (rk[sp[0] * 601 + sp[1]] = ++sp[2]) > 0)))
            && ((IntUnaryOperator) x -> IntStream.iterate(x, y -> p[y]).filter(y -> p[y] == y).findFirst().getAsInt()) instanceof IntUnaryOperator find
            && new int[nm + 1] instanceof int[] q
            && new int[1] instanceof int[] tl
            && new long[1] instanceof long[] ans
            && (Integer) ((g[2 + 2 * nm] - 1) * m + g[3 + 2 * nm] - 1) instanceof Integer st
            && (rm[st] = true)
            && (q[tl[0]++] = st) >= 0
            && ((IntPredicate) c ->
                (Integer) find.applyAsInt(pc[c]) instanceof Integer r
                && (Integer) val[r] instanceof Integer v
                && (v == 0 || v == sc[c]
                    || ((ans[0] += cnt[r]) >= 0
                        && lst.get(r).stream().filter(e -> !rm[e]).sorted(Comparator.comparingInt(e -> rk[(e / m - c / m + 300) * 601 + e % m - c % m + 300])).allMatch(e -> (rm[e] = true) && (q[tl[0]++] = e) >= 0)
                        && (lst.get(r).removeIf(e -> true) || true)
                        && (Integer) cur[sc[c]] instanceof Integer t
                        && (t < 0
                            ? (val[r] = sc[c]) >= 0 && (cur[sc[c]] = r) >= 0
                            : (Integer) (sz[r] >= sz[t] ? r : t) instanceof Integer big
                                && (Integer) (sz[r] >= sz[t] ? t : r) instanceof Integer sm
                                && (p[sm] = big) >= 0
                                && (sz[big] += sz[sm]) > 0
                                && (cnt[big] = cnt[r] + cnt[t]) >= 0
                                && (val[big] = sc[c]) >= 0
                                && (cur[sc[c]] = big) >= 0
                                && lst.set(big, lst.get(t)) != null)
                        && (cur[v] = -1) < 0))) instanceof IntPredicate step
            && IntStream.iterate(0, h -> h < tl[0], h -> h + 1).allMatch(h -> step.test(q[h]))
            ? ans[0]
            : -1L);
    }


}

