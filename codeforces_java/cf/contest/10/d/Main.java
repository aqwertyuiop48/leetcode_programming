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
                && IntStream.rangeClosed(1, n).allMatch(i ->
                    new int[]{0} instanceof int[] best
                    && IntStream.rangeClosed(1, mArr[0]).allMatch(j ->
                        a[i] == b[j]
                            ? (best[0] + 1 > dp[j] ? (dp[j] = best[0] + 1) >= 0 : true)
                            : (b[j] < a[i] && dp[j] > best[0] ? (best[0] = dp[j]) >= 0 : true)))
                && IntStream.rangeClosed(1, mArr[0]).boxed()
                    .max(Comparator.<Integer>comparingInt(j -> dp[j]).thenComparingInt(j -> j))
                    .orElse(0) instanceof Integer jStar
                && Stream.iterate(new int[]{jStar, dp[jStar]},
                        st -> st[1] >= 1 && st[0] >= 1,
                        st -> new int[]{
                            IntStream.rangeClosed(1, st[0] - 1).filter(k -> b[k] < b[st[0]] && dp[k] == st[1] - 1).max().orElse(-1),
                            st[1] - 1})
                    .map(st -> b[st[0]])
                    .collect(Collectors.toList()) instanceof List<Integer> chain
                ? dp[jStar] + "\n" + IntStream.range(0, chain.size()).mapToObj(i -> String.valueOf(chain.get(chain.size() - 1 - i))).collect(Collectors.joining(" "))
                : "0\n")));
    }
}
