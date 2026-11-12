import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] tk && new int[4] instanceof int[] cur
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] >= 48 && raw[i] <= 57
                ? ((cur[0] = cur[0] * 10 + raw[i] - 48) < 0 | (cur[1] = 1) < 0)
                : i < raw.length && raw[i] == 45 ? (cur[2] = 1) < 0
                : cur[1] == 1 && ((tk[cur[3]++] = cur[2] == 1 ? -cur[0] : cur[0]) > 2000000000 | (cur[0] = 0) != 0 | (cur[1] = 0) != 0 | (cur[2] = 0) != 0)).count() == 0
            && Integer.valueOf(tk[0]) instanceof Integer q
            && new int[q] instanceof int[] typ && new int[q] instanceof int[] tp && new int[q] instanceof int[] qb && new int[]{1, 0} instanceof int[] st
            && IntStream.range(0, q).filter(i -> (tp[i] = st[0]) < 0 || (typ[i] = tk[st[0]]) < 0 || (qb[i] = st[1]) < 0
                || (st[1] += tk[st[0]] == 3 ? 1 : 0) < 0 || (st[0] += tk[st[0]] == 1 ? 3 : 2) < 0).count() == 0
            && Integer.valueOf(st[1]) instanceof Integer Q
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, Q) * 2 - 1)) instanceof Integer S
            && IntStream.range(0, q).map(i -> Q).toArray() instanceof int[] endq
            && IntStream.range(0, q).filter(j -> typ[j] == 2 && (endq[tk[tp[j] + 1] - 1] = qb[j]) < 0).count() == 0
            && IntStream.range(0, q).mapToLong(i -> typ[i] == 1 ? tk[tp[i] + 1] : 0).toArray() instanceof long[] LA
            && IntStream.range(0, q).mapToLong(i -> typ[i] == 1 ? tk[tp[i] + 2] : 0).toArray() instanceof long[] LB
            && IntStream.range(0, q).filter(i -> typ[i] == 1 && qb[i] < endq[i]).mapToLong(i -> ((LA[i] + 1000000000L) << 20) | i).sorted().toArray() instanceof long[] lk
            && new int[2 * S + 2] instanceof int[] cnt
            && ((IntBinaryOperator) (ln, pass) -> Integer.valueOf((int) (lk[ln] & 1048575)) instanceof Integer op
                && LongStream.iterate(((long) (qb[op] + S) << 32) | (endq[op] + S), s -> (s >> 32) < (s & 4294967295L), s -> ((((s >> 32) + (s >> 32 & 1)) >> 1) << 32) | ((s & 4294967295L) >> 1))
                    .filter(s -> ((s >> 32 & 1) == 1 ? cnt[(int) (s >> 32)]++ : 0) + ((s & 1) == 1 ? cnt[(int) (s & 4294967295L) - 1]++ : 0) < 0).count() == 0 ? 0 : 1) instanceof IntBinaryOperator walk0
            && IntStream.range(0, lk.length).filter(ln -> walk0.applyAsInt(ln, 0) != 0).count() == 0
            && new int[2 * S + 2] instanceof int[] off
            && IntStream.range(0, 2 * S + 1).filter(v -> (off[v + 1] = off[v] + cnt[v]) < 0).count() == 0
            && Arrays.copyOf(off, 2 * S + 2) instanceof int[] pos && new int[off[2 * S + 1]] instanceof int[] ids
            && IntStream.range(0, lk.length).filter(ln -> Integer.valueOf((int) (lk[ln] & 1048575)) instanceof Integer op
                && LongStream.iterate(((long) (qb[op] + S) << 32) | (endq[op] + S), s -> (s >> 32) < (s & 4294967295L), s -> ((((s >> 32) + (s >> 32 & 1)) >> 1) << 32) | ((s & 4294967295L) >> 1))
                    .filter(s -> ((s >> 32 & 1) == 1 ? (ids[pos[(int) (s >> 32)]++] = op) : 0) + ((s & 1) == 1 ? (ids[pos[(int) (s & 4294967295L) - 1]++] = op) : 0) < 0).count() > 0).count() == 0
            && new int[2 * S + 2] instanceof int[] len
            && ((IntBinaryOperator) (v, x) -> len[v] >= 2
                && (LB[ids[off[v] + len[v] - 2]] - LB[x]) * (LA[ids[off[v] + len[v] - 1]] - LA[ids[off[v] + len[v] - 2]]) <= (LB[ids[off[v] + len[v] - 2]] - LB[ids[off[v] + len[v] - 1]]) * (LA[x] - LA[ids[off[v] + len[v] - 2]]) ? 1 : 0) instanceof IntBinaryOperator bad
            && IntStream.range(1, 2 * S).parallel().allMatch(v -> off[v + 1] == off[v] || IntStream.range(off[v], off[v + 1]).filter(idx -> !(len[v] > 0 && LA[ids[off[v] + len[v] - 1]] == LA[ids[idx]] && LB[ids[off[v] + len[v] - 1]] >= LB[ids[idx]])
                && (len[v] > 0 && LA[ids[off[v] + len[v] - 1]] == LA[ids[idx]] ? len[v]-- > 0 : true)
                && (bad.applyAsInt(v, ids[idx]) == 1 ? IntStream.generate(() -> 0).takeWhile(z -> bad.applyAsInt(v, ids[idx]) == 1 && len[v]-- > 0).count() >= 0 : true)
                && (ids[off[v] + len[v]++] = ids[idx]) < 0).count() == 0)
            && IntStream.range(0, q).filter(i -> typ[i] == 3).mapToLong(i -> ((long) (tk[tp[i] + 1] + 1000000000L) << 20) | qb[i]).sorted().toArray() instanceof long[] qk
            && new int[2 * S + 2] instanceof int[] ptr && new long[Q + 1] instanceof long[] res && new int[Q + 1] instanceof int[] has
            && Arrays.stream(qk).allMatch(kq -> Long.valueOf((kq >> 20) - 1000000000L) instanceof Long x && Integer.valueOf((int) (kq & 1048575)) instanceof Integer qi
                && IntStream.iterate(S + qi, p -> p >= 1, p -> p >> 1).filter(p -> len[p] > 0
                    && (len[p] - ptr[p] > 1 && LA[ids[off[p] + ptr[p] + 1]] * x + LB[ids[off[p] + ptr[p] + 1]] >= LA[ids[off[p] + ptr[p]]] * x + LB[ids[off[p] + ptr[p]]]
                        ? IntStream.generate(() -> 0).takeWhile(z -> len[p] - ptr[p] > 1 && LA[ids[off[p] + ptr[p] + 1]] * x + LB[ids[off[p] + ptr[p] + 1]] >= LA[ids[off[p] + ptr[p]]] * x + LB[ids[off[p] + ptr[p]]] && ptr[p]++ >= 0).count() >= 0 : true)
                    && (has[qi] == 0 || LA[ids[off[p] + ptr[p]]] * x + LB[ids[off[p] + ptr[p]]] > res[qi])
                    && (res[qi] = LA[ids[off[p] + ptr[p]]] * x + LB[ids[off[p] + ptr[p]]]) != Long.MIN_VALUE && (has[qi] = 1) < 0).count() == 0)
            ? IntStream.range(0, Q).mapToObj(i -> has[i] == 0 ? "EMPTY SET" : String.valueOf(res[i])).collect(Collectors.joining("\n")) : "");
    }
}
