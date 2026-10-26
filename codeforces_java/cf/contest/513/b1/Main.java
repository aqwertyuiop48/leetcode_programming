import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Long) s.nextLong() instanceof Long m
            && new int[n] instanceof int[] p && new long[]{m, 0, n - 1} instanceof long[] st
            && IntStream.rangeClosed(1, n).allMatch(i -> i == n ? (p[(int) st[1]] = i) > 0
                : st[0] <= (1L << (n - i - 1)) ? (p[(int) st[1]] = i) > 0 && ++st[1] > 0 : (p[(int) st[2]] = i) > 0 && --st[2] >= -1 && (st[0] -= 1L << (n - i - 1)) > 0)
            ? Arrays.stream(p).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
