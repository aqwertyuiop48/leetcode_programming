import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] nm && new long[]{0, 0, 0, 1} instanceof long[] st
            && IntStream.range(0, raw.length + 1).allMatch(k -> (k < raw.length && raw[k] > 44 ? raw[k] == 45 ? (st[3] = -1) : (st[1] = st[1] * 10 + raw[k] - 48) + (st[2] = 1) : st[2] == 1 ? (nm[(int) st[0]++] = st[1] * st[3]) + (st[1] = 0) + (st[2] = 0) + (st[3] = 1) : 0) != Long.MIN_VALUE)
            && Integer.valueOf((int) nm[0]) instanceof Integer n && Integer.valueOf((int) nm[n + 1]) instanceof Integer m
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, n - 1) * 2 - 1)) instanceof Integer sz
            && IntStream.range(0, sz).mapToLong(i -> i < n - 1 ? nm[i + 2] - nm[i + 1] : 0).toArray() instanceof long[] bv
            && new int[2 * sz] instanceof int[] pref && new int[2 * sz] instanceof int[] suf && new int[2 * sz] instanceof int[] best
            && new int[2 * sz] instanceof int[] fs && new int[2 * sz] instanceof int[] ls && new int[2 * sz] instanceof int[] len
            && ((IntPredicate) i -> Boolean.valueOf(ls[2 * i] != 0 && fs[2 * i + 1] != 0 && ls[2 * i] >= fs[2 * i + 1]) instanceof Boolean ok
                && (len[i] = len[2 * i] + len[2 * i + 1]) > 0
                && (pref[i] = ok && pref[2 * i] == len[2 * i] ? len[2 * i] + pref[2 * i + 1] : pref[2 * i]) >= 0
                && (suf[i] = ok && suf[2 * i + 1] == len[2 * i + 1] ? len[2 * i + 1] + suf[2 * i] : suf[2 * i + 1]) >= 0
                && (best[i] = Math.max(Math.max(best[2 * i], best[2 * i + 1]), ok ? suf[2 * i] + pref[2 * i + 1] : 0)) >= 0
                && (fs[i] = fs[2 * i]) * 0 == 0 && (ls[i] = ls[2 * i + 1]) * 0 == 0) instanceof IntPredicate pull
            && IntStream.range(0, sz).allMatch(i -> (len[sz + i] = 1) == 1 && (pref[sz + i] = suf[sz + i] = best[sz + i] = bv[i] != 0 ? 1 : 0) >= 0 && (fs[sz + i] = ls[sz + i] = Long.signum(bv[i])) * 0 == 0)
            && IntStream.range(1, sz).map(i -> sz - i).allMatch(pull)
            && ((LongBinaryOperator) (pos, dl) -> (bv[(int) pos] += dl) * 0 == 0
                && (pref[sz + (int) pos] = suf[sz + (int) pos] = best[sz + (int) pos] = bv[(int) pos] != 0 ? 1 : 0) >= 0
                && (fs[sz + (int) pos] = ls[sz + (int) pos] = Long.signum(bv[(int) pos])) * 0 == 0
                && IntStream.iterate((sz + (int) pos) >> 1, i -> i >= 1, i -> i >> 1).allMatch(pull) ? 1 : 0) instanceof LongBinaryOperator upd
            ? IntStream.range(0, m).mapToObj(q -> Long.toString(0L * (nm[n + 2 + 3 * q] > 1 ? upd.applyAsLong(nm[n + 2 + 3 * q] - 2, nm[n + 4 + 3 * q]) : 0) + 0L * (nm[n + 3 + 3 * q] < n ? upd.applyAsLong(nm[n + 3 + 3 * q] - 1, -nm[n + 4 + 3 * q]) : 0) + best[1] + 1)).collect(Collectors.joining("\n")) : "");
    }
}
