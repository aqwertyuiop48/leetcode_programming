import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] by && new long[]{-1, 0} instanceof long[] st && new long[2000110] instanceof long[] tk
            && IntStream.range(0, by.length + 1).filter(i -> i < by.length && by[i] >= 48 && by[i] <= 57 ? (st[0] = Math.max(st[0], 0) * 10 + by[i] - 48) >= 0
                : st[0] < 0 || (tk[(int) st[1]] = st[0]) >= 0 && ++st[1] > 0 && (st[0] = -1) < 0).count() >= 0
            && (Integer) (int) tk[0] instanceof Integer n && (Integer) (int) tk[1] instanceof Integer q
            && new long[2 * n + 1] instanceof long[] p && IntStream.range(0, 2 * n).filter(i -> (p[i + 1] = p[i] + tk[2 + (i < n ? i : i - n)]) >= 0).count() >= 0
            && new int[n] instanceof int[] nxt && new int[1] instanceof int[] sj
            ? Arrays.stream(tk, 2 + n, 2 + n + q).mapToObj(b -> (sj[0] = 0) == 0
                && IntStream.range(0, n).filter(i -> (Integer) Math.max(sj[0], i) instanceof Integer j0
                    && (nxt[i] = sj[0] = !(j0 + 1 <= i + n && p[j0 + 1] - p[i] <= b) ? j0 : !(j0 + 2 <= i + n && p[j0 + 2] - p[i] <= b) ? j0 + 1 : !(j0 + 3 <= i + n && p[j0 + 3] - p[i] <= b) ? j0 + 2 : !(j0 + 4 <= i + n && p[j0 + 4] - p[i] <= b) ? j0 + 3
                        : (Boolean) (j0 + 32 <= i + n && p[j0 + 32] - p[i] <= b) instanceof Boolean c32 && (Boolean) (j0 + 1024 <= i + n && p[j0 + 1024] - p[i] <= b) instanceof Boolean ck
                        && (Integer) Arrays.binarySearch(p, c32 ? (ck ? j0 + 1024 : j0 + 32) : j0 + 4, (c32 ? (ck ? i + n : Math.min(j0 + 1024, i + n)) : Math.min(j0 + 32, i + n)) + 1, p[i] + b) instanceof Integer r ? (r >= 0 ? r : -r - 2) : 0) >= 0).count() >= 0
                && new int[]{1 << 30, 0} instanceof int[] mn
                && (Integer) (int) IntStream.iterate(0, pos -> pos < n, pos -> nxt[pos]).filter(pos -> (nxt[pos] - pos < mn[0] && (mn[0] = nxt[pos] - pos) > 0 && (mn[1] = pos) >= 0) || true).count() instanceof Integer g
                ? String.valueOf(g == 1 ? 1
                    : (mn[0] < g
                        ? IntStream.rangeClosed(0, mn[0]).anyMatch(i -> IntStream.of((mn[1] + i) % n).anyMatch(x -> IntStream.range(0, g - 1).reduce(x, (pos, k) -> pos >= x + n ? pos : pos < n ? nxt[pos] : nxt[pos - n] + n) >= x + n))
                        : new int[mn[0] + 1] instanceof int[] cur && IntStream.rangeClosed(0, mn[0]).allMatch(i -> (cur[i] = (mn[1] + i) % n) >= 0)
                            && (IntStream.range(0, g - 1).allMatch(k -> IntStream.rangeClosed(0, mn[0]).filter(i -> (cur[i] = cur[i] >= (mn[1] + i) % n + n ? cur[i] : cur[i] < n ? nxt[cur[i]] : nxt[cur[i] - n] + n) >= 0).count() >= 0) || true)
                            && IntStream.rangeClosed(0, mn[0]).anyMatch(i -> cur[i] >= (mn[1] + i) % n + n))
                        ? g - 1 : g)
                : "").collect(Collectors.joining("\n")) : "");
    }
}
