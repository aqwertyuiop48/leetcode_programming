import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer u && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer r
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a0
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] b
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] k
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken()) - 1).toArray() instanceof int[] p
            && IntStream.rangeClosed(0, u).mapToObj(d -> d == 0 ? a0.clone() : new int[n]).toArray(int[][]::new) instanceof int[][] lv
            && new LongBinaryOperator[1] instanceof LongBinaryOperator[] f
            && new long[u + 2] instanceof long[] sm && (sm[0] = IntStream.range(0, n).mapToLong(i -> (long) a0[i] * k[i]).sum()) != Long.MIN_VALUE
            && (f[0] = (d, lx) -> Math.max((u - d) % 2 == 0 ? sm[(int) d] : Long.MIN_VALUE,
                d >= u ? Long.MIN_VALUE : Math.max(
                    (sm[(int) d + 1] = 0) == 0 && Stream.of(0).peek(z -> Arrays.setAll(lv[(int) d + 1], i -> lv[(int) d][p[i]] + r + (int) ((sm[(int) d + 1] += (long) (lv[(int) d][p[i]] + r) * k[i]) & 0L))).findFirst().isPresent() ? f[0].applyAsLong(d + 1, 0) : 0,
                    lx == 1 ? Long.MIN_VALUE : (sm[(int) d + 1] = 0) == 0 && Stream.of(0).peek(z -> Arrays.setAll(lv[(int) d + 1], i -> (lv[(int) d][i] ^ b[i]) + (int) ((sm[(int) d + 1] += (long) (lv[(int) d][i] ^ b[i]) * k[i]) & 0L))).findFirst().isPresent() ? f[0].applyAsLong(d + 1, 1) : 0))) != null
            ? f[0].applyAsLong(0, 0) : "");
    }
}
