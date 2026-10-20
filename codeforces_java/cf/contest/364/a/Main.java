import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Long.valueOf(sc.nextLong()) instanceof Long a && sc.next() instanceof String s && Integer.valueOf(s.length()) instanceof Integer n
            && new int[n + 1] instanceof int[] ps && IntStream.range(0, n).allMatch(i -> (ps[i + 1] = ps[i] + s.charAt(i) - '0') >= 0)
            && new long[9 * n + 2] instanceof long[] cnt && IntStream.range(0, n).allMatch(i -> IntStream.rangeClosed(i + 1, n).allMatch(j -> cnt[ps[j] - ps[i]]++ >= 0))
            && Long.valueOf((long) n * (n + 1) / 2) instanceof Long T
            ? a == 0 ? 2 * cnt[0] * T - cnt[0] * cnt[0] : IntStream.rangeClosed(1, 9 * n).filter(x -> a % x == 0 && a / x <= 9 * n).mapToLong(x -> cnt[x] * cnt[(int) (a / x)]).sum() : "");
    }
}
