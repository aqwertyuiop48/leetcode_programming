import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Long.valueOf(sc.nextLong()) instanceof Long x && Long.valueOf(sc.nextLong()) instanceof Long y && Long.valueOf(sc.nextLong()) instanceof Long m
            ? Math.max(x, y) >= m ? "0" : Math.max(x, y) <= 0 ? "-1"
                : new long[]{Math.min(x, y), Math.max(x, y), 0} instanceof long[] st
                    && Long.valueOf(st[0] < 0 ? (-st[0] + st[1] - 1) / st[1] : 0) instanceof Long k && (st[0] += k * st[1]) >= 0 && (st[2] = k) >= 0
                    && IntStream.iterate(0, z -> st[1] < m, z -> (st[1] = st[0] + (st[0] = st[1])) > 0 ? (int) (st[2]++ & 1) : 0).allMatch(z -> true)
                    ? String.valueOf(st[2]) : "" : "");
    }
}
