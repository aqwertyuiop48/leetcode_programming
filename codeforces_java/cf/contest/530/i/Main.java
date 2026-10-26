import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
            && new boolean[n][n] instanceof boolean[][] adj
            && IntStream.range(0, k).allMatch(i -> IntStream.range(0, s.nextInt()).map(j -> s.nextInt() - 1).toArray() instanceof int[] g
                && Arrays.stream(g).allMatch(x -> Arrays.stream(g).allMatch(y -> x == y || (adj[x][y] = true))))
            && new int[n] instanceof int[] val && new IntPredicate[1] instanceof IntPredicate[] rec
            && IntStream.rangeClosed(1, n).filter(m -> (rec[0] = i -> i == n || IntStream.rangeClosed(1, m).anyMatch(c -> IntStream.range(0, i).noneMatch(j -> adj[i][j] && val[j] == c) && (val[i] = c) > 0 && rec[0].test(i + 1))) != null && rec[0].test(0)).findFirst().isPresent()
            ? Arrays.stream(val).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
