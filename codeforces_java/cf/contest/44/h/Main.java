import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.next()).ifPresent(x -> System.out.println(
            x.chars().skip(1).boxed().reduce(new long[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, (dp, ch) -> IntStream.range(0, 10).mapToLong(e -> IntStream.range(0, 10).filter(d -> e == (d + ch - 48) / 2 || e == (d + ch - 48 + 1) / 2).mapToLong(d -> dp[d]).sum()).toArray(), (p, q) -> p) instanceof long[] f
            ? Arrays.stream(f).sum() - (IntStream.range(1, x.length()).allMatch(i -> Math.abs(x.charAt(i) - x.charAt(i - 1)) <= 1) ? 1 : 0)
            : 0)));
    }
}


