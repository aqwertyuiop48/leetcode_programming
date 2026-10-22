import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer p
            ? IntStream.rangeClosed(1, 9).mapToObj(d -> new int[n] instanceof int[] a && new long[1] instanceof long[] c && (a[0] = d) > 0
                && IntStream.range(0, n - 1).allMatch(i -> (a[i + 1] = (int) ((c[0] = a[i] * p + c[0] / 10) % 10)) >= 0)
                && a[n - 1] != 0 && a[n - 1] * p + c[0] / 10 == d
                ? IntStream.range(0, n).mapToObj(i -> String.valueOf(a[n - 1 - i])).collect(Collectors.joining()) : (String) null)
                .filter(Objects::nonNull).min(Comparator.naturalOrder()).orElse("Impossible") : "");
    }
}
