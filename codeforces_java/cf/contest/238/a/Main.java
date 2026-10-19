import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Long.valueOf(1000000007L) instanceof Long M
            ? m < 40 && n >= (1L << m) ? 0 : new long[]{LongStream.iterate(62, i -> i >= 0, i -> i - 1).reduce(1L, (r, i) -> ((long) m >> i & 1) == 1 ? r * r % M * 2 % M : r * r % M)} instanceof long[] p
                ? LongStream.rangeClosed(1, n).reduce(1L, (acc, i) -> acc * ((p[0] - i % M + M) % M) % M) : 0 : "");
    }
}
