import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) tk[0] instanceof Integer n
            && (Integer) tk[1 + n] instanceof Integer m
            && new long[n + 1] instanceof long[] pre
            && new long[n + 1] instanceof long[] bb
            && IntStream.rangeClosed(1, n).allMatch(l ->
                (pre[l] = pre[l - 1] + tk[l]) >= 0 && (bb[l] = (long) l * tk[l] - pre[l]) > -9000000000000000000L)
            && new int[2 * n + 1] instanceof int[] cl
            && IntStream.range(n, 2 * n).allMatch(i -> (cl[i] = 1) > 0)
            && IntStream.iterate(n - 1, i -> i >= 1, i -> i - 1).allMatch(i -> (cl[i] = cl[2 * i] + cl[2 * i + 1]) > 0)
            && new int[2 * n + 2] instanceof int[] off
            && IntStream.rangeClosed(1, 2 * n).allMatch(i -> (off[i + 1] = off[i] + cl[i]) > 0)
            && new int[off[2 * n + 1] + 1] instanceof int[] hull
            && new int[2 * n + 1] instanceof int[] len
            && new int[2 * n + 1] instanceof int[] ptr
            && new IntBinaryOperator[2] instanceof IntBinaryOperator[] fn
            && (fn[0] = (v, l) ->
                len[v] >= 2
                && (bb[l] - bb[hull[off[v] + len[v] - 2]]) * (tk[hull[off[v] + len[v] - 2]] - tk[hull[off[v] + len[v] - 1]])
                    <= (bb[hull[off[v] + len[v] - 1]] - bb[hull[off[v] + len[v] - 2]]) * (tk[hull[off[v] + len[v] - 2]] - tk[l])
                    ? (--len[v] >= 0 ? fn[0].applyAsInt(v, l) : -1) : 0) != null
            && (fn[1] = (v, l) ->
                v < 1 ? 0
                : (len[v] >= 1 && tk[hull[off[v] + len[v] - 1]] == tk[l]) || (fn[0].applyAsInt(v, l) >= 0 && (hull[off[v] + len[v]++] = l) >= 0)
                    ? fn[1].applyAsInt(v >> 1, l) : -1) != null
            && IntStream.rangeClosed(1, n).boxed().sorted((x, y) -> tk[x] != tk[y] ? tk[y] - tk[x] : Long.compare(bb[x], bb[y])).mapToInt(x -> x).toArray() instanceof int[] sortedL
            && Arrays.stream(sortedL).allMatch(l -> fn[1].applyAsInt(n + l - 1, l) >= 0)
            && new long[2] instanceof long[] stt
            && new LongUnaryOperator[1] instanceof LongUnaryOperator[] adv
            && (adv[0] = v -> ptr[(int) v] + 1 < len[(int) v]
                && (long) tk[hull[off[(int) v] + ptr[(int) v] + 1]] * stt[0] + bb[hull[off[(int) v] + ptr[(int) v] + 1]]
                    <= (long) tk[hull[off[(int) v] + ptr[(int) v]]] * stt[0] + bb[hull[off[(int) v] + ptr[(int) v]]]
                    ? (++ptr[(int) v] > 0 ? adv[0].applyAsLong(v) : -1)
                    : (long) tk[hull[off[(int) v] + ptr[(int) v]]] * stt[0] + bb[hull[off[(int) v] + ptr[(int) v]]]) != null
            && (ps[0] = 2 + n) > 0
            && IntStream.range(0, m).boxed().sorted((p, q) -> (tk[ps[0] + 2 * p] - tk[ps[0] + 2 * p + 1]) - (tk[ps[0] + 2 * q] - tk[ps[0] + 2 * q + 1])).mapToInt(p -> p).toArray() instanceof int[] qo
            && new long[m] instanceof long[] ans
            && new int[2] instanceof int[] lr
            && Arrays.stream(qo).allMatch(qi ->
                (Integer) tk[ps[0] + 2 * qi] instanceof Integer x
                && (Integer) tk[ps[0] + 2 * qi + 1] instanceof Integer y
                && (stt[0] = x - y) <= 0
                && (stt[1] = Long.MAX_VALUE) > 0
                && (lr[0] = y - x + n) >= 0
                && (lr[1] = y + n) > 0
                && IntStream.iterate(0, z -> lr[0] < lr[1], z -> z + 1).allMatch(z ->
                    ((lr[0] & 1) == 0 || ((stt[1] = Math.min(stt[1], adv[0].applyAsLong(lr[0]++))) > -9000000000000000000L))
                    && ((lr[1] & 1) == 0 || ((stt[1] = Math.min(stt[1], adv[0].applyAsLong(--lr[1]))) > -9000000000000000000L))
                    && (lr[0] >>= 1) >= 0 && (lr[1] >>= 1) >= 0)
                && (ans[qi] = pre[y] + stt[1]) > -9000000000000000000L)
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
