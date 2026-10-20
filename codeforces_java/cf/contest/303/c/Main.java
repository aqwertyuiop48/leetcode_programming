import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer k
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && new int[1000001] instanceof int[] cnt && new int[1000002] instanceof int[] stamp
            && IntStream.range(0, n).allMatch(i -> IntStream.range(i + 1, n).allMatch(j -> ++cnt[Math.abs(a[i] - a[j])] > 0))
            ? IntStream.iterate(Math.max(1, n - k), m -> m + 1)
                .filter(m -> IntStream.iterate(m, d -> d <= 1000000, d -> d + m).map(d -> cnt[d]).sum() <= k * (k + 1) / 2
                    && Arrays.stream(a).filter(x -> stamp[x % m] != m && (stamp[x % m] = m) > 0).count() >= n - k)
                .findFirst().getAsInt() : "");
    }
}
