
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && new long[b.length / 2 + 4] instanceof long[] t && new long[4] instanceof long[] st
            && IntStream.range(0, b.length + 1).allMatch(i -> i < b.length && b[i] >= 48 ? (st[0] = st[0] * 10 + b[i] - 48) >= 0 && (st[3] = 1) > 0
                : i < b.length && b[i] == 45 ? (st[2] = 1) > 0
                : st[3] == 0 || ((t[(int) st[1]++] = st[2] == 1 ? -st[0] : st[0]) == 0 | true) && (st[0] = 0) == 0 && (st[2] = 0) == 0 && (st[3] = 0) == 0)
            && (Integer) (int) t[0] instanceof Integer n && (Integer) (int) t[1] instanceof Integer m
            ? IntStream.iterate(0, i -> i < n - 1 - i, i -> i + m).mapToLong(i -> 2 * (t[1 + n - i] - t[2 + i])).sum() : 0);
    }
}



