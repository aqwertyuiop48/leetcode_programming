
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] buf && new int[buf.length / 2 + 3] instanceof int[] v && new int[3] instanceof int[] ps
            && IntStream.range(0, buf.length + 1).filter(i -> i < buf.length && buf[i] >= '0'
                ? (ps[0] = ps[0] * 10 + buf[i] - '0') >= 0 && (ps[1] = 1) == 1
                : ps[1] == 1 && (v[ps[2]++] = ps[0]) >= 0 && (ps[0] = 0) == 0 && (ps[1] = 0) == 0).count() >= 0
            && (Integer) v[0] instanceof Integer n && (Integer) v[1] instanceof Integer q && Arrays.copyOfRange(v, 2, 2 + n) instanceof int[] a
            && (Integer) 500000 instanceof Integer big && new int[big + 1] instanceof int[] spf && new int[big + 1] instanceof int[] nxt
            && IntStream.rangeClosed(2, 707).filter(p -> spf[p] == 0).allMatch(p -> IntStream.iterate(p, m -> m <= big, m -> m + p).filter(m -> spf[m] == 0).allMatch(m -> (spf[m] = p) > 0))
            && IntStream.rangeClosed(2, big).allMatch(i -> (spf[i] = spf[i] == 0 ? i : spf[i]) > 0 && (nxt[i] = i / spf[i] % spf[i] == 0 ? nxt[i / spf[i]] : i / spf[i]) >= 0)
            && (spf[1] = 1) == 1 && (nxt[1] = 1) == 1 && new int[big + 1] instanceof int[] cnt && new boolean[n] instanceof boolean[] on && new long[]{0} instanceof long[] ans && new int[6] instanceof int[] pr && new int[6] instanceof int[] x && new int[2] instanceof int[] cur
            && ((IntUnaryOperator) j -> ((j & 1) == 0 ? 1 : pr[0]) * ((j & 2) == 0 ? 1 : pr[1]) * ((j & 4) == 0 ? 1 : pr[2]) * ((j & 8) == 0 ? 1 : pr[3]) * ((j & 16) == 0 ? 1 : pr[4]) * ((j & 32) == 0 ? 1 : pr[5])) instanceof IntUnaryOperator dv
            ? IntStream.range(0, q).mapToObj(i -> (cur[0] = v[2 + n + i] - 1) >= 0
                && (pr[0] = spf[x[0] = a[cur[0]]]) > 0 && (pr[1] = spf[x[1] = nxt[x[0]]]) > 0 && (pr[2] = spf[x[2] = nxt[x[1]]]) > 0 && (pr[3] = spf[x[3] = nxt[x[2]]]) > 0 && (pr[4] = spf[x[4] = nxt[x[3]]]) > 0 && (pr[5] = spf[x[5] = nxt[x[4]]]) > 0
                && (cur[1] = 1 << ((x[0] > 1 ? 1 : 0) + (x[1] > 1 ? 1 : 0) + (x[2] > 1 ? 1 : 0) + (x[3] > 1 ? 1 : 0) + (x[4] > 1 ? 1 : 0) + (x[5] > 1 ? 1 : 0))) > 0
                && (on[cur[0]]
                    ? (ans[0] -= IntStream.range(0, cur[1]).mapToLong(j -> (1 - 2 * (Integer.bitCount(j) & 1)) * (long) --cnt[dv.applyAsInt(j)]).sum()) > Long.MIN_VALUE
                    : (ans[0] += IntStream.range(0, cur[1]).mapToLong(j -> (1 - 2 * (Integer.bitCount(j) & 1)) * (long) cnt[dv.applyAsInt(j)]++).sum()) > Long.MIN_VALUE)
                && (on[cur[0]] = !on[cur[0]]) | true ? String.valueOf(ans[0]) : "").collect(Collectors.joining("\n")) : "");
    }
}



