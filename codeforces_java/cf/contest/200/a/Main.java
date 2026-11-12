
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(new String(System.in.readAllBytes())).ifPresent(data -> new Thread(null, () -> System.out.println(new StringTokenizer(data) instanceof StringTokenizer tk
            && (Long) (long) Integer.parseInt(tk.nextToken()) instanceof Long n && (Long) (long) Integer.parseInt(tk.nextToken()) instanceof Long m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && (Long) (m + 2) instanceof Long w
            && (Integer) (32 - Integer.numberOfLeadingZeros(4 * k - 1)) instanceof Integer bits
            && (Integer) ((8 << bits) - 1) instanceof Integer mask
            && (Integer) (64 - bits) instanceof Integer sh
            && new int[8 << bits] instanceof int[] R
            && (Boolean) (n > m) instanceof Boolean tr
            && (Long) (tr ? w : 1L) instanceof Long lstep
            && new long[]{w - 1, w + 1, -lstep, lstep} instanceof long[] ST
            && (Long) (tr ? m : n) instanceof Long nl
            && (Long) (tr ? n : m) instanceof Long np
            && new long[2] instanceof long[] q && new long[3] instanceof long[] tl && new long[2] instanceof long[] sc
            && new LongBinaryOperator[4] instanceof LongBinaryOperator[] fn
            && (fn[0] = (key, h) -> R[(int) h] == (int) key && R[(int) h + 1] == (int) (key >>> 32) || R[(int) h] == 0 && R[(int) h + 1] == 0 ? h : fn[0].applyAsLong(key, (h + 8) & mask)) != null
            && (Object) (LongUnaryOperator) (key -> fn[0].applyAsLong(key, ((key * 0x9E3779B97F4A7C15L) >>> sh) << 3)) instanceof LongUnaryOperator SL
            && (fn[1] = (ps, key) -> R[(int) (ps >> 2)] == (int) key && R[(int) (ps >> 2) + 1] == (int) (key >>> 32) && R[(int) (ps >> 2) + 2 + (int) (ps & 3)] != 0
                && (R[(int) (ps >> 2) + 2 + (int) (ps & 3)] = (int) ((fn[2].applyAsLong(ps & 3, key + R[(int) (ps >> 2) + 2 + (int) (ps & 3)] * ST[(int) (ps & 3)]) - key) / ST[(int) (ps & 3)])) != 0
                ? key + (long) R[(int) (ps >> 2) + 2 + (int) (ps & 3)] * ST[(int) (ps & 3)] : key) != null
            && (fn[2] = (ty, key) -> fn[1].applyAsLong((SL.applyAsLong(key) << 2) | ty, key)) != null
            && (Object) (LongToIntFunction) (key -> (Integer) (int) SL.applyAsLong(key) instanceof Integer ls && R[ls] == (int) key && R[ls + 1] == (int) (key >>> 32) ? R[ls + 6] : 0) instanceof LongToIntFunction lbf
            && (fn[3] = (sd, D) -> (tl[0] = sd == 0 ? Math.max(Math.max(-D, 1 - q[0]), q[1] - D - m) : sd == 1 ? Math.max(Math.max(-D, 1 - q[0]), 1 - q[1] - D) : sd == 2 ? Math.max(0, 1 - q[1] + D) : Math.max(0, q[1] + D - m))
                <= (tl[1] = sd == 0 ? Math.min(0, q[1] - D - 1) : sd == 1 ? Math.min(0, m - q[1] - D) : sd == 2 ? Math.min(Math.min(D, n - q[0]), m - q[1] + D) : Math.min(Math.min(D, n - q[0]), q[1] + D - 1))
                && (sc[0] = fn[2].applyAsLong(sd == 0 || sd == 3 ? 0 : 1, (q[0] + tl[0]) * w + (sd == 0 ? q[1] - D - tl[0] : sd == 1 ? q[1] + D + tl[0] : sd == 2 ? q[1] - D + tl[0] : q[1] + D - tl[0]))) / w <= q[0] + tl[1]
                ? ((sc[0] / w) << 17) | (sc[0] % w) : Long.MAX_VALUE) != null
            && (Object) (LongBinaryOperator) ((qq, dx) -> (tl[2] = (tr ? q[1] : q[0]) + ((qq & 1) == 0 ? -dx : dx)) >= 1 && tl[2] <= nl
                && (sc[0] = fn[2].applyAsLong(2 + (qq >> 1), tr ? q[0] * w + tl[2] : tl[2] * w + q[1])) >= 0
                && (tr ? sc[0] / w : sc[0] % w) >= 1 && (tr ? sc[0] / w : sc[0] % w) <= np
                ? ((Math.abs(sc[0] / w - q[0]) + Math.abs(sc[0] % w - q[1])) << 34) | ((sc[0] / w) << 17) | (sc[0] % w) : Long.MAX_VALUE) instanceof LongBinaryOperator C2
            ? IntStream.range(0, k).mapToObj(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer b
                && (q[0] = a) > 0 && (q[1] = b) > 0
                && (Long) ((long) a * w + b) instanceof Long ix
                && (Integer) (int) SL.applyAsLong(ix) instanceof Integer s0
                && (Long) (!(R[s0] == (int) (long) ix && R[s0 + 1] == (int) (ix >>> 32) && R[s0 + 2] != 0) ? ((long) a << 17) | b
                    : (Integer) Math.max(1, Math.max(R[s0 + 6], lbf.applyAsInt(-(((long) (a >> 3)) * w + (b >> 3)) - 2) - 14)) instanceof Integer d0
                        && IntStream.range(d0, d0 + 32).mapToLong(D -> Math.min(Math.min(fn[3].applyAsLong(0, D), fn[3].applyAsLong(1, D)), Math.min(fn[3].applyAsLong(2, D), fn[3].applyAsLong(3, D))))
                            .filter(v -> v != Long.MAX_VALUE).findFirst() instanceof OptionalLong ro
                        && new long[]{Long.MAX_VALUE} instanceof long[] bst
                        && (ro.isPresent() || IntStream.range(0, (int) (nl + 1)).takeWhile(dx -> dx <= (bst[0] >> 34)).mapToLong(dx ->
                            bst[0] = Math.min(bst[0], Math.min(Math.min(C2.applyAsLong(0, dx), C2.applyAsLong(1, dx)), Math.min(C2.applyAsLong(2, dx), C2.applyAsLong(3, dx))))).count() >= 0)
                        ? (ro.isPresent() ? ro.getAsLong() : bst[0] & 17179869183L) : 0L) instanceof Long res
                && (Integer) (int) (res >> 17) instanceof Integer ra && (Integer) (int) (res & 131071) instanceof Integer ca
                && (Long) ((long) ra * w + ca) instanceof Long rix
                && (Integer) (int) SL.applyAsLong(rix) instanceof Integer s1
                && (R[s1] = (int) (long) rix) == (int) (long) rix && (R[s1 + 1] = (int) (rix >>> 32)) == (int) (rix >>> 32)
                && (R[s1 + 2] = 1) > 0 && (R[s1 + 3] = 1) > 0 && (R[s1 + 4] = 1) > 0 && (R[s1 + 5] = 1) > 0
                && (Integer) (Math.abs(ra - a) + Math.abs(ca - b)) instanceof Integer dist
                && (dist == 0 || ((Integer) (int) SL.applyAsLong(ix) instanceof Integer s2 && (R[s2 + 6] = Math.max(R[s2 + 6], dist)) > 0
                    && (Long) (-(((long) (a >> 3)) * w + (b >> 3)) - 2) instanceof Long bkk && (Integer) (int) SL.applyAsLong(bkk) instanceof Integer s3
                    && (R[s3] = (int) (long) bkk) == (int) (long) bkk && (R[s3 + 1] = (int) (bkk >>> 32)) == (int) (bkk >>> 32) && (R[s3 + 6] = Math.max(R[s3 + 6], dist)) > 0))
                ? ra + " " + ca : "").collect(Collectors.joining("\n")) : ""), "", 1 << 28).start());
    }
}



