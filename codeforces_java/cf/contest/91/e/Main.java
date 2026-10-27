import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) tk[0] instanceof Integer n
            && (Integer) tk[1] instanceof Integer q
            && IntStream.range(0, n).mapToLong(i -> tk[2 + 2 * i]).toArray() instanceof long[] a
            && IntStream.range(0, n).mapToLong(i -> tk[3 + 2 * i]).toArray() instanceof long[] b
            && IntStream.range(0, n).mapToLong(i -> (a[i] << 17) | i).sorted().map(v -> v & 131071).toArray() instanceof long[] byA
            && new int[n] instanceof int[] rk
            && IntStream.range(0, n).allMatch(p -> (rk[(int) byA[p]] = p) >= 0)
            && IntStream.range(0, n).mapToLong(i -> (b[i] << 17) | rk[i]).sorted().map(v -> byA[(int) (v & 131071)]).toArray() instanceof long[] g
            && new int[18 * n] instanceof int[] hs
            && new int[18 * n] instanceof int[] hl
            && new int[18 * n] instanceof int[] ptr
            && new int[4] instanceof int[] cb
            && ((IntPredicate) z ->
                hs[cb[0]] >= 1
                && (cb[2] = hl[cb[0] + hs[cb[0]] - 1]) >= 0
                && (b[cb[2]] == b[cb[1]] || (hs[cb[0]] >= 2 && (cb[3] = hl[cb[0] + hs[cb[0]] - 2]) >= 0
                    && (a[cb[3]] - a[cb[1]]) * (b[cb[2]] - b[cb[3]]) < (a[cb[3]] - a[cb[2]]) * (b[cb[1]] - b[cb[3]])))
                && --hs[cb[0]] >= 0) instanceof IntPredicate popper
            && IntStream.range(0, 18).allMatch(k -> LongStream.of(g).allMatch(gi ->
                (cb[1] = (int) gi) >= 0
                && (cb[0] = k * n + ((cb[1] >> k) << k)) >= 0
                && (!popper.test(0) || IntStream.range(0, 1 << 17).allMatch(popper) || true)
                && (hl[cb[0] + hs[cb[0]]] = cb[1]) >= 0
                && ++hs[cb[0]] > 0))
            && new long[2] instanceof long[] cur
            && new int[2] instanceof int[] win
            && ((IntPredicate) z ->
                ptr[cb[0]] + 1 < hs[cb[0]]
                && a[hl[cb[0] + ptr[cb[0]] + 1]] + b[hl[cb[0] + ptr[cb[0]] + 1]] * cur[0] >= a[hl[cb[0] + ptr[cb[0]]]] + b[hl[cb[0] + ptr[cb[0]]]] * cur[0]
                && ++ptr[cb[0]] > 0) instanceof IntPredicate mover
            && ((IntBinaryOperator) (k, bi) ->
                (cb[0] = k * n + (bi << k)) >= 0
                && (!mover.test(0) || IntStream.range(0, 1 << 17).allMatch(mover) || true)
                && (cb[1] = hl[cb[0] + ptr[cb[0]]]) >= 0
                && (Long) (a[cb[1]] + b[cb[1]] * cur[0]) instanceof Long v0
                && (cur[1] < 0 || v0 > a[(int) cur[1]] + b[(int) cur[1]] * cur[0]
                    || v0 == a[(int) cur[1]] + b[(int) cur[1]] * cur[0] && (b[cb[1]] > b[(int) cur[1]] || b[cb[1]] == b[(int) cur[1]] && cb[1] > cur[1])
                    ? (cur[1] = cb[1]) >= 0 : true)
                ? 0 : 0) instanceof IntBinaryOperator vis
            && new int[q] instanceof int[] res
            && IntStream.range(0, q).mapToLong(j -> ((long) tk[4 + 2 * n + 3 * j] << 17) | j).sorted().toArray() instanceof long[] ord
            && LongStream.of(ord).allMatch(key ->
                (Integer) (int) (key & 131071) instanceof Integer j
                && (cur[0] = key >> 17) >= 0
                && (cur[1] = -1) < 0
                && (win[0] = tk[2 + 2 * n + 3 * j] - 1) >= 0
                && (win[1] = tk[3 + 2 * n + 3 * j]) > 0
                && IntStream.range(0, 18).allMatch(k ->
                    win[0] >= win[1]
                    || ((win[0] & 1) == 0 || vis.applyAsInt(k, win[0]++) >= 0)
                        && ((win[1] & 1) == 0 || vis.applyAsInt(k, --win[1]) >= 0)
                        && (win[0] >>= 1) >= 0 && (win[1] >>= 1) >= 0)
                && (res[j] = (int) cur[1] + 1) > 0)
            ? IntStream.of(res).mapToObj(String::valueOf).collect(Collectors.joining("\n"))
            : "");
    }
}

