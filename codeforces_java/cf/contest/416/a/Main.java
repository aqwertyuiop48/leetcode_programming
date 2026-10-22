import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && new long[]{-2000000000L, 2000000000L} instanceof long[] r
            && IntStream.range(0, n).allMatch(i -> s.next() instanceof String op && Long.valueOf(s.nextLong()) instanceof Long x && s.next() instanceof String an
                && (an.equals("Y") ? op : switch (op) { case ">=" -> "<"; case "<" -> ">="; case ">" -> "<="; default -> ">"; }) instanceof String o
                && (r[0] = o.equals(">=") ? Math.max(r[0], x) : o.equals(">") ? Math.max(r[0], x + 1) : r[0]) > Long.MIN_VALUE
                && (r[1] = o.equals("<") ? Math.min(r[1], x - 1) : o.equals("<=") ? Math.min(r[1], x) : r[1]) > Long.MIN_VALUE)
            ? r[0] > r[1] ? "Impossible" : String.valueOf(r[0]) : "");
    }
}
