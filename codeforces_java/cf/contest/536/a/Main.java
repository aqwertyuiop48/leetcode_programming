import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Long) Long.parseLong(tk.nextToken()) instanceof Long a && (Long) Long.parseLong(tk.nextToken()) instanceof Long b && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            ? IntStream.range(0, q).mapToObj(i -> (Long) Long.parseLong(tk.nextToken()) instanceof Long l && (Long) Long.parseLong(tk.nextToken()) instanceof Long t && (Long) Long.parseLong(tk.nextToken()) instanceof Long m
                && (Long) ((t - a) / b + 1) instanceof Long rmax
                ? a + (l - 1) * b > t ? "-1" : String.valueOf(LongStream.iterate(1L << 21, d -> d > 0, d -> d >> 1).reduce(l, (r, d) -> r + d <= rmax && (r + d - l + 1) * (2 * a + (l - 1 + r + d - 1) * b) / 2 <= t * m ? r + d : r)) : "").collect(Collectors.joining("\n")) : "");
    }
}
