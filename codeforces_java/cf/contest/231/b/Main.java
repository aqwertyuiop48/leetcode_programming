import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Long.valueOf(s.nextLong()) instanceof Long d && Long.valueOf(s.nextLong()) instanceof Long l
            && Long.valueOf((n + 1) / 2) instanceof Long p && Long.valueOf(n / 2) instanceof Long q
            && Long.valueOf(Math.min(p * l, d + q * l)) instanceof Long pmax && Long.valueOf(Math.max(p, d + q)) instanceof Long pmin
            ? pmin > pmax ? "-1" : new long[]{pmax - p, pmax - d - q} instanceof long[] extra
                ? IntStream.range(0, n).mapToObj(i -> Long.valueOf(Math.min(l - 1, extra[i % 2])) instanceof Long add && (extra[i % 2] -= add) >= 0 ? String.valueOf(1 + add) : "").collect(Collectors.joining(" ")) : "" : "");
    }
}
