import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && new long[n + 2] instanceof long[] pre
            ? IntStream.rangeClosed(1, n).mapToLong(i -> (Integer) s.nextInt() instanceof Integer p
                && (pre[i] = (pre[i - 1] + (2 + pre[i - 1] - pre[p - 1] + 1000000007L * 2) % 1000000007L) % 1000000007L) >= 0 ? (pre[i] - pre[i - 1] + 1000000007L) % 1000000007L : 0).sum() % 1000000007L : 0);
    }
}
