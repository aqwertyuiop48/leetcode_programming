import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] tk && new int[]{0, 0, 0} instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length ? raw[i] : 32) >= 48
                ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) > 0
                : ps[2] == 0 || ((tk[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0))
            && Integer.valueOf(tk[0]) instanceof Integer r && Integer.valueOf(tk[1]) instanceof Integer c
            && Integer.valueOf(tk[2]) instanceof Integer n && Integer.valueOf(tk[3]) instanceof Integer k
            && IntStream.range(0, n).mapToLong(i -> (long) tk[5 + 2 * i] << 20 | tk[4 + 2 * i]).sorted().toArray() instanceof long[] keys
            && new int[n + 2] instanceof int[] col && new int[n + 2] instanceof int[] row
            && IntStream.range(0, n).filter(i -> 0 * ((col[i + 1] = (int) (keys[i] >> 20)) + (row[i + 1] = (int) (keys[i] & 1048575))) != 0).count() == 0
            && (col[n + 1] = c + 1) > 0
            && IntStream.rangeClosed(1, n).mapToLong(id -> (long) row[id] << 20 | id).sorted().mapToInt(z -> (int) (z & 1048575)).toArray() instanceof int[] rs
            && new int[n + 2] instanceof int[] prv && new int[n + 2] instanceof int[] nxt && new int[n + 2] instanceof int[] kt && new int[n + 2] instanceof int[] w
            && new long[]{0, 0} instanceof long[] tot
            && (nxt[n + 1] = n + 1) + (kt[n + 1] = n + 1) > 0
            && ((IntBinaryOperator) ((p, j) -> j >= k ? p
                : (tot[0] += (long) w[p] * (col[kt[p]] - col[nxt[kt[p]]])) > Long.MIN_VALUE && (kt[p] = nxt[kt[p]]) >= 0 ? prv[p] : p)) instanceof IntBinaryOperator f
            ? (Object) IntStream.rangeClosed(1, r).mapToLong(x1 -> IntStream.rangeClosed(1, n).anyMatch(id -> row[id] == x1)
                && IntStream.rangeClosed(1, n).filter(id -> row[id] >= x1).toArray() instanceof int[] lv
                && IntStream.range(0, lv.length).filter(i -> 0 * ((prv[lv[i]] = i == 0 ? 0 : lv[i - 1]) + (nxt[lv[i]] = i == lv.length - 1 ? n + 1 : lv[i + 1])
                    + (kt[lv[i]] = i + k - 1 < lv.length ? lv[i + k - 1] : n + 1) + (w[lv[i]] = col[lv[i]] - col[prv[lv[i]]])) != 0).count() == 0
                && (tot[0] = IntStream.of(lv).mapToLong(id -> (long) w[id] * (c + 1 - col[kt[id]])).sum()) >= 0 && (tot[1] = 0) == 0
                && IntStream.range(0, lv.length).map(i -> n - 1 - i).allMatch(t -> Integer.valueOf(rs[t]) instanceof Integer q
                    && Integer.valueOf(nxt[q]) instanceof Integer sx && Integer.valueOf(prv[q]) instanceof Integer p0
                    && (tot[1] += t == n - 1 || row[rs[t + 1]] != row[q] ? tot[0] * ((t == n - 1 ? r + 1 : row[rs[t + 1]]) - row[q]) : 0L) >= 0
                    && (tot[0] += (long) (col[sx] - col[p0] - w[sx]) * (c + 1 - col[kt[sx]]) - (long) w[q] * (c + 1 - col[kt[q]])) > Long.MIN_VALUE
                    && (w[sx] = col[sx] - col[p0]) >= 0
                    && f.applyAsInt(f.applyAsInt(f.applyAsInt(f.applyAsInt(f.applyAsInt(f.applyAsInt(f.applyAsInt(f.applyAsInt(f.applyAsInt(p0, 1), 2), 3), 4), 5), 6), 7), 8), 9) >= 0
                    && (nxt[p0] = sx) + (prv[sx] = p0) >= 0)
                ? tot[1] * (x1 - IntStream.rangeClosed(1, n).filter(id -> row[id] < x1).map(id -> row[id]).max().orElse(0)) : 0L).sum() : "");
    }
}
