import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> s.nextLong()).toArray() instanceof long[] p
            && IntStream.range(0, 5).mapToLong(i -> s.nextLong()).toArray() instanceof long[] a
            && new long[5] instanceof long[] cnt && new long[1] instanceof long[] pts
            && Arrays.stream(p).allMatch(x -> (pts[0] += x) > 0 && IntStream.iterate(4, i -> i >= 0, i -> i - 1).allMatch(i -> (cnt[i] += pts[0] / a[i]) >= 0 && (pts[0] %= a[i]) >= 0))
            ? Arrays.stream(cnt).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + "\n" + pts[0] : "");
    }
}
