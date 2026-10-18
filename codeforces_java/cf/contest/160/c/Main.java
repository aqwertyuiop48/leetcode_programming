import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Long.valueOf(s.nextLong() - 1) instanceof Long k
            && IntStream.range(0, n).map(i -> s.nextInt()).sorted().toArray() instanceof int[] a
            && Integer.valueOf(a[(int) (k / n)]) instanceof Integer x
            && Long.valueOf(Arrays.stream(a).filter(v -> v == x).count()) instanceof Long cnt
            && Long.valueOf(Arrays.stream(a).filter(v -> v < x).count()) instanceof Long less
            ? x + " " + a[(int) ((k - less * n) / cnt)]
            : "");
    }
}
