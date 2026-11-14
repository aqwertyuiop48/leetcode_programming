import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] bs && new long[bs.length / 2 + 4] instanceof long[] tk && new long[2] instanceof long[] cur
            && new int[]{0} instanceof int[] ti && new long[]{0} instanceof long[] cv
            && IntStream.range(0, bs.length + 1).filter(i -> i < bs.length && bs[i] >= 48 ? (cv[0] = cv[0] * 10 + bs[i] - 48) >= 0 && (cur[1] = 1) > 0 : cur[1] == 1 && (tk[ti[0]++] = cv[0]) >= 0 && (cv[0] = 0) == 0 && (cur[1] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tk[0]) instanceof Integer n && Integer.valueOf((int) tk[1]) instanceof Integer q
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, 2 * n - 1))) instanceof Integer N
            && new long[2 * N] instanceof long[] mn && new long[2 * N] instanceof long[] val && new long[2 * N] instanceof long[] lz && new int[2 * N] instanceof int[] same
            && new int[2] instanceof int[] ql && new long[1] instanceof long[] qx
            && ((LongUnaryOperator) v -> (v <= 130691232L ? (v <= 1764L ? (v <= 1 ? 1 - v : v <= 42 ? 42 - v : 1764L - v) : (v <= 74088L ? 74088L - v : v <= 3111696L ? 3111696L - v : 130691232L - v)) : (v <= 230539333248L ? (v <= 5489031744L ? 5489031744L - v : 230539333248L - v) : (v <= 9682651996416L ? 9682651996416L - v : v <= 406671383849472L ? 406671383849472L - v : v <= 17080198121677824L ? 17080198121677824L - v : 717368321110468608L - v))) + 0L) instanceof LongUnaryOperator dd
            && new int[2 * N] instanceof int[] LO && new int[2 * N] instanceof int[] HI && IntStream.range(1, 2 * N).filter(nd -> (LO[nd] = (nd - Integer.highestOneBit(nd)) * (N / Integer.highestOneBit(nd))) < 0 || (HI[nd] = LO[nd] + N / Integer.highestOneBit(nd) - 1) < 0).count() == 0
            && ((LongBinaryOperator) (c, v) -> (same[(int) c] = 1) > 0 && (val[(int) c] = v) > 0 && (mn[(int) c] = dd.applyAsLong(v)) >= 0 && (lz[(int) c] = 0) == 0 ? 0L : 0L) instanceof LongBinaryOperator setSame
            && ((LongBinaryOperator) (c, x) -> same[(int) c] == 1 ? (val[(int) c] += x) * 0 + (mn[(int) c] -= x) * 0 : (mn[(int) c] -= x) * 0 + (lz[(int) c] += x) * 0) instanceof LongBinaryOperator addTo
            && ((IntToLongFunction) nd -> same[nd] == 1 ? setSame.applyAsLong(2 * nd, val[nd]) + setSame.applyAsLong(2 * nd + 1, val[nd])
                : lz[nd] != 0 ? addTo.applyAsLong(2 * nd, lz[nd]) + addTo.applyAsLong(2 * nd + 1, lz[nd]) + (lz[nd] = 0) : 0L) instanceof IntToLongFunction push
            && ((IntToLongFunction) nd -> (mn[nd] = Math.min(mn[2 * nd], mn[2 * nd + 1])) * 0
                + (same[nd] = same[2 * nd] == 1 && same[2 * nd + 1] == 1 && val[2 * nd] == val[2 * nd + 1] ? 1 : 0) * 0
                + (same[nd] == 1 ? (val[nd] = val[2 * nd]) * 0 : 0L)) instanceof IntToLongFunction pull
            && new IntToLongFunction[3] instanceof IntToLongFunction[] F
            && IntStream.range(0, N).filter(i -> setSame.applyAsLong(N + i, i < n ? tk[2 + i] : 2) < 0).count() == 0
            && IntStream.range(1, N).map(i -> N - i).filter(nd -> pull.applyAsLong(nd) < 0).count() == 0
            && (F[0] = nd -> ql[1] < LO[nd] || HI[nd] < ql[0] ? 0L
                : ql[0] <= LO[nd] && HI[nd] <= ql[1] ? setSame.applyAsLong(nd, qx[0])
                : push.applyAsLong(nd) + F[0].applyAsLong(2 * nd) + F[0].applyAsLong(2 * nd + 1) + pull.applyAsLong(nd)) != null
            && (F[1] = nd -> ql[1] < LO[nd] || HI[nd] < ql[0] ? Long.MAX_VALUE
                : ql[0] <= LO[nd] && HI[nd] <= ql[1] && (same[nd] == 1 || mn[nd] - qx[0] >= 0)
                ? (same[nd] == 1 ? (val[nd] += qx[0]) * 0 + (mn[nd] = dd.applyAsLong(val[nd])) : addTo.applyAsLong(nd, qx[0]) * 0 + mn[nd])
                : push.applyAsLong(nd) * 0 + Math.min(F[1].applyAsLong(2 * nd), F[1].applyAsLong(2 * nd + 1)) + pull.applyAsLong(nd) * 0) != null
            && (F[2] = nd -> same[nd] == 1 ? val[nd]
                : push.applyAsLong(nd) * 0 + F[2].applyAsLong(ql[0] <= (LO[nd] + HI[nd]) / 2 ? 2 * nd : 2 * nd + 1)) != null
            && new int[]{n + 2} instanceof int[] ptr && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, q).filter(k -> Integer.valueOf(ptr[0]) instanceof Integer b
                && (tk[b] == 1
                    ? (ql[0] = (int) tk[b + 1] - 1) >= 0 && sb.append(F[2].applyAsLong(1)).append('\n') != null && (ptr[0] += 2) < 0
                    : (ql[0] = (int) tk[b + 1] - 1) >= 0 && (ql[1] = (int) tk[b + 2] - 1) >= 0 && (qx[0] = tk[b + 3]) > 0
                    && (tk[b] == 2
                        ? F[0].applyAsLong(1) != Long.MIN_VALUE && (ptr[0] += 4) < 0
                        : IntStream.generate(() -> 0).takeWhile(z -> F[1].applyAsLong(1) == 0).count() >= 0 && (ptr[0] += 4) < 0))).count() == 0
            ? sb.toString().trim() : "");
    }
}
