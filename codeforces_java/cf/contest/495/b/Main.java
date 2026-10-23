import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long a
            && Long.valueOf(sc.nextLong()) instanceof Long b
            ? a.equals(b)
                ? "infinity"
                : a < b
                    ? "0"
                    : Long.valueOf(a - b) instanceof Long n
                        ? "" + LongStream.rangeClosed(1, (long) Math.sqrt(n) + 1)
                            .filter(d -> d * d <= n && n % d == 0)
                            .map(d -> (d > b ? 1 : 0) + (d != n / d && n / d > b ? 1 : 0))
                            .sum()
                        : ""
            : "");
    }
}
