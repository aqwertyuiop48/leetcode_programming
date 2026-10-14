import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Integer.valueOf(s.nextInt()) instanceof Integer sr
            && Integer.valueOf(s.nextInt()) instanceof Integer sc
            ? String.format(Locale.ROOT, "%.10f", Stream.iterate(new double[m + 2], below ->
                m == 1
                ? new double[]{0, 2 + below[1], 0}
                : (new double[m + 2] instanceof double[] cp
                    && new double[m + 2] instanceof double[] dp
                    && new double[m + 2] instanceof double[] cur
                    && IntStream.rangeClosed(1, m).allMatch(c ->
                        Double.valueOf(c == 1 ? 0 : c == m ? -1.0 / 3 : -0.25) instanceof Double a
                        && Double.valueOf(c == 1 || c == m ? 2.0 / 3 : 0.75) instanceof Double b
                        && Double.valueOf(c == m ? 0 : c == 1 ? -1.0 / 3 : -0.25) instanceof Double dd
                        && Double.valueOf(1 + below[c] / (c == 1 || c == m ? 3.0 : 4.0)) instanceof Double rhs
                        && Double.valueOf(b - a * cp[c - 1]) instanceof Double den
                        && (cp[c] = dd / den) == cp[c]
                        && (dp[c] = (rhs - a * dp[c - 1]) / den) == dp[c])
                    && IntStream.rangeClosed(1, m).map(i -> m + 1 - i).allMatch(c -> (cur[c] = dp[c] - cp[c] * cur[c + 1]) == cur[c])
                    ? cur
                    : below))
                .skip(Math.max(0, n - sr)).findFirst().get()[sc])
            : ""));
    }
}
