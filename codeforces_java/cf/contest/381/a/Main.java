import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a && new int[]{0, n - 1} instanceof int[] st && new long[2] instanceof long[] sum
            && IntStream.range(0, n).allMatch(i -> (sum[i % 2] += a[st[0]] > a[st[1]] ? a[st[0]++] : a[st[1]--]) > 0)
            ? sum[0] + " " + sum[1] : "");
    }
}
