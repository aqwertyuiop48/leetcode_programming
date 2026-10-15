import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).mapToObj(i -> new long[]{s.nextLong(), s.nextLong(), i}).sorted(Comparator.comparingLong(a -> a[0])).toArray(long[][]::new) instanceof long[][] d
                && new long[n] instanceof long[] R
                && new int[n] instanceof int[] cnt
                && new int[n] instanceof int[] ans
                && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i ->
                    (R[i] = d[i][0] + d[i][1] - 1) > Long.MIN_VALUE
                    && (cnt[i] = 1 + IntStream.iterate(i + 1, j -> j < n && d[j][0] <= R[i], j -> (R[i] = Math.max(R[i], R[j])) == Long.MIN_VALUE ? j : j + cnt[j]).map(j -> cnt[j]).sum()) > 0
                    && (ans[(int) d[i][2]] = cnt[i]) > 0)
                ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                : "")));
    }
}

