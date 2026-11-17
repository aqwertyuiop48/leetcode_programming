import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer n && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer b
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] A
            && new int[n + 2] instanceof int[] R && new int[n + 2] instanceof int[] pe && new int[n + 2] instanceof int[] JR && new int[n + 2] instanceof int[] SP && new int[n + 2] instanceof int[] LO
            && IntStream.range(0, n).map(i -> n - 1 - i).filter(i -> (R[i] = R[i + 1] + A[i] / 2) < 0).count() == 0
            && IntStream.range(0, n).filter(i -> (pe[i + 1] = pe[i] + A[i] / 10) < 0 | (SP[i + 1] = SP[i] + A[i] / 2) < 0).count() == 0
            && IntStream.rangeClosed(0, n).filter(i -> (JR[i] = (int) Math.min((long) R[i], (long) b + pe[i])) < 0 | (LO[i] = Math.min(JR[i], Math.max(0, b - SP[i]))) < 0).count() == 0
            && new long[n + 1][] instanceof long[][] bits && new int[n + 1][] instanceof int[][] cum && new int[n + 1] instanceof int[] g0 && new int[1][] instanceof int[][] hold
            && (bits[n] = new long[1]) != null && (cum[n] = new int[2]) != null && (hold[0] = new int[]{0}) != null && new int[1] instanceof int[] tmp
            && IntStream.range(0, n).map(t -> n - 1 - t).allMatch(i -> Integer.valueOf(A[i]) instanceof Integer a && Integer.valueOf(a / 2) instanceof Integer cap && Integer.valueOf(a % 10) instanceof Integer s
                && Integer.valueOf(JR[i]) instanceof Integer jr && Integer.valueOf(JR[i + 1]) instanceof Integer jn && Integer.valueOf(LO[i]) instanceof Integer lo && Integer.valueOf(LO[i + 1]) instanceof Integer ln
                && hold[0] instanceof int[] prev && new int[jr - lo + 1] instanceof int[] cur && (bits[i] = new long[((jr - lo + 1) >> 6) + 1]) != null && (cum[i] = new int[bits[i].length + 1]) != null
                && (a < 50 ? Stream.of(0).peek(z -> Arrays.setAll(cur, jj -> (tmp[0] = Math.min(a - Math.min(jj + lo, cap) + prev[Math.min(jj + lo - Math.min(jj + lo, cap) + (a - Math.min(jj + lo, cap)) / 10, jn) - ln],
                        Math.min(a >= 10 && s <= Math.min(jj + lo, cap) ? a - s + prev[Math.min(jj + lo - s + (a - s) / 10, jn) - ln] : 1 << 29,
                            Math.min(a >= 10 && s + 10 <= Math.min(jj + lo, cap) ? a - s - 10 + prev[Math.min(jj + lo - s - 10 + (a - s - 10) / 10, jn) - ln] : 1 << 29,
                                a >= 10 && s + 20 <= Math.min(jj + lo, cap) ? a - s - 20 + prev[Math.min(jj + lo - s - 20 + (a - s - 20) / 10, jn) - ln] : 1 << 29)))) + 0 * (jj > 0 && cur[jj - 1] != tmp[0] ? (int) ((bits[i][(jj - 1) >> 6] |= 1L << (jj - 1)) >>> 63) : 0))).findFirst().isPresent()
                    : Stream.of(0).peek(z -> Arrays.setAll(cur, jj -> a - Math.min(jj + lo, cap) + prev[Math.min(jj + lo - Math.min(jj + lo, cap) + (a - Math.min(jj + lo, cap)) / 10, jn) - ln])).findFirst().isPresent()
                    && IntStream.iterate(s, x -> x <= cap, x -> x + 10).allMatch(x -> Stream.of(0).peek(z -> Arrays.setAll(cur, jj -> jj + lo < x ? cur[jj] : Math.min(cur[jj], a - x + prev[Math.min(jj + lo - x + (a - x) / 10, jn) - ln]))).findFirst().isPresent())
                    && Stream.of(0).peek(z -> Arrays.setAll(cur, jj -> cur[jj] + 0 * (jj > 0 && cur[jj - 1] != cur[jj] ? (int) ((bits[i][(jj - 1) >> 6] |= 1L << (jj - 1)) >>> 63) : 0))).findFirst().isPresent())
                && (g0[i] = cur[0]) >= 0 && IntStream.range(0, bits[i].length).filter(w -> (cum[i][w + 1] = cum[i][w] + Long.bitCount(bits[i][w])) < 0).count() == 0 && (hold[0] = cur) != null)
            && ((IntBinaryOperator) ((row, idx) -> g0[row] - (cum[row][(idx - LO[row]) >> 6] + Long.bitCount(bits[row][(idx - LO[row]) >> 6] & ((1L << ((idx - LO[row]) & 63)) - 1))))) instanceof IntBinaryOperator gv
            && new int[]{b} instanceof int[] st && new StringBuilder() instanceof StringBuilder sb && new long[]{0} instanceof long[] tot
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(A[i]) instanceof Integer a && Integer.valueOf(Math.min(st[0], a / 2)) instanceof Integer xm && Integer.valueOf(JR[i + 1]) instanceof Integer jn
                && IntStream.concat(IntStream.of(xm), a >= 10 ? IntStream.iterate(a % 10, x -> x <= xm, x -> x + 10) : IntStream.empty()).boxed()
                    .min(Comparator.comparingInt(x -> a - x + gv.applyAsInt(i + 1, Math.min(st[0] - x + (a - x) / 10, jn)))).get() instanceof Integer bx
                && (st[0] += (a - bx) / 10 - bx) > Integer.MIN_VALUE && (tot[0] += a - bx) >= 0 && sb.append(bx).append(' ') != null)
            ? tot[0] + "\n" + sb.toString().trim() : "");
    }
}
