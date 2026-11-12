import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Long.valueOf(s.nextLong()) instanceof Long m
            && new long[]{0, 1, 1} instanceof long[] st
            && IntStream.range(0, n).filter(i -> (st[0] = (m * st[0] + st[1]) % 1000000007L) >= 0 && (st[1] = st[1] * ((2 * m - 1) % 1000000007L) % 1000000007L) >= 0 && (st[2] = st[2] * m % 1000000007L) >= 0).count() >= 0
            ? (st[2] + m * st[0]) % 1000000007L
            : "");
    }
}
