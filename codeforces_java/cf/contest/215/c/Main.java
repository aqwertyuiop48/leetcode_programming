import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long n && Long.valueOf(sc.nextLong()) instanceof Long m && Long.valueOf(sc.nextLong()) instanceof Long s
            ? LongStream.rangeClosed(0, (n - 1) / 2).map(a -> LongStream.rangeClosed(0, (n - 1) / 2).map(c -> LongStream.rangeClosed(0, (m - 1) / 2).map(b ->
                Long.valueOf((2 * a + 1) * (2 * b + 1)) instanceof Long a1 && Long.valueOf(n - 2 * Math.max(a, c)) instanceof Long w
                    ? (Long.valueOf(s - a1 + (2 * Math.min(a, c) + 1) * (2 * b + 1)) instanceof Long r1 && r1 > 0 && r1 % (2 * c + 1) == 0 && (r1 / (2 * c + 1)) % 2 == 1
                        && Long.valueOf((r1 / (2 * c + 1) - 1) / 2) instanceof Long d && d >= b && d <= (m - 1) / 2 ? w * (m - 2 * d) : 0)
                    + (c > a ? (s - a1 > 0 && (s - a1) % (2 * c - 2 * a) == 0 && ((s - a1) / (2 * c - 2 * a)) % 2 == 1 && ((s - a1) / (2 * c - 2 * a) - 1) / 2 < b ? w * (m - 2 * b) : 0)
                        : (a1.equals(s) ? w * (m - 2 * b) * b : 0)) : 0).sum()).sum()).sum() : "");
    }
}
