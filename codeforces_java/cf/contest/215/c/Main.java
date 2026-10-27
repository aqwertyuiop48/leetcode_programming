import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && (Long) sc.nextLong() instanceof Long n && (Long) sc.nextLong() instanceof Long m && (Long) sc.nextLong() instanceof Long s
            && (Integer) (int) ((n - 1) / 2 + 1) instanceof Integer na && (Integer) (int) ((m - 1) / 2 + 1) instanceof Integer nb
            ? LongStream.range(0, (long) na * na * nb).parallel().map(t -> (Long) (t / ((long) na * nb)) instanceof Long a && (Long) ((t / nb) % na) instanceof Long c && (Long) (t % nb) instanceof Long b
                && (Long) Math.min(a, c) instanceof Long mn && (Long) (n - 2 * Math.max(a, c)) instanceof Long w
                && (Long) (s - (2 * b + 1) * 2 * (a - mn)) instanceof Long r && (Long) (s - (2 * a + 1) * (2 * b + 1)) instanceof Long r2
                ? (r > 0 && r % (2 * c + 1) == 0 && (r / (2 * c + 1)) % 2 == 1 && (r / (2 * c + 1) - 1) / 2 >= b && (r / (2 * c + 1) - 1) / 2 <= (m - 1) / 2 ? w * (m - 2 * ((r / (2 * c + 1) - 1) / 2)) : 0L)
                    + (c > a ? (r2 > 0 && r2 % (2 * (c - a)) == 0 && (r2 / (2 * (c - a))) % 2 == 1 && (r2 / (2 * (c - a)) - 1) / 2 < b ? w * (m - 2 * b) : 0L)
                        : (r2 == 0 ? w * (m - 2 * b) * b : 0L)) : 0L).sum() : 0);
    }


}
