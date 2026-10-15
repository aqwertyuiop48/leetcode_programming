import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                new int[n + 1] instanceof int[] a
                && IntStream.rangeClosed(1, n).allMatch(i -> (a[i] = s.nextInt()) == a[i])
                && new int[]{s.nextInt()} instanceof int[] mArr
                && new int[mArr[0] + 1] instanceof int[] b
                && IntStream.rangeClosed(1, mArr[0]).allMatch(j -> (b[j] = s.nextInt()) == b[j])
                && new int[mArr[0] + 1] instanceof int[] dp
                && new int[mArr[0] + 1] instanceof int[] prev
                && IntStream.rangeClosed(1, n).allMatch(i ->
                    new int[]{0, 0} instanceof int[] best
                    && IntStream.rangeClosed(1, mArr[0]).allMatch(j ->
                        a[i] == b[j]
                            ? (best[0] + 1 > dp[j] ? (dp[j] = best[0] + 1) > 0 && (prev[j] = best[1]) >= 0 : true)
                            : (b[j] < a[i] && dp[j] > best[0] ? (best[0] = dp[j]) > 0 && (best[1] = j) > 0 : true)))
                && IntStream.rangeClosed(1, mArr[0]).boxed()
                    .max(Comparator.<Integer>comparingInt(j -> dp[j]).thenComparingInt(j -> -j))
                    .orElse(0) instanceof Integer jStar
                ? jStar == 0 || dp[jStar] == 0
                    ? "0\n"
                    : Stream.iterate(jStar, j -> j > 0, j -> prev[j]).map(j -> b[j]).toList() instanceof List<Integer> ch
                        ? dp[jStar] + "\n" + IntStream.range(0, ch.size()).mapToObj(i -> String.valueOf(ch.get(ch.size() - 1 - i))).collect(Collectors.joining(" "))
                        : ""
                : "0\n")));
    }
}
