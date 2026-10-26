import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer h && (Long) s.nextLong() instanceof Long n
            && new long[]{n, 0} instanceof long[] st
            ? LongStream.iterate(h, i -> i >= 1, i -> i - 1).map(i -> ((st[0] <= (1L << (i - 1))) == (st[1] == 0) ? 1L + ((st[1] ^= 1) & 0L) : (1L << i))
                + (st[0] > (1L << (i - 1)) ? (st[0] -= 1L << (i - 1)) & 0L : 0L)).sum() : 0);
    }
}
