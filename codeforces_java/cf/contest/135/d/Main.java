import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && Integer.valueOf(IntStream.range(0, raw.length).filter(i -> raw[i] == 10).findFirst().getAsInt()) instanceof Integer h
            && new String(raw, 0, h).trim().split("\\s+") instanceof String[] hd
            && Integer.valueOf(Integer.parseInt(hd[0])) instanceof Integer n
            && Integer.valueOf(Integer.parseInt(hd[1])) instanceof Integer m
            && Integer.valueOf(m + 2) instanceof Integer W
            && Integer.valueOf((n + 2) * W) instanceof Integer N
            && new boolean[N] instanceof boolean[] one
            && new int[1] instanceof int[] ci
            && IntStream.range(h + 1, raw.length).filter(i -> raw[i] == '0' || raw[i] == '1').allMatch(i ->
                (one[(ci[0] / m + 1) * W + ci[0] % m + 1] = raw[i] == '1') | ci[0]++ >= 0)
            && new int[N] instanceof int[] lab
            && new int[N] instanceof int[] stk
            && new int[N + 3] instanceof int[] sz
            && new int[2] instanceof int[] sp
            && ((IntPredicate) z -> z < 0 || z >= N || one[z] || lab[z] != 0
                || ((lab[z] = sp[1]) > 0 && (stk[sp[0]++] = z) >= 0)) instanceof IntPredicate push
            && IntStream.range(0, N).filter(p -> !one[p] && lab[p] == 0).allMatch(p ->
                (lab[p] = ++sp[1]) > 0
                && (stk[0] = p) == p
                && (sp[0] = 1) == 1
                && IntStream.iterate(0, x -> sp[0] > 0, x -> 0).allMatch(x ->
                    Integer.valueOf(stk[--sp[0]]) instanceof Integer q
                    && sz[sp[1]]++ >= 0
                    && (push.test(q - W - 1) & push.test(q - W) & push.test(q - W + 1) & push.test(q - 1)
                        & push.test(q + 1) & push.test(q + W - 1) & push.test(q + W) & push.test(q + W + 1))))
            && Integer.valueOf(sp[1]) instanceof Integer id
            && new int[id + 3] instanceof int[] cn
            && new int[N] instanceof int[] seen
            && ((IntBinaryOperator) (p, z) -> lab[z] < 2 || seen[lab[z]] == p + 1 || ((seen[lab[z]] = p + 1) > 0 && ++cn[lab[z]] > 0) ? 1 : 1) instanceof IntBinaryOperator r1
            && IntStream.range(0, N).filter(p -> one[p]).allMatch(p ->
                (r1.applyAsInt(p, p - W - 1) | r1.applyAsInt(p, p - W) | r1.applyAsInt(p, p - W + 1) | r1.applyAsInt(p, p - 1)
                    | r1.applyAsInt(p, p + 1) | r1.applyAsInt(p, p + W - 1) | r1.applyAsInt(p, p + W) | r1.applyAsInt(p, p + W + 1)) > 0)
            && new int[id + 3] instanceof int[] st
            && IntStream.rangeClosed(2, id).allMatch(g -> (st[g + 1] = st[g] + cn[g]) >= 0)
            && new int[st[id + 1]] instanceof int[] bk
            && st.clone() instanceof int[] fp
            && ((IntBinaryOperator) (p, z) -> lab[z] < 2 || seen[lab[z]] == -p - 1 || ((seen[lab[z]] = -p - 1) < 0 && (bk[fp[lab[z]]++] = p) >= 0) ? 1 : 1) instanceof IntBinaryOperator r2
            && IntStream.range(0, N).filter(p -> one[p]).allMatch(p ->
                (r2.applyAsInt(p, p - W - 1) | r2.applyAsInt(p, p - W) | r2.applyAsInt(p, p - W + 1) | r2.applyAsInt(p, p - 1)
                    | r2.applyAsInt(p, p + 1) | r2.applyAsInt(p, p + W - 1) | r2.applyAsInt(p, p + W) | r2.applyAsInt(p, p + W + 1)) > 0)
            && new int[N] instanceof int[] mk
            ? Math.max(
                IntStream.range(0, N - W - 1).anyMatch(p -> one[p] && one[p + 1] && one[p + W] && one[p + W + 1]) ? 4 : 0,
                IntStream.rangeClosed(2, id).map(g ->
                    Integer.valueOf(st[g]) instanceof Integer s
                    && Integer.valueOf(st[g + 1] - s) instanceof Integer L
                    && L >= 4
                    && IntStream.range(s, st[g + 1]).allMatch(i -> (mk[bk[i]] = g) > 0)
                    && IntStream.range(s, st[g + 1]).allMatch(i -> Integer.valueOf(bk[i]) instanceof Integer p
                        && (mk[p - 1] == g ? 1 : 0) + (mk[p + 1] == g ? 1 : 0) + (mk[p - W] == g ? 1 : 0) + (mk[p + W] == g ? 1 : 0) == 2)
                    && Integer.valueOf(bk[s]) instanceof Integer start
                    && new int[]{-1, start, 0} instanceof int[] tr
                    && new long[1] instanceof long[] ar
                    && IntStream.iterate(0, x -> tr[2] == 0 || (tr[1] != start && tr[2] <= L), x -> 0).allMatch(x ->
                        Integer.valueOf(tr[1]) instanceof Integer cu
                        && Integer.valueOf(mk[cu - 1] == g && cu - 1 != tr[0] ? cu - 1
                            : mk[cu + 1] == g && cu + 1 != tr[0] ? cu + 1
                            : mk[cu - W] == g && cu - W != tr[0] ? cu - W : cu + W) instanceof Integer nx
                        && (ar[0] += (long) (cu / W) * (nx % W) - (long) (nx / W) * (cu % W)) != Long.MIN_VALUE
                        && (tr[0] = cu) >= 0
                        && (tr[1] = nx) >= 0
                        && ++tr[2] > 0)
                    && tr[2] == L && tr[1] == start
                    && (Math.abs(ar[0]) - L) / 2 + 1 == sz[g]
                    ? L : 0).max().orElse(0))
            : 0);
    }


}

