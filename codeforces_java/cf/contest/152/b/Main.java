import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n
            && Long.valueOf(s.nextLong()) instanceof Long m
            && new long[]{s.nextLong(), s.nextLong()} instanceof long[] pos
            && Integer.valueOf(s.nextInt()) instanceof Integer k
            && ((Function<long[], Long>) q -> q[1] > 0 ? (q[2] - q[0]) / q[1] : q[1] < 0 ? (q[0] - 1) / -q[1] : Long.MAX_VALUE) instanceof Function<long[], Long> lim
            ? IntStream.range(0, k).mapToLong(i ->
                Long.valueOf(s.nextLong()) instanceof Long dx
                && Long.valueOf(s.nextLong()) instanceof Long dy
                && Long.valueOf(Math.min(lim.apply(new long[]{pos[0], dx, n}), lim.apply(new long[]{pos[1], dy, m}))) instanceof Long t
                && (pos[0] += dx * t) != Long.MIN_VALUE
                && (pos[1] += dy * t) != Long.MIN_VALUE
                ? t : 0).sum()
            : 0);
    }
}

