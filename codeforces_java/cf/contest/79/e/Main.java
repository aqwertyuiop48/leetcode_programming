import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] in
            && Long.valueOf(in[0]) instanceof Long n
            && Long.valueOf(in[1]) instanceof Long t
            && Long.valueOf(in[2]) instanceof Long a
            && Long.valueOf(in[3]) instanceof Long b
            && Long.valueOf(in[4] - 1) instanceof Long L
            && new long[]{a, a + L, a, a + L} instanceof long[] U
            && new long[]{b, b, b + L, b + L} instanceof long[] V
            && Long.valueOf(a + b + 2 * L) instanceof Long sX
            && new long[6] instanceof long[] cand
            && new long[6] instanceof long[] st
            && new long[8] instanceof long[] ex
            && ((LongBinaryOperator) (p, q) -> q < p ? 0 : (p + q) * (q - p + 1) / 2) instanceof LongBinaryOperator S
            && ((LongBinaryOperator) (c, pk) -> (pk >> 20) > (pk & 1048575) ? 0
                : (pk >> 20) >= c ? S.applyAsLong((pk >> 20) - c, (pk & 1048575) - c)
                : (pk & 1048575) <= c ? S.applyAsLong(c - (pk & 1048575), c - (pk >> 20))
                : S.applyAsLong(0, c - (pk >> 20)) + S.applyAsLong(1, (pk & 1048575) - c)) instanceof LongBinaryOperator A
            && ((IntToLongFunction) k -> cand[2 + k]
                + A.applyAsLong(U[k], (cand[0] + 1) << 20 | ex[0]) + (ex[0] - cand[0]) * Math.abs(V[k] - cand[1])
                + (ex[1] - cand[1]) * Math.abs(U[k] - ex[0]) + A.applyAsLong(V[k], (cand[1] + 1) << 20 | ex[1])) instanceof IntToLongFunction r
            && ((LongBinaryOperator) (k, s1) -> S.applyAsLong(s1 + 1, 2 * n) - (2 * n - s1) * (U[(int) k] + V[(int) k])) instanceof LongBinaryOperator tail
            && ((BooleanSupplier) () ->
                (ex[0] = cand[0] > a + L ? cand[0] : cand[1] > b + L ? Math.max(cand[0], a + L) : Math.max(cand[0], a)) > 0
                && (ex[1] = cand[0] > a + L ? Math.max(cand[1], b + L) : cand[1] > b + L ? cand[1] : Math.max(cand[1], b)) > 0
                && (cand[0] > a + L || cand[1] > b + L
                    ? r.applyAsLong(0) + tail.applyAsLong(0, ex[0] + ex[1]) <= t
                        && r.applyAsLong(1) + tail.applyAsLong(1, ex[0] + ex[1]) <= t
                        && r.applyAsLong(2) + tail.applyAsLong(2, ex[0] + ex[1]) <= t
                        && r.applyAsLong(3) + tail.applyAsLong(3, ex[0] + ex[1]) <= t
                    : r.applyAsLong(0) + tail.applyAsLong(0, ex[0] + ex[1]) <= t
                        && r.applyAsLong(3) + (sX - ex[0] - ex[1]) * sX - S.applyAsLong(ex[0] + ex[1] + 1, sX) + tail.applyAsLong(3, sX) <= t
                        && (ex[2] = a + L - ex[0]) >= 0
                        && (ex[3] = b + L - ex[1]) >= 0
                        && (ex[4] = ex[2] * (ex[1] - b) - ex[2] * (ex[0] - a + 1 + L) / 2 - ex[3] * (ex[3] - 1) / 2) > Long.MIN_VALUE
                        && Math.max(0, -Math.floorDiv(t - (r.applyAsLong(2) + tail.applyAsLong(2, sX) + (ex[2] + ex[3]) * L - ex[4]), 2))
                            <= Math.min(ex[2] * ex[3], Math.floorDiv(t - (r.applyAsLong(1) + tail.applyAsLong(1, sX) + (ex[2] + ex[3]) * L + ex[4]), 2)))) instanceof BooleanSupplier ok
            && (cand[0] = 1) > 0 && (cand[1] = 1) > 0 && (st[0] = 1) > 0 && (st[1] = 1) > 0
            && new byte[(int) (2 * n - 2)] instanceof byte[] out
            ? ok.getAsBoolean()
                ? IntStream.range(0, (int) (2 * n - 2)).filter(i ->
                    (cand[0] = st[0] + 1) > 0 && (cand[1] = st[1]) > 0
                    && (cand[2] = st[2] + Math.abs(U[0] - cand[0]) + Math.abs(V[0] - cand[1])) >= 0
                    && (cand[3] = st[3] + Math.abs(U[1] - cand[0]) + Math.abs(V[1] - cand[1])) >= 0
                    && (cand[4] = st[4] + Math.abs(U[2] - cand[0]) + Math.abs(V[2] - cand[1])) >= 0
                    && (cand[5] = st[5] + Math.abs(U[3] - cand[0]) + Math.abs(V[3] - cand[1])) >= 0
                    && Boolean.valueOf(st[0] < n && (st[1] == n || ok.getAsBoolean())) instanceof Boolean goR
                    && (out[i] = (byte) (goR ? 'R' : 'U')) > 0
                    && (goR || (cand[0] = st[0]) > 0 && (cand[1] = st[1] + 1) > 0
                        && (cand[2] = st[2] + Math.abs(U[0] - cand[0]) + Math.abs(V[0] - cand[1])) >= 0
                        && (cand[3] = st[3] + Math.abs(U[1] - cand[0]) + Math.abs(V[1] - cand[1])) >= 0
                        && (cand[4] = st[4] + Math.abs(U[2] - cand[0]) + Math.abs(V[2] - cand[1])) >= 0
                        && (cand[5] = st[5] + Math.abs(U[3] - cand[0]) + Math.abs(V[3] - cand[1])) >= 0)
                    && (st[0] = cand[0]) > 0 && (st[1] = cand[1]) > 0 && (st[2] = cand[2]) >= 0
                    && (st[3] = cand[3]) >= 0 && (st[4] = cand[4]) >= 0 && (st[5] = cand[5]) >= 0).count() >= 0
                    ? new String(out) : ""
                : "Impossible"
            : "");
    }
}
