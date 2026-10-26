import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer R && (Integer) sc.nextInt() instanceof Integer S && (Integer) sc.nextInt() instanceof Integer P
            && new double[R + 2][S + 2][P + 2] instanceof double[][][] d && (d[R][S][P] = 1) > 0
            && new double[3] instanceof double[] ans
            && IntStream.iterate(R, r -> r >= 0, r -> r - 1).allMatch(r -> IntStream.iterate(S, s -> s >= 0, s -> s - 1).allMatch(s -> IntStream.iterate(P, p -> p >= 0, p -> p - 1).allMatch(p ->
                d[r][s][p] == 0 || ((r > 0 ? 1 : 0) + (s > 0 ? 1 : 0) + (p > 0 ? 1 : 0) == 1
                    ? (r > 0 ? (ans[0] += d[r][s][p]) : s > 0 ? (ans[1] += d[r][s][p]) : (ans[2] += d[r][s][p])) >= 0
                    : (Double) (double) (r * s + s * p + p * r) instanceof Double tot
                        && (r * s == 0 || (d[r][s - 1][p] += d[r][s][p] * r * s / tot) >= 0)
                        && (s * p == 0 || (d[r][s][p - 1] += d[r][s][p] * s * p / tot) >= 0)
                        && (p * r == 0 || (d[r - 1][s][p] += d[r][s][p] * p * r / tot) >= 0)))))
            ? String.format(Locale.ROOT, "%.12f %.12f %.12f", ans[0], ans[1], ans[2]) : "");
    }
}
