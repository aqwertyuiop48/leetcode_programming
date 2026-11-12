import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer q
            && Integer.valueOf(Integer.highestOneBit(n + 1) * 2) instanceof Integer N && Integer.valueOf(Integer.numberOfTrailingZeros(N)) instanceof Integer LOG
            && new int[2 * N][] instanceof int[][] t && new int[32] instanceof int[] EMPTY && new int[n + 3] instanceof int[] bit && new int[n + 3] instanceof int[] bb && new int[2] instanceof int[] s
            && new int[32] instanceof int[] sc && new int[32] instanceof int[] gb && new int[][]{gb, EMPTY} instanceof int[][] cur && new IntUnaryOperator[2] instanceof IntUnaryOperator[] f
            && Stream.of(0).peek(z -> Arrays.fill(t, EMPTY)).findFirst().isPresent()
            && (f[0] = x -> x == 0 ? 0 : cur[0][31 - Integer.numberOfLeadingZeros(x)] == 0
                ? ((cur[0][31 - Integer.numberOfLeadingZeros(x)] = x) > 0 & ++cur[0][31] > 0 ? 1 : 0)
                : f[0].applyAsInt(x ^ cur[0][31 - Integer.numberOfLeadingZeros(x)])) != null
            && new int[]{n + 2, 2 + n, 0} instanceof int[] gp
            && IntStream.range(0, n).filter(i -> f[0].applyAsInt(tok[2 + i]) >= 0).count() >= 0
            && IntStream.range(0, q).filter(qi -> tok[gp[1]] == 1 ? f[0].applyAsInt(tok[gp[1] + 3]) >= 0 & (gp[1] += 4) > 0 : (gp[1] += 3) > 0).count() >= 0
            && Integer.valueOf(gb[31]) instanceof Integer G
            && (f[1] = j -> j >= 30 || cur[0][31] >= G ? 0 : (cur[1][j] != 0 ? f[0].applyAsInt(cur[1][j]) : 0) + f[1].applyAsInt(j + 1)) != null
            && ((IntPredicate) (i -> Integer.valueOf(t[2 * i + 1][31] > t[2 * i][31] ? 2 * i + 1 : 2 * i) instanceof Integer src && Integer.valueOf(4 * i + 1 - src) instanceof Integer oth
                && (t[src][31] >= G || t[oth][31] == 0 ? (t[i] = t[src]) != null
                    : (t[i] = t[src].clone()) != null && (cur[0] = t[i]) != null && (cur[1] = t[oth]) != null && f[1].applyAsInt(0) >= 0))) instanceof IntPredicate pull
            && ((IntBinaryOperator) (p, v) -> v == 0 ? ((t[N + p] = EMPTY) != null ? 0 : 0)
                : new int[32] instanceof int[] lf && (lf[31 - Integer.numberOfLeadingZeros(v)] = v) > 0 & (lf[31] = 1) > 0 && (t[N + p] = lf) != null ? 0 : 0) instanceof IntBinaryOperator setLeaf
            && ((IntBinaryOperator) (p, x) -> IntStream.iterate(p, i -> i <= n + 1, i -> i + (i & -i)).filter(i -> (bit[i] ^= x) < 0).count() > 0 ? 0 : 0) instanceof IntBinaryOperator bitUpd
            && ((IntBinaryOperator) (p, x) -> (bb[p] ^= x) >= 0 & bitUpd.applyAsInt(p, x) >= 0 & setLeaf.applyAsInt(p, bb[p]) >= 0
                & IntStream.rangeClosed(1, LOG).filter(k -> pull.test((N + p) >> k)).count() >= 0 ? 0 : 0) instanceof IntBinaryOperator upd
            && IntStream.rangeClosed(1, n).filter(i -> (bb[i] = tok[1 + i] ^ (i > 1 ? tok[i] : 0)) >= 0 & bitUpd.applyAsInt(i, bb[i]) >= 0 & setLeaf.applyAsInt(i, bb[i]) >= 0).count() >= 0
            && IntStream.iterate(N - 1, i -> i >= 1, i -> i - 1).filter(i -> pull.test(i)).count() >= 0
            && new StringBuilder() instanceof StringBuilder sb && new int[]{2 + n} instanceof int[] ptr
            && IntStream.range(0, q).filter(qi -> tok[ptr[0]] == 1
                ? (upd.applyAsInt(tok[ptr[0] + 1], tok[ptr[0] + 3]) >= 0 & upd.applyAsInt(tok[ptr[0] + 2] + 1, tok[ptr[0] + 3]) >= 0 & (ptr[0] += 4) > 0)
                : (Stream.of(0).peek(z -> Arrays.fill(sc, 0)).findFirst().isPresent() && (cur[0] = sc) != null
                    & f[0].applyAsInt(IntStream.iterate(tok[ptr[0] + 1], i -> i > 0, i -> i - (i & -i)).map(i -> bit[i]).reduce(0, (x, y) -> x ^ y)) >= 0
                    & (s[0] = tok[ptr[0] + 1] + 1 + N) > 0 & (s[1] = tok[ptr[0] + 2] + 1 + N) > 0
                    & (IntStream.rangeClosed(0, LOG + 1).allMatch(k -> s[0] >= s[1] ? false
                        : ((s[0] & 1) == 0 || (cur[1] = t[s[0]]) != null && f[1].applyAsInt(0) >= 0 && ++s[0] > 0)
                        && ((s[1] & 1) == 0 || (cur[1] = t[s[1] - 1]) != null && f[1].applyAsInt(0) >= 0 && --s[1] > 0)
                        && (s[0] >>= 1) >= 0 && (s[1] >>= 1) >= 0) | true)
                    & sb.append(1 << sc[31]).append('\n') != null & (ptr[0] += 3) > 0)).count() >= 0
            ? sb.toString().stripTrailing() : "");
    }
}
