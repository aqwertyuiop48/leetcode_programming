import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] p
            && new double[n][n] instanceof double[][] q && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j -> (q[i][j] = p[i] > p[j] ? 1 : 0) >= 0))
            && IntStream.range(0, m).allMatch(t -> Integer.valueOf(s.nextInt() - 1) instanceof Integer a && Integer.valueOf(s.nextInt() - 1) instanceof Integer b
                && (a.equals(b) || IntStream.range(0, n).filter(k -> k != a && k != b).allMatch(k -> (q[a][k] = q[b][k] = (q[a][k] + q[b][k]) / 2) >= 0 && (q[k][a] = q[k][b] = (q[k][a] + q[k][b]) / 2) >= 0))
                && ((q[a][b] = q[b][a] = 0.5) > 0 || a.equals(b)))
            ? String.format(Locale.US, "%.9f", IntStream.range(0, n).mapToDouble(i -> IntStream.range(i + 1, n).mapToDouble(j -> q[i][j]).sum()).sum()) : "");
    }
}
