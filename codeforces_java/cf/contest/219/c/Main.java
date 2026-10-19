import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k && sc.next() instanceof String s
            ? k == 2 ? IntStream.of(0, 1).mapToObj(st -> IntStream.range(0, n).mapToObj(i -> String.valueOf((char) ('A' + (i + st) % 2))).collect(Collectors.joining()))
                    .min(Comparator.<String>comparingLong(t -> IntStream.range(0, n).filter(i -> t.charAt(i) != s.charAt(i)).count()).thenComparing(Comparator.<String>naturalOrder())).get() instanceof String best
                    ? IntStream.range(0, n).filter(i -> best.charAt(i) != s.charAt(i)).count() + "\n" + best : ""
                : new char[n] instanceof char[] c && IntStream.range(0, n).allMatch(i -> (c[i] = s.charAt(i)) > 0) && new int[1] instanceof int[] cnt
                    && IntStream.range(1, n).allMatch(i -> c[i] != c[i - 1] || (c[i] = (char) IntStream.range(0, k).map(j -> 'A' + j).filter(ch -> ch != c[i - 1] && (i + 1 >= n || ch != c[i + 1])).findFirst().getAsInt()) > 0 && ++cnt[0] > 0)
                    ? cnt[0] + "\n" + new String(c) : ""
            : "");
    }
}
