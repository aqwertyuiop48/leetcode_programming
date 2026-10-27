import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && (Long) s.nextLong() instanceof Long t1
            && (Long) s.nextLong() instanceof Long t2
            && (Long) s.nextLong() instanceof Long x1
            && (Long) s.nextLong() instanceof Long x2
            && (Long) s.nextLong() instanceof Long t0
            ? (t0.equals(t1) && t0.equals(t2)
                ? x1 + " " + x2
                : t0.equals(t1)
                    ? x1 + " 0"
                    : t0.equals(t2)
                        ? "0 " + x2
                        : LongStream.rangeClosed(1, x2)
                            .mapToObj(y2 -> new long[]{Math.min(x1, y2 * (t2 - t0) / (t0 - t1)), y2})
                            .map(p -> new long[]{p[0], p[1], p[0] * t1 + p[1] * t2 - t0 * (p[0] + p[1]), p[0] + p[1]})
                            .reduce((p, q) -> p[2] * q[3] < q[2] * p[3] || (p[2] * q[3] == q[2] * p[3] && p[3] >= q[3]) ? p : q)
                            .map(p -> p[0] + " " + p[1]).get())
            : "");
    }
}

