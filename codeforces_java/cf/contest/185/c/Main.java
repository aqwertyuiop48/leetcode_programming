import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n - i).map(j -> Integer.parseInt(tk.nextToken())).toArray()).toArray(int[][]::new) instanceof int[][] w
            && new int[n][][] instanceof int[][][] V
            && IntStream.range(0, n).allMatch(i -> (V[i] = new int[n - i][]) != null && IntStream.range(0, n - i).allMatch(k ->
                (V[i][k] = IntStream.range(0, (i + 1) * (i + 1)).map(idx -> idx / (i + 1) > idx % (i + 1) ? 0
                    : i == 0 ? (a[k] >= w[0][k] ? a[k] : 0)
                    : (Integer) (k + idx / (i + 1)) instanceof Integer L && (Integer) (k + idx % (i + 1)) instanceof Integer R
                        && (Integer) Math.max(Math.max(Math.max(L, k) - k > Math.min(R, k + i - 1) - k ? 0 : V[i - 1][k][(Math.max(L, k) - k) * i + Math.min(R, k + i - 1) - k],
                                Math.max(L, k + 1) - k - 1 > Math.min(R, k + i) - k - 1 ? 0 : V[i - 1][k + 1][(Math.max(L, k + 1) - k - 1) * i + Math.min(R, k + i) - k - 1]),
                            IntStream.range(L, R).map(m -> (Integer) (Math.max(L, k) - k > Math.min(m, k + i - 1) - k ? 0 : V[i - 1][k][(Math.max(L, k) - k) * i + Math.min(m, k + i - 1) - k]) instanceof Integer x
                                && (Integer) (Math.max(m + 1, k + 1) - k - 1 > Math.min(R, k + i) - k - 1 ? 0 : V[i - 1][k + 1][(Math.max(m + 1, k + 1) - k - 1) * i + Math.min(R, k + i) - k - 1]) instanceof Integer y && x > 0 && y > 0 ? x + y : 0).max().orElse(0)) instanceof Integer best
                        ? best >= w[i][k] ? best : 0 : 0).toArray()) != null))
            ? V[n - 1][0][n - 1] > 0 ? "Cerealguy" : "Fat Rat" : "");
    }
}
