import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.println(
            (Integer) sc.nextInt() instanceof Integer n
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] a
            && new long[n + 1] instanceof long[] suf
            && (suf[n] = Long.MAX_VALUE) > 0
            && IntStream.range(0, n).map(k -> n - 1 - k).allMatch(i -> (suf[i] = Math.min(2L * a[i] + 1, suf[i + 1])) > 0)
            ? IntStream.range(0, n).mapToObj(i ->
                (Integer) (-Arrays.binarySearch(suf, 0, n, 2L * a[i]) - 2) instanceof Integer j
                    ? String.valueOf(j > i ? j - i - 1 : -1)
                    : "").collect(Collectors.joining(" "))
            : ""));
    }
}




