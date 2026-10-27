import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong((Integer i) -> t[1 + 2 * i] - t[2 + 2 * i])).mapToInt(i -> i).toArray() instanceof int[] ord
            && Arrays.stream(ord).mapToLong(i -> t[1 + 2 * i] - t[2 + 2 * i]).toArray() instanceof long[] sl
            && new int[n] instanceof int[] ans
            && IntStream.range(0, n).allMatch(i -> (ans[i] = -1) < 0)
            && Integer.valueOf((int) t[1 + 2 * n]) instanceof Integer m
            && IntStream.range(0, m).allMatch(j -> Long.valueOf(t[2 + 2 * n + 2 * j]) instanceof Long x
                && Long.valueOf(t[3 + 2 * n + 2 * j]) instanceof Long y
                && Integer.valueOf(Arrays.binarySearch(sl, x)) instanceof Integer p
                && Integer.valueOf(p >= 0 ? p : -p - 2) instanceof Integer k
                && IntStream.of(k, k - 1).filter(c -> c >= 0 && c < n).map(c -> ord[c])
                    .filter(o -> (x - t[1 + 2 * o]) * (x - t[1 + 2 * o]) + y * y <= t[2 + 2 * o] * t[2 + 2 * o] && ans[o] < 0).allMatch(o -> (ans[o] = j + 1) > 0))
            ? IntStream.of(ans).filter(v -> v > 0).count() + "\n" + IntStream.of(ans).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}





