import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> s.nextLong()).toArray() instanceof long[] a
            && new long[]{0, 0, -1, 0, 0, 1} instanceof long[] st
            && IntStream.range(0, n).allMatch(j -> Boolean.valueOf(a[j] < 0 ? st[3] == 0 || st[1] + st[4] * (j - st[2]) > 0
                : st[2] < 0 || (st[3] == 0 ? (a[j] - st[1]) % (j - st[2]) == 0 && st[1] - (a[j] - st[1]) / (j - st[2]) * (st[2] - st[0]) > 0 : st[1] + st[4] * (j - st[2]) == a[j])) instanceof Boolean fits
                && (fits ? (a[j] < 0 || (st[2] < 0 ? (st[2] = j) >= 0 && (st[1] = a[j]) >= 0 : st[3] != 0 || (st[4] = (a[j] - st[1]) / (j - st[2])) * 0 == 0 && (st[3] = 1) > 0))
                    : (st[5]++ > 0 && (st[0] = j) >= 0 && (st[2] = a[j] < 0 ? -1 : j) != Long.MIN_VALUE && (st[1] = a[j]) != Long.MIN_VALUE && (st[3] = 0) == 0))
                    || true)
            ? st[5] : 0);
    }
}
