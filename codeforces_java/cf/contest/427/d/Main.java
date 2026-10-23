import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s && sc.next() instanceof String t && (Integer) s.length() instanceof Integer n && (Integer) t.length() instanceof Integer m
            && new int[2][Math.max(n, m) + 2] instanceof int[][] w && new int[n] instanceof int[] A && new int[m] instanceof int[] B
            && IntStream.range(0, n).map(r -> n - 1 - r).allMatch(i -> IntStream.range(0, n).map(j -> n - 1 - j).allMatch(j -> (w[i & 1][j] = s.charAt(i) == s.charAt(j) ? w[(i + 1) & 1][j + 1] + 1 : 0) >= 0 && (i == j || (A[i] = Math.max(A[i], w[i & 1][j])) >= 0)))
            && IntStream.range(0, 2).allMatch(q -> IntStream.range(0, Math.max(n, m) + 2).allMatch(j -> (w[q][j] = 0) == 0))
            && IntStream.range(0, m).map(r -> m - 1 - r).allMatch(i -> IntStream.range(0, m).map(j -> m - 1 - j).allMatch(j -> (w[i & 1][j] = t.charAt(i) == t.charAt(j) ? w[(i + 1) & 1][j + 1] + 1 : 0) >= 0 && (i == j || (B[i] = Math.max(B[i], w[i & 1][j])) >= 0)))
            && IntStream.range(0, 2).allMatch(q -> IntStream.range(0, Math.max(n, m) + 2).allMatch(j -> (w[q][j] = 0) == 0))
            && new int[]{1 << 29} instanceof int[] best
            && IntStream.range(0, n).map(r -> n - 1 - r).allMatch(i -> IntStream.range(0, m).map(j -> m - 1 - j).allMatch(j -> (w[i & 1][j] = s.charAt(i) == t.charAt(j) ? w[(i + 1) & 1][j + 1] + 1 : 0) >= 0
                && (Math.max(A[i], B[j]) + 1 > w[i & 1][j] || (best[0] = Math.min(best[0], Math.max(A[i], B[j]) + 1)) >= 0)))
            ? best[0] >= 1 << 29 ? -1 : best[0] : 0);
    }
}
