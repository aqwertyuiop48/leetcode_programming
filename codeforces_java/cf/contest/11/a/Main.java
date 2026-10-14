import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new long[]{s.nextInt(), s.nextInt()}).ifPresent(nd ->
            System.out.println(
                new long[(int) nd[0]] instanceof long[] a
                && IntStream.range(0, (int) nd[0]).allMatch(i -> (a[i] = s.nextLong()) >= 0)
                && new long[]{0, Long.MIN_VALUE} instanceof long[] st
                && IntStream.range(0, (int) nd[0]).allMatch(i ->
                    new long[]{a[i] <= st[1] ? (st[1] - a[i]) / nd[1] + 1 : 0} instanceof long[] k
                    && (st[0] += k[0]) >= 0
                    && (st[1] = a[i] + k[0] * nd[1]) >= Long.MIN_VALUE)
                ? st[0] : 0L)));
    }
}

