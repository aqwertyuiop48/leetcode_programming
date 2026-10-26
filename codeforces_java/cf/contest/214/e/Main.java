import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).map(j -> Integer.parseInt(tk.nextToken())).toArray()).toArray(int[][]::new) instanceof int[][] a
            && (Integer) (-1000000000) instanceof Integer neg && new int[2][n * n] instanceof int[][] buf
            && IntStream.range(0, 2).allMatch(b -> IntStream.range(0, n * n).allMatch(t -> (buf[b][t] = neg) < 0)) && (buf[0][0] = a[0][0]) == a[0][0]
            ? IntStream.rangeClosed(1, 2 * n - 2).allMatch(d -> buf[d & 1] instanceof int[] cur && buf[(d + 1) & 1] instanceof int[] prev
                && IntStream.range(0, n * n).allMatch(t -> (cur[t] = neg) < 0)
                && (Integer) Math.max(0, d - n + 1) instanceof Integer lo && (Integer) Math.min(n - 1, d) instanceof Integer hi
                && IntStream.rangeClosed(lo, hi).allMatch(i -> IntStream.rangeClosed(lo, hi).allMatch(j ->
                    (Integer) Math.max(Math.max(prev[i * n + j], i > 0 ? prev[(i - 1) * n + j] : neg), Math.max(j > 0 ? prev[i * n + j - 1] : neg, i > 0 && j > 0 ? prev[(i - 1) * n + j - 1] : neg)) instanceof Integer b
                    && (cur[i * n + j] = b < neg / 2 ? neg : b + a[i][d - i] + (i == j ? 0 : a[j][d - j])) <= Integer.MAX_VALUE)))
                ? buf[(2 * n - 2) & 1][n * n - 1] : 0 : "");
    }
}
