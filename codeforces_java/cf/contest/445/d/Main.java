import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer d && (Long) s.nextLong() instanceof Long x0
            && new long[]{x0} instanceof long[] x && IntStream.rangeClosed(1, n).toArray() instanceof int[] a && IntStream.range(0, n).map(i -> i < d ? 1 : 0).toArray() instanceof int[] b
            && IntStream.range(0, n).allMatch(i -> (Integer) (int) ((x[0] = (x[0] * 37 + 10007) % 1000000007L) % (i + 1)) instanceof Integer j && (Integer) a[i] instanceof Integer u && (Integer) a[j] instanceof Integer w && (a[i] = w) > 0 && (a[j] = u) > 0)
            && IntStream.range(0, n).allMatch(i -> (Integer) (int) ((x[0] = (x[0] * 37 + 10007) % 1000000007L) % (i + 1)) instanceof Integer j && (Integer) b[i] instanceof Integer u && (Integer) b[j] instanceof Integer w && (b[i] = w) >= 0 && (b[j] = u) >= 0)
            && new int[n + 1] instanceof int[] pos && IntStream.range(0, n).allMatch(i -> (pos[a[i]] = i) >= 0)
            && IntStream.range(0, n).map(t -> pos[n - t]).toArray() instanceof int[] pv
            && IntStream.range(0, n).filter(i -> b[i] == 1).toArray() instanceof int[] ones
            ? IntStream.range(0, n).mapToObj(k -> String.valueOf(d > 450 ? IntStream.range(0, n).filter(t -> pv[t] <= k && b[k - pv[t]] == 1).findFirst().stream().map(t -> n - t).findFirst().orElse(0)
                : IntStream.of(ones).takeWhile(j -> j <= k).map(j -> a[k - j]).max().orElse(0))).collect(Collectors.joining("\n")) : "");
    }
}

