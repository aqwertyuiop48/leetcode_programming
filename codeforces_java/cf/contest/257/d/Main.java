import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> s.nextLong()).toArray() instanceof long[] a && new long[]{0} instanceof long[] sum && new char[n] instanceof char[] r
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (r[i] = sum[0] > 0 ? '-' : '+') != 0 && (sum[0] += sum[0] > 0 ? -a[i] : a[i]) > Long.MIN_VALUE)
            ? new String(r) : "");
    }
}
