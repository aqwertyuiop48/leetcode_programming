import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] a
            && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).map(c -> (c > 47 && c < 58 ? (st[1] = st[1] * 10 + c - 48) + (st[3] = 1) : c == 45 ? (st[2] = 1) : st[3] == 0 ? 0 : (a[st[0]++] = st[2] == 1 ? -st[1] : st[1]) + (st[1] = 0) + (st[2] = 0) + (st[3] = 0)) * 0).sum() == 0
            && (Integer) a[0] instanceof Integer n && (Integer) a[1] instanceof Integer k && (Integer) a[2 + 2 * n] instanceof Integer q
            && new int[n + q + 1] instanceof int[] iv && new int[n + q + 1] instanceof int[] iw && new int[n + q + 1] instanceof int[] is && new int[n + q + 1] instanceof int[] ie
            && new int[]{3 + 2 * n, 0, n} instanceof int[] sc
            && IntStream.range(0, n).filter(i -> (iv[i] = a[2 + 2 * i]) >= 0 && (iw[i] = a[3 + 2 * i]) > 0 && (ie[i] = -1) < 0).count() == n
            && IntStream.range(0, q).filter(i -> a[sc[0]] == 1
                ? (iv[sc[2]] = a[sc[0] + 1]) >= 0 && (iw[sc[2]] = a[sc[0] + 2]) > 0 && (is[sc[2]] = sc[1]) >= 0 && (ie[sc[2]++] = -1) < 0 && (sc[0] += 3) > 0
                : a[sc[0]] == 2 ? (ie[a[sc[0] + 1] - 1] = sc[1]) >= 0 && (sc[0] += 2) > 0 : (sc[1]++) >= 0 && (sc[0] += 1) > 0).count() == q
            && (Integer) sc[1] instanceof Integer Q && (Integer) sc[2] instanceof Integer cnt
            && (Integer) (Q <= 1 ? 1 : Integer.highestOneBit(Q - 1) << 1) instanceof Integer P && (Integer) Integer.numberOfTrailingZeros(P) instanceof Integer L
            && new int[2 * P + 2] instanceof int[] head && new int[(n + q) * 32 + 10] instanceof int[] eV && new int[(n + q) * 32 + 10] instanceof int[] eW && new int[(n + q) * 32 + 10] instanceof int[] eN
            && new int[]{0, 0, 0, 0, 0} instanceof int[] s2
            && IntStream.range(0, 2 * P + 2).filter(i -> (head[i] = -1) < 0).count() > 0
            && (IntPredicate) (node -> (eV[s2[4]] = iv[s2[2]]) >= 0 && (eW[s2[4]] = iw[s2[2]]) > 0 && (eN[s2[4]] = head[node]) >= -1 && (head[node] = s2[4]++) >= 0) instanceof IntPredicate add
            && IntStream.range(0, cnt).filter(i -> (ie[i] < 0 ? Q : ie[i]) > is[i]
                && (s2[0] = is[i] + P) > 0 && (s2[1] = (ie[i] < 0 ? Q : ie[i]) + P) > 0 && (s2[2] = i) >= 0
                && IntStream.rangeClosed(0, L + 1).filter(z -> s2[0] >= s2[1] || (((s2[0] & 1) == 0 || add.test(s2[0]++)) && ((s2[1] & 1) == 0 || add.test(--s2[1])) && (s2[0] >>= 1) >= 0 && (s2[1] >>= 1) >= 0)).count() >= 0).count() >= 0
            && new int[L + 1][k + 8] instanceof int[][] dp && new int[k + 8] instanceof int[] zero && new int[1] instanceof int[] sink
            && (IntBinaryOperator) ((node, level) -> dp[level] instanceof int[] cur && (level == 0 ? zero : dp[level - 1]) instanceof int[] src
                && IntStream.of(0).peek(z -> System.arraycopy(src, 0, cur, 0, k + 8)).findFirst().isPresent()
                && IntStream.iterate(head[node], e -> e >= 0, e -> eN[e]).filter(e -> (Integer) eW[e] instanceof Integer w && (Integer) eV[e] instanceof Integer v
                    && (IntUnaryOperator) (j -> j >= w ? (cur[j] = Math.max(cur[j], cur[j - w] + v)) : 0) instanceof IntUnaryOperator cell
                    && IntStream.range(0, (k - w + 8) / 8).filter(u -> (sink[0] = cell.applyAsInt(k - 8 * u) + cell.applyAsInt(k - 8 * u - 1) + cell.applyAsInt(k - 8 * u - 2) + cell.applyAsInt(k - 8 * u - 3)
                        + cell.applyAsInt(k - 8 * u - 4) + cell.applyAsInt(k - 8 * u - 5) + cell.applyAsInt(k - 8 * u - 6) + cell.applyAsInt(k - 8 * u - 7)) < -1).count() >= 0).count() >= 0 ? 1 : 0) instanceof IntBinaryOperator build
            && new long[k + 8] instanceof long[] pw
            && (pw[0] = 1) == 1
            && IntStream.range(1, k + 8).filter(i -> (pw[i] = pw[i - 1] * 10000019L % 1000000007L) >= 0).count() >= 0
            && new long[Q + 1] instanceof long[] ans
            && IntStream.range(0, Q).filter(t -> (Integer) (t == 0 ? L : Integer.numberOfTrailingZeros(t)) instanceof Integer d0
                && IntStream.rangeClosed(0, d0).filter(z -> build.applyAsInt((P + t) >> (d0 - z), L - (d0 - z)) < 0).count() == 0
                && dp[L] instanceof int[] fin && (ans[t] = IntStream.range(0, (k + 3) / 4).mapToLong(u -> (fin[4 * u + 1] * pw[4 * u] + fin[4 * u + 2] * pw[4 * u + 1] + fin[4 * u + 3] * pw[4 * u + 2] + fin[4 * u + 4] * pw[4 * u + 3]) % 1000000007L).sum() % 1000000007L) >= 0).count() == Q
            ? LongStream.range(0, Q).mapToObj(t -> String.valueOf(ans[(int) t])).collect(Collectors.joining("\n")) : "");
    }
}
