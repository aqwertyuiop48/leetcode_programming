import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n - 1).map(i -> s.nextInt()).toArray() instanceof int[] a
            && new long[n] instanceof long[] lr && new long[n] instanceof long[] la && new long[n] instanceof long[] rr && new long[n] instanceof long[] ra
            && IntStream.range(1, n).allMatch(i -> (lr[i] = a[i - 1] >= 2 ? lr[i - 1] + a[i - 1] - a[i - 1] % 2 : 0) >= 0
                && (la[i] = Math.max(lr[i], la[i - 1] + (a[i - 1] % 2 == 1 ? a[i - 1] : a[i - 1] - 1))) >= 0)
            && IntStream.iterate(n - 2, i -> i >= 0, i -> i - 1).allMatch(i -> (rr[i] = a[i] >= 2 ? rr[i + 1] + a[i] - a[i] % 2 : 0) >= 0
                && (ra[i] = Math.max(rr[i], ra[i + 1] + (a[i] % 2 == 1 ? a[i] : a[i] - 1))) >= 0)
            ? IntStream.range(0, n).mapToLong(i -> Math.max(lr[i] + ra[i], la[i] + rr[i])).max().getAsLong() : "");
    }
}

