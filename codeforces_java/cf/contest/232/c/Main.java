import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 8] instanceof long[] t
            && new long[3] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((t[(int) ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) (int) t[0] instanceof Integer q && (Integer) (int) Math.min(t[1], 80) instanceof Integer N
            && new long[N + 2] instanceof long[] S && (S[0] = 1) == 1 && (S[1] = 2) == 2 && IntStream.rangeClosed(2, N).allMatch(k -> (S[k] = S[k - 1] + S[k - 2]) > 0)
            && new long[N + 2] instanceof long[] dd && (dd[1] = 1) == 1 && IntStream.rangeClosed(2, N).allMatch(k -> (dd[k] = 1 + dd[k - 2]) > 0)
            && ((LongBinaryOperator) (k, f) -> (Math.min(f >> 12, 2 + (f & 4095)) << 12) | (dd[(int) k - 2] + 1 + Math.min(f >> 12, f & 4095))) instanceof LongBinaryOperator AC
            && ((LongUnaryOperator) f -> (((f >> 12) + 1) << 12) | (f & 4095)) instanceof LongUnaryOperator BC
            && new LongBinaryOperator[2] instanceof LongBinaryOperator[] rec
            && (rec[0] = (k, w) -> k == 0 ? 0L : k == 1 ? (w == 1 ? 1L : 4096L)
                : w <= S[(int) k - 1] ? AC.applyAsLong(k, rec[0].applyAsLong(k - 1, w)) : BC.applyAsLong(rec[0].applyAsLong(k - 2, w - S[(int) k - 1]))) != null
            && new long[100] instanceof long[] qa && new long[100] instanceof long[] qb
            && (rec[1] = (k, d) -> (Long) qa[(int) d] instanceof Long a && (Long) qb[(int) d] instanceof Long b && (Long) S[(int) k - 1] instanceof Long s
                ? k == 1 ? 1L | (1L << 12) | (4096L << 36)
                    : b <= s
                        ? (qa[(int) d + 1] = a) >= 0 && (qb[(int) d + 1] = b) >= 0 && (Long) rec[1].applyAsLong(k - 1, d + 1) instanceof Long r
                            ? Math.min(r & 4095, Math.min((((r >> 12) & 16777215) >> 12) + 2 + ((r >> 36) & 4095), (((r >> 12) & 16777215) & 4095) + 2 + ((r >> 36) >> 12)))
                                | (AC.applyAsLong(k, (r >> 12) & 16777215) << 12) | (AC.applyAsLong(k, r >> 36) << 36) : 0L
                    : a > s
                        ? (qa[(int) d + 1] = a - s) > 0 && (qb[(int) d + 1] = b - s) > 0 && (Long) rec[1].applyAsLong(k - 2, d + 1) instanceof Long r2
                            ? (r2 & 4095) | (BC.applyAsLong((r2 >> 12) & 16777215) << 12) | (BC.applyAsLong(r2 >> 36) << 36) : 0L
                        : (Long) rec[0].applyAsLong(k - 1, a) instanceof Long fa && (Long) rec[0].applyAsLong(k - 2, b - s) instanceof Long fb
                            ? (Math.min(fa >> 12, fa & 4095) + 1 + (fb >> 12)) | (AC.applyAsLong(k, fa) << 12) | (BC.applyAsLong(fb) << 36) : 0L
                : 0L) != null
            ? IntStream.range(0, q).mapToObj(i -> (Long) Math.min(t[2 + 2 * i], t[3 + 2 * i]) instanceof Long a && (Long) Math.max(t[2 + 2 * i], t[3 + 2 * i]) instanceof Long b
                && (qa[0] = a) > 0 && (qb[0] = b) > 0 ? String.valueOf(rec[1].applyAsLong(N, 0) & 4095) : "").collect(Collectors.joining("\n")) : "");
    }
}
