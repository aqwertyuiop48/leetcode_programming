import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer b
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] A
            && new int[n + 2] instanceof int[] R && new int[n + 2] instanceof int[] pe && new int[n + 2] instanceof int[] JR
            && IntStream.range(0, n).map(i -> n - 1 - i).filter(i -> (R[i] = R[i + 1] + A[i] / 2) >= 0).count() >= 0
            && IntStream.range(0, n).filter(i -> (pe[i + 1] = pe[i] + A[i] / 10) >= 0).count() >= 0
            && IntStream.rangeClosed(0, n).filter(i -> (JR[i] = (int) Math.min((long) R[i], (long) b + pe[i])) >= 0).count() >= 0
            && new long[n + 1][] instanceof long[][] bits && new int[n + 1][] instanceof int[][] cum && new int[n + 1] instanceof int[] g0 && new int[1][] instanceof int[][] hold
            && ((BiPredicate<Integer, int[]>) ((i, row) -> Integer.valueOf(JR[i]) instanceof Integer jr && Integer.valueOf((jr >> 6) + 1) instanceof Integer words
                && (bits[i] = new long[words]) != null && (cum[i] = new int[words + 1]) != null && (g0[i] = row[0]) >= 0
                && IntStream.range(0, jr).filter(t -> row[t] != row[t + 1] && (bits[i][t >> 6] |= 1L << t) != 0).count() >= 0
                && IntStream.range(0, words).filter(w -> (cum[i][w + 1] = cum[i][w] + Long.bitCount(bits[i][w])) >= 0).count() >= 0)) instanceof BiPredicate<Integer, int[]> pack
            && pack.test(n, new int[]{0}) && (hold[0] = new int[]{0}) != null
            && IntStream.range(0, n).map(t -> n - 1 - t).allMatch(i -> Integer.valueOf(A[i]) instanceof Integer a && Integer.valueOf(a / 2) instanceof Integer cap && Integer.valueOf(a % 10) instanceof Integer s
                && Integer.valueOf(JR[i]) instanceof Integer jr && Integer.valueOf(JR[i + 1]) instanceof Integer jn && hold[0] instanceof int[] prev && new int[jr + 1] instanceof int[] cur
                && Stream.of(0).peek(z -> Arrays.fill(cur, 1 << 29)).findFirst().isPresent()
                && IntStream.rangeClosed(0, Math.min(cap, jr)).filter(j -> (cur[j] = Math.min(cur[j], a - j + prev[Math.min((a - j) / 10, jn)])) >= 0).count() >= 0
                && IntStream.rangeClosed(cap + 1, jr).filter(j -> (cur[j] = Math.min(cur[j], a - cap + prev[Math.min(j - cap + (a - cap) / 10, jn)])) >= 0).count() >= 0
                && (a < 10 || IntStream.iterate(s, x -> x <= cap, x -> x + 10).filter(x -> IntStream.rangeClosed(x, jr).filter(j -> (cur[j] = Math.min(cur[j], a - x + prev[Math.min(j - x + (a - x) / 10, jn)])) >= 0).count() >= 0).count() >= 0)
                && pack.test(i, cur) && (hold[0] = cur) != null)
            && ((IntBinaryOperator) ((row, idx) -> g0[row] - (cum[row][idx >> 6] + Long.bitCount(bits[row][idx >> 6] & ((1L << (idx & 63)) - 1))))) instanceof IntBinaryOperator gv
            && new int[]{b} instanceof int[] st && new StringBuilder() instanceof StringBuilder sb && new long[]{0} instanceof long[] tot
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(A[i]) instanceof Integer a && Integer.valueOf(Math.min(st[0], a / 2)) instanceof Integer xm && Integer.valueOf(JR[i + 1]) instanceof Integer jn
                && IntStream.concat(IntStream.of(xm), a >= 10 ? IntStream.iterate(a % 10, x -> x <= xm, x -> x + 10) : IntStream.empty()).boxed()
                    .min(Comparator.comparingInt(x -> a - x + gv.applyAsInt(i + 1, Math.min(st[0] - x + (a - x) / 10, jn)))).get() instanceof Integer bx
                && (st[0] += (a - bx) / 10 - bx) > Integer.MIN_VALUE && (tot[0] += a - bx) >= 0 && sb.append(bx).append(' ') != null)
            ? tot[0] + "\n" + sb.toString().trim() : "");
    }
}
