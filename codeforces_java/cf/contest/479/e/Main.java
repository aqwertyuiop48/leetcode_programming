import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && (Integer) sc.nextInt() instanceof Integer n
            && (Integer) sc.nextInt() instanceof Integer a
            && (Integer) sc.nextInt() instanceof Integer b
            && (Integer) sc.nextInt() instanceof Integer k
            && new int[][] {new int[n + 2], new int[n + 2], new int[n + 2], new int[n + 2]} instanceof int[][] w
            && (w[0][a] = 1) == 1
            && IntStream.range(0, k).allMatch(st -> w[st & 1] instanceof int[] cur && w[1 - (st & 1)] instanceof int[] nxt
                && IntStream.range(1, b).reduce(0, (u, i) -> (w[2][i] = (w[2][i - 1] + cur[i] - 1000000007) + (((w[2][i - 1] + cur[i] - 1000000007) >> 31) & 1000000007)) < 0 ? 1 : 0) >= 0
                && IntStream.range(b + 1, n + 1).reduce(0, (u, i) -> (w[3][n + b + 1 - i] = (w[3][n + b + 2 - i] + cur[n + b + 1 - i] - 1000000007) + (((w[3][n + b + 2 - i] + cur[n + b + 1 - i] - 1000000007) >> 31) & 1000000007)) < 0 ? 1 : 0) >= 0
                && IntStream.rangeClosed(1, n).reduce(0, (u, y) -> (nxt[y] = y == b ? 0
                    : y < b ? (w[2][(y + b - 1) / 2] - cur[y]) + (((w[2][(y + b - 1) / 2] - cur[y]) >> 31) & 1000000007)
                    : (w[3][(y + b) / 2 + 1] - cur[y]) + (((w[3][(y + b) / 2 + 1] - cur[y]) >> 31) & 1000000007)) < 0 ? 1 : 0) >= 0)
            ? Arrays.stream(w[k & 1]).asLongStream().sum() % 1000000007L : 0);
    }
}
