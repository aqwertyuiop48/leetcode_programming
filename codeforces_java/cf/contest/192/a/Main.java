import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n
            ? LongStream.rangeClosed(1, (long) Math.sqrt(2.0 * n) + 2).filter(k -> k * (k + 1) / 2 < n).anyMatch(k -> Long.valueOf(n - k * (k + 1) / 2) instanceof Long r && Long.valueOf((long) ((Math.sqrt(8.0 * r + 1) - 1) / 2)) instanceof Long t
                && LongStream.rangeClosed(Math.max(1, t - 1), t + 1).anyMatch(m -> m * (m + 1) / 2 == r)) ? "YES" : "NO"
            : "");
    }
}

