import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new long[s.nextInt()] instanceof long[] a
                && IntStream.range(0, a.length).allMatch(i -> (a[i] = s.nextLong()) == a[i])
                && new int[1] instanceof int[] L
                && new int[1] instanceof int[] cnt
                && IntStream.rangeClosed(1, a.length / 2).allMatch(x ->
                    (cnt[0] = 0) == 0
                    && IntStream.range(0, a.length - x).allMatch(k ->
                        k < L[0]
                        || ((cnt[0] = a[k] == a[k + x] ? cnt[0] + 1 : 0) < x
                            || ((L[0] = k + 1) > 0 && (cnt[0] = 0) == 0))))
                ? (a.length - L[0]) + "\n" + IntStream.range(L[0], a.length).mapToObj(i -> "" + a[i]).collect(Collectors.joining(" "))
                : ""));
    }
}



