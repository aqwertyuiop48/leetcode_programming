import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long x && (Integer) s.nextInt() instanceof Integer k && (Double) (s.nextInt() / 100.0) instanceof Double p
            && new double[2][240][k + 3] instanceof double[][][] q
            && IntStream.range(0, 240).allMatch(e -> IntStream.range(0, k + 2).allMatch(c -> (q[0][e][c] = e == 0 ? 1 : e <= 62 && ((x + c) & ((1L << e) - 1)) == 0 ? 1 : 0) >= 0))
            && IntStream.rangeClosed(1, k).allMatch(j -> IntStream.range(0, 240).allMatch(e -> IntStream.rangeClosed(0, k - j).allMatch(c ->
                (q[j & 1][e][c] = e == 0 ? 1 : (c % 2 == 0 ? p * q[(j - 1) & 1][e - 1][c / 2] : 0) + (1 - p) * q[(j - 1) & 1][e][c + 1]) >= 0)))
            ? String.format("%.10f", IntStream.range(1, 240).mapToDouble(e -> q[k & 1][e][0]).sum()) : "");
    }
}
