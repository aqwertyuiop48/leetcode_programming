import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0, 0} instanceof int[] ps
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 & (ps[2] = 1) > 0
                : raw[i] == 45 ? (ps[3] = 1) > 0
                : ps[2] == 0 || (tok[ps[0]++] = ps[3] == 1 ? -ps[1] : ps[1]) > Integer.MIN_VALUE & (ps[1] = 0) == 0 & (ps[2] = 0) == 0 & (ps[3] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n
            && IntStream.range(0, 3).map(j -> (int) IntStream.range(0, n).filter(i -> tok[1 + 3 * i + j] != 0).count()).toArray() instanceof int[] cnt
            && IntStream.range(0, 3).map(j -> (int) IntStream.range(0, n).filter(i -> tok[1 + 3 * i + j] < 0).count()).toArray() instanceof int[] hk
            && ((IntUnaryOperator) k -> 2 * k > n ? 500 : 4 * k > n ? 1000 : 8 * k > n ? 1500 : 16 * k > n ? 2000 : 32 * k > n ? 2500 : 3000) instanceof IntUnaryOperator ts
            && ((IntBinaryOperator) (ij, s) -> tok[1 + ij] == 0 ? 0 : s / 250 * (250 - Math.abs(tok[1 + ij]))) instanceof IntBinaryOperator pts
            && IntStream.range(0, 18).map(z -> IntStream.rangeClosed(0, hk[z / 6]).filter(x -> ts.applyAsInt(cnt[z / 6] - x) == 500 * (z % 6 + 1)).max().orElse(-1)).toArray() instanceof int[] UT
            && IntStream.range(0, 216).filter(c -> UT[c / 36] >= 0 && UT[6 + (c / 6) % 6] >= 0 && UT[12 + c % 6] >= 0).toArray() instanceof int[] combos
            && new int[]{n} instanceof int[] best
            ? (IntStream.of(combos).anyMatch(c -> UT[c / 36] + UT[6 + (c / 6) % 6] + UT[12 + c % 6] >= 90) ? "1"
                : IntStream.of(combos).filter(c -> Integer.valueOf(UT[c / 36]) instanceof Integer U1 && Integer.valueOf(UT[6 + (c / 6) % 6]) instanceof Integer U2 && Integer.valueOf(UT[12 + c % 6]) instanceof Integer U3
                    && new int[]{500 * (c / 36 + 1), 500 * ((c / 6) % 6 + 1), 500 * (c % 6 + 1)} instanceof int[] sA
                    && Integer.valueOf((U1 + 1) * (U2 + 1) * (U3 + 1)) instanceof Integer S
                    && Integer.valueOf(pts.applyAsInt(0, sA[0]) + pts.applyAsInt(1, sA[1]) + pts.applyAsInt(2, sA[2]) + 100 * (U1 + U2 + U3)) instanceof Integer mine
                    && new int[S] instanceof int[] dp
                    && IntStream.range(0, S).map(idx -> idx / ((U2 + 1) * (U3 + 1))).toArray() instanceof int[] c1
                    && IntStream.range(0, S).map(idx -> idx / (U3 + 1) % (U2 + 1)).toArray() instanceof int[] c2
                    && IntStream.range(0, S).map(idx -> idx % (U3 + 1)).toArray() instanceof int[] c3
                    && new int[1] instanceof int[] ab
                    && IntStream.range(1, n).filter(i -> Integer.valueOf(pts.applyAsInt(3 * i, sA[0]) + pts.applyAsInt(3 * i + 1, sA[1]) + pts.applyAsInt(3 * i + 2, sA[2])) instanceof Integer tot && tot > mine
                        && ++ab[0] > 0
                        && Integer.valueOf((tok[1 + 3 * i] < 0 ? 1 : 0) | (tok[2 + 3 * i] < 0 ? 2 : 0) | (tok[3 + 3 * i] < 0 ? 4 : 0)) instanceof Integer hm
                        && IntStream.rangeClosed(1, 7).filter(m -> (m & ~hm) == 0
                            && ((m & 1) != 0 ? pts.applyAsInt(3 * i, sA[0]) : 0) + ((m & 2) != 0 ? pts.applyAsInt(3 * i + 1, sA[1]) : 0) + ((m & 4) != 0 ? pts.applyAsInt(3 * i + 2, sA[2]) : 0) >= tot - mine
                            && IntStream.range(0, 3).filter(b -> (m >> b & 1) == 1 && (m ^ (1 << b)) != 0
                                && ((((m ^ (1 << b)) & 1) != 0 ? pts.applyAsInt(3 * i, sA[0]) : 0) + (((m ^ (1 << b)) & 2) != 0 ? pts.applyAsInt(3 * i + 1, sA[1]) : 0) + (((m ^ (1 << b)) & 4) != 0 ? pts.applyAsInt(3 * i + 2, sA[2]) : 0)) >= tot - mine).count() == 0).toArray() instanceof int[] mk
                        && mk.length > 0
                        && ((IntBinaryOperator) (idx, k) -> k < mk.length && c1[idx] >= (mk[k] & 1) && c2[idx] >= (mk[k] >> 1 & 1) && c3[idx] >= (mk[k] >> 2 & 1)
                            ? dp[idx - (mk[k] & 1) * (U2 + 1) * (U3 + 1) - (mk[k] >> 1 & 1) * (U3 + 1) - (mk[k] >> 2 & 1)] + 1 : 0) instanceof IntBinaryOperator term
                        && IntStream.range(0, S).map(j -> S - 1 - j).filter(idx -> (dp[idx] = Math.max(dp[idx], Math.max(term.applyAsInt(idx, 0), Math.max(term.applyAsInt(idx, 1), term.applyAsInt(idx, 2))))) < 0).count() == 0).count() >= 0
                    && (best[0] = Math.min(best[0], 1 + ab[0] - dp[S - 1])) > 0).count() >= 0 ? String.valueOf(best[0]) : "")
            : "");
    }
}
