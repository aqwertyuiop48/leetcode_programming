import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{s.nextLong(), s.nextLong()}).reduce(new long[3], (st, e) -> Long.valueOf(Math.max(0, st[0] - (e[0] - st[1])) + e[1]) instanceof Long q ? new long[]{q, e[0], Math.max(st[2], q)} : st) instanceof long[] r
            ? (r[0] + r[1]) + " " + r[2] : "");
    }
}
