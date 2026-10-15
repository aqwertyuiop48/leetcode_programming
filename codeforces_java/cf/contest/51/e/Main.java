import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(s.nextInt()).ifPresent(m ->
            System.out.println(
                new long[n][n] instanceof long[][] A
                && IntStream.range(0, m).allMatch(e -> new int[]{s.nextInt() - 1, s.nextInt() - 1} instanceof int[] p && (A[p[0]][p[1]] = A[p[1]][p[0]] = 1) == 1)
                && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).filter(j -> A[i][j] == 1).toArray()).toArray(int[][]::new) instanceof int[][] nb
                && new long[n][n] instanceof long[][] B
                && IntStream.range(0, n).allMatch(i -> IntStream.of(nb[i]).allMatch(k -> IntStream.of(nb[k]).allMatch(j -> ++B[i][j] > 0)))
                && new long[n][n] instanceof long[][] C
                && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(k -> B[i][k] == 0 || IntStream.of(nb[k]).allMatch(j -> (C[i][j] += B[i][k]) > 0)))
                ? (IntStream.range(0, n).mapToLong(i -> IntStream.range(0, n).mapToLong(j -> B[i][j] * C[j][i]).sum()).sum()
                    - 5 * IntStream.range(0, n).mapToLong(i -> C[i][i]).sum()
                    - 5 * IntStream.range(0, n).mapToLong(i -> (nb[i].length - 2) * C[i][i]).sum()) / 10
                : 0L))));
    }
}


