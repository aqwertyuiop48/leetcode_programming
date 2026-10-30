import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Boolean.valueOf(Boolean.valueOf(new java.io.File("input.txt").exists()) instanceof Boolean fl
            && (fl ? new java.io.FileInputStream("input.txt") : System.in) instanceof java.io.InputStream in
            && (fl ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt")) : System.out) instanceof java.io.PrintStream out
            && new Scanner(in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer a && Integer.valueOf(s.nextInt()) instanceof Integer b
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] h
            && Integer.valueOf(Arrays.stream(h).sum()) instanceof Integer S
            && Integer.valueOf(1 << 28) instanceof Integer INF
            && IntStream.range(1, n).boxed().reduce(
                new int[][]{IntStream.rangeClosed(0, a).map(r -> r == h[0] ? 0 : INF).toArray(), IntStream.rangeClosed(0, a).map(r -> r == 0 ? 0 : INF).toArray()},
                (dp, i) -> new int[][]{
                    IntStream.rangeClosed(0, a).map(r -> r < h[i] ? INF : Math.min(dp[0][r - h[i]], dp[1][r - h[i]] + Math.min(h[i - 1], h[i]))).toArray(),
                    IntStream.rangeClosed(0, a).map(r -> Math.min(dp[1][r], dp[0][r] + Math.min(h[i - 1], h[i]))).toArray()}, (x, y) -> x) instanceof int[][] fin
            && Integer.valueOf(IntStream.rangeClosed(Math.max(0, S - b), a).map(r -> Math.min(fin[0][r], fin[1][r])).min().orElse(INF)) instanceof Integer best
            && out.append((best >= INF ? "-1" : String.valueOf(best)) + "\n").checkError());
    }
}
