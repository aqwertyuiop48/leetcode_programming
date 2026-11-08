import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] a
            && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).map(c -> (c > 47 && c < 58 ? (st[1] = st[1] * 10 + c - 48) + (st[3] = 1) : c == 45 ? (st[2] = 1) : st[3] == 0 ? 0 : (a[st[0]++] = st[2] == 1 ? -st[1] : st[1]) + (st[1] = 0) + (st[2] = 0) + (st[3] = 0)) * 0).sum() == 0
            && (Integer) a[0] instanceof Integer n && (Integer) a[1] instanceof Integer k
            && (IntUnaryOperator) (m -> k % 2 == 0 ? (m < 3 ? m : 1 - m % 2)
                : (Integer) (int) IntStream.iterate(m, x -> x > 4 && x % 2 == 0, x -> x / 2).count() instanceof Integer c
                    ? IntStream.range(0, c).reduce((m >> c) <= 4 ? new int[]{0, 1, 0, 1, 2}[m >> c] : 0, (x, i) -> x == 1 ? 2 : 1) : 0) instanceof IntUnaryOperator g
            ? (IntStream.range(0, n).map(i -> g.applyAsInt(a[2 + i])).reduce(0, (x, y) -> x ^ y) != 0 ? "Kevin" : "Nicky") : "");
    }
}
