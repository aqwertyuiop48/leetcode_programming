import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] b && Integer.valueOf(Arrays.stream(a).sum()) instanceof Integer ta && Integer.valueOf(Arrays.stream(b).sum()) instanceof Integer sb
            && Arrays.stream(b).boxed().sorted(Comparator.reverseOrder()).mapToInt(x -> x).toArray() instanceof int[] sorted && new int[]{0, 0} instanceof int[] acc
            && Integer.valueOf((int) IntStream.range(0, n).takeWhile(i -> acc[0] < ta).peek(i -> acc[0] += sorted[i]).count()) instanceof Integer k
            && new int[(k + 1) * (sb + 1)] instanceof int[] dp && Stream.of(0).peek(x -> Arrays.fill(dp, -1000000)).findFirst().isPresent() && (dp[0] = 0) == 0
            && IntStream.range(0, n).filter(i -> IntStream.iterate(k, c -> c >= 1, c -> c - 1).filter(c -> IntStream.rangeClosed(b[i], sb).filter(t -> (dp[c * (sb + 1) + t] = Math.max(dp[c * (sb + 1) + t], dp[(c - 1) * (sb + 1) + t - b[i]] + a[i])) > Integer.MIN_VALUE).count() >= 0).count() >= 0).count() >= 0
            ? k + " " + (ta - IntStream.rangeClosed(ta, sb).map(t -> dp[k * (sb + 1) + t]).max().getAsInt()) : "");
    }
}
