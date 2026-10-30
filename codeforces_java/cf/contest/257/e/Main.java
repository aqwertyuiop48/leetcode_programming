import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 4] instanceof long[] vals && new long[3] instanceof long[] pr
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47)
                ? (pr[0] = pr[0] * 10 + raw[i] - 48) >= 0 && (pr[2] = 1) > 0
                : pr[2] == 0 || ((vals[(int) pr[1]++] = pr[0]) >= 0 && (pr[0] = 0) == 0 && (pr[2] = 0) == 0))
            && Integer.valueOf((int) vals[0]) instanceof Integer n && Integer.valueOf((int) vals[1]) instanceof Integer m
            && new int[n] instanceof int[] t && new int[n] instanceof int[] s && new int[n] instanceof int[] fi
            && IntStream.range(0, n).allMatch(i -> (t[i] = (int) vals[2 + 3 * i]) >= 0 && (s[i] = (int) vals[3 + 3 * i]) > 0 && (fi[i] = (int) vals[4 + 3 * i]) > 0)
            && IntStream.range(0, n).mapToLong(i -> (long) t[i] << 17 | i).sorted().map(x -> x & 131071).mapToInt(x -> (int) x).toArray() instanceof int[] ord
            && new int[m + 2] instanceof int[] bit && new int[m + 2] instanceof int[] cnt && new TreeSet<Integer>() instanceof TreeSet<Integer> fl
            && new int[m + 2] instanceof int[] wh && new int[m + 2] instanceof int[] ih && new int[n] instanceof int[] nxt
            && IntStream.range(0, m + 2).allMatch(i -> (wh[i] = -1) < 0 && (ih[i] = -1) < 0)
            && new long[n] instanceof long[] ans && new long[]{1, 0, 0, 0, 0, 0} instanceof long[] st
            && ((IntUnaryOperator) a -> (++cnt[a] != 1 || fl.add(a)) && (a > st[0] ? ++st[4] : a < st[0] ? ++st[5] : 0) >= 0 ? 0 : 1) instanceof IntUnaryOperator put
            && ((IntUnaryOperator) a -> --cnt[a] != 0 || fl.remove(a) ? 0 : 1) instanceof IntUnaryOperator del
            && IntStream.iterate(0, z -> st[3] == 0, z -> z + 1).allMatch(z -> Integer.valueOf((int) st[0]) instanceof Integer f
                && (st[2] >= n || t[ord[(int) st[2]]] > st[1]
                    || IntStream.iterate(0, y -> st[2] < n && t[ord[(int) st[2]]] <= st[1], y -> y + 1).allMatch(y -> Integer.valueOf(ord[(int) st[2]++]) instanceof Integer i
                        && (nxt[i] = wh[s[i]]) >= -1 && (wh[s[i]] = i) >= 0 && put.applyAsInt(s[i]) == 0))
                && (ih[f] < 0 || IntStream.iterate(ih[f], p -> p >= 0, p -> nxt[p]).toArray() instanceof int[] ps
                    && IntStream.of(ps).allMatch(p -> (ans[p] = st[1]) >= 0 && del.applyAsInt(f) == 0) && (ih[f] = -1) < 0)
                && (wh[f] < 0 || IntStream.iterate(wh[f], p -> p >= 0, p -> nxt[p]).toArray() instanceof int[] qs
                    && IntStream.of(qs).allMatch(p -> del.applyAsInt(f) == 0 && (nxt[p] = ih[fi[p]]) >= -1 && (ih[fi[p]] = p) >= 0 && put.applyAsInt(fi[p]) == 0) && (wh[f] = -1) < 0)
                && (st[4] + st[5] == 0
                    ? (st[2] < n ? (st[1] = t[ord[(int) st[2]]]) >= 0 : (st[3] = 1) > 0)
                    : Boolean.valueOf(st[4] >= st[5]) instanceof Boolean up
                        && Integer.valueOf(up ? fl.higher(f) - f : f - fl.lower(f)) instanceof Integer d
                        && Long.valueOf(Math.min(d, st[2] < n ? t[ord[(int) st[2]]] - st[1] : Long.MAX_VALUE)) instanceof Long k
                        && (st[0] += up ? k : -k) > 0 && (st[1] += k) > 0
                        && (up ? (st[4] -= cnt[(int) st[0]]) : (st[5] -= cnt[(int) st[0]])) >= 0))
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
