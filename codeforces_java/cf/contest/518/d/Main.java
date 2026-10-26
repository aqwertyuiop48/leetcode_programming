import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Double) s.nextDouble() instanceof Double p && (Integer) s.nextInt() instanceof Integer t
            && new double[2][n + 1] instanceof double[][] dp && (dp[0][0] = 1) > 0
            && IntStream.range(0, t).allMatch(i -> dp[i & 1] instanceof double[] a && dp[(i + 1) & 1] instanceof double[] b
                && IntStream.rangeClosed(0, n).allMatch(j -> (b[j] = (j < n ? a[j] * (1 - p) : a[j]) + (j > 0 ? a[j - 1] * p : 0)) >= 0))
            ? String.format(Locale.ROOT, "%.9f", IntStream.rangeClosed(0, n).mapToDouble(j -> j * dp[t & 1][j]).sum()) : "");
    }
}
