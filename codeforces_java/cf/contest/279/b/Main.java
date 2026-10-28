import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Long.valueOf(s.nextLong()) instanceof Long t
            && new long[n + 1] instanceof long[] pre && IntStream.range(0, n).allMatch(i -> (pre[i + 1] = pre[i] + s.nextInt()) > 0)
            ? IntStream.range(0, n).map(i -> Integer.valueOf(Arrays.binarySearch(pre, pre[i] + t)) instanceof Integer ix ? (ix >= 0 ? ix : -ix - 2) - i : 0).max().getAsInt() : "");
    }
}
