import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer p
            && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : Integer.parseInt(tk.nextToken()) % p).toArray() instanceof int[] xm
            && IntStream.rangeClosed(0, m).map(i -> i == 0 ? 0 : Integer.parseInt(tk.nextToken()) % p).toArray() instanceof int[] ym
            && (Integer) ((m >> 6) + 1) instanceof Integer W && new long[Math.min(n, 10002) * W + 1] instanceof long[] bits && new int[][]{new int[m + 1], new int[m + 1]} instanceof int[][] bufs
            && new byte[Math.max(0, n + m - 2)] instanceof byte[] ans && new int[]{n, m, n + m - 2, 1, 0, 0} instanceof int[] sv
            && ((IntPredicate) z -> Arrays.stream(bufs[0]).map(v -> 0).toArray() instanceof int[] zero && Stream.of(0).peek(u -> System.arraycopy(zero, 0, bufs[0], 0, m + 1)).findFirst().isPresent()
                && IntStream.rangeClosed(1, sv[2] > 0 ? sv[0] : 0).allMatch(i -> (Integer) (sv[0] - i) instanceof Integer rr && (Integer) xm[i] instanceof Integer xi && bufs[(i - 1) & 1] instanceof int[] src && bufs[i & 1] instanceof int[] tgt
                    && Stream.of(0).peek(u -> Arrays.fill(bits, Math.min(rr, 10002) * W, Math.min(rr, 10002) * W + (rr < 10002 ? W : 0), 0L)).peek(u -> Arrays.setAll(tgt, j -> j == 0 ? 0
                        : Math.max(src[j], tgt[j - 1]) + (rr >= 10002 ? 0 : (int) ((bits[rr * W + (j >> 6)] |= (j < 2 || src[j] > tgt[j - 1] ? 1L : 0L) << j) & 0L)) + (xi + ym[j] >= p ? xi + ym[j] - p : xi + ym[j]))).findFirst().isPresent())
                && (sv[3] == 0 || ((sv[4] = bufs[sv[0] & 1][sv[1]]) >= 0 && (sv[3] = 0) == 0)) && (sv[5] = 0) == 0
                && IntStream.range(0, 40010).takeWhile(w -> sv[2] > 0 && sv[5] < 10002 && sv[5] < sv[0] && sv[0] - sv[5] + sv[1] > 1 && sv[1] > 0)
                    .allMatch(w -> (bits[sv[5] * W + (sv[1] >> 6)] >>> sv[1] & 1) != 0 ? ++sv[5] > 0 && (ans[--sv[2]] = 'C') > 0 : --sv[1] >= 0 && (ans[--sv[2]] = 'S') > 0)
                && (sv[0] -= sv[5]) >= 0) instanceof IntPredicate work
            && work.test(0) && work.test(0)
            ? sv[4] + "\n" + new String(ans) : "");
    }
}



