import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n * n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] F && IntStream.range(0, n * n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] S
            && (Integer) (n / 2 + 1) instanceof Integer W && new int[n + 1] instanceof int[] cn && new int[1 << n] instanceof int[] rank
            && IntStream.range(0, 1 << n).filter(mask -> (rank[mask] = cn[Integer.bitCount(mask)]++) < 0).count() >= 0
            && (Integer) (IntStream.rangeClosed(0, n).map(i -> cn[i]).max().getAsInt() * W) instanceof Integer sz && new int[][]{new int[sz], new int[sz]} instanceof int[][] A
            && IntStream.range(0, sz).filter(x -> (A[0][x] = x == 0 ? 0 : -1) < -5).count() >= 0
            && IntStream.range(0, n).filter(i -> A[i & 1] instanceof int[] cu && A[(i + 1) & 1] instanceof int[] nx && IntStream.range(0, sz).filter(x -> (nx[x] = -1) < -5).count() >= 0
                && IntStream.range(0, 1 << n).filter(mask -> Integer.bitCount(mask) == i && (Integer) (rank[mask] * W) instanceof Integer rb && IntStream.range(0, n * 16).filter(c -> (c & 15) < W && (mask >> (c >> 4) & 1) == 0 && cu[rb + (c & 15)] >= 0
                    && ((((c & 15) + 1 < W) && (nx[rank[mask | 1 << (c >> 4)] * W + (c & 15) + 1] = Math.max(nx[rank[mask | 1 << (c >> 4)] * W + (c & 15) + 1], cu[rb + (c & 15)] + F[i * n + (c >> 4)])) < -5)
                        | ((i - (c & 15) + 1 <= n / 2) && (nx[rank[mask | 1 << (c >> 4)] * W + (c & 15)] = Math.max(nx[rank[mask | 1 << (c >> 4)] * W + (c & 15)], cu[rb + (c & 15)] + S[i * n + (c >> 4)])) < -5))).count() >= 0 && false).count() >= 0 && false).count() >= 0
            ? A[n & 1][n / 2] : -1);
    }
}
