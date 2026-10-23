import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && new long[]{-2000000000L, 2000000000L} instanceof long[] r
            && IntStream.range(0, n).allMatch(i -> s.next() instanceof String op && (Long) s.nextLong() instanceof Long x && (Boolean) s.next().equals("Y") instanceof Boolean y
                && (op.equals(">") ? y ? (r[0] = Math.max(r[0], x + 1)) : (r[1] = Math.min(r[1], x))
                    : op.equals("<") ? y ? (r[1] = Math.min(r[1], x - 1)) : (r[0] = Math.max(r[0], x))
                    : op.equals(">=") ? y ? (r[0] = Math.max(r[0], x)) : (r[1] = Math.min(r[1], x - 1))
                    : y ? (r[1] = Math.min(r[1], x)) : (r[0] = Math.max(r[0], x + 1))) > Long.MIN_VALUE)
            ? r[0] <= r[1] ? String.valueOf(r[0]) : "Impossible" : "");
    }
}
