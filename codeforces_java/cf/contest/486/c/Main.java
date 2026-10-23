import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt() - 1) instanceof Integer p0
            && Integer.valueOf(Math.min(p0, n - 1 - p0)) instanceof Integer p
            && sc.next() instanceof String s
            && IntStream.range(0, n / 2).filter(i -> s.charAt(i) != s.charAt(n - 1 - i)).toArray() instanceof int[] mis
            ? mis.length == 0
                ? 0
                : IntStream.of(mis).map(i -> Math.min(Math.abs(s.charAt(i) - s.charAt(n - 1 - i)), 26 - Math.abs(s.charAt(i) - s.charAt(n - 1 - i)))).sum()
                    + mis[mis.length - 1] - mis[0] + Math.min(Math.abs(p - mis[0]), Math.abs(p - mis[mis.length - 1]))
            : -1);
    }
}
