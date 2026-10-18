import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.print(Optional.of(IntStream.generate(s::nextInt).limit(s.nextInt()).toArray()).map(a -> (Integer) Arrays.stream(a).min().getAsInt() instanceof Integer mn && (Integer) Arrays.stream(a).max().getAsInt() instanceof Integer mx && new int[1000002] instanceof int[] cnt && Arrays.stream(a).allMatch(v -> ++cnt[v] > 0) && mn < mx && new long[]{2L * cnt[mn]} instanceof long[] e && IntStream.rangeClosed(mn + 1, mx).allMatch(v -> v < mx ? (e[0] = 2L * cnt[v] - e[0]) >= 2 : 2L * cnt[v] == e[0]) ? "YES" : "NO").get()));
    }
}
