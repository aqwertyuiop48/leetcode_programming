import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k && sc.next() instanceof String s
            && IntStream.range(0, n).filter(i -> s.charAt(i) == '0').toArray() instanceof int[] z
            ? IntStream.rangeClosed(0, z.length - 1 - k).map(l -> Integer.valueOf(l + k) instanceof Integer r && Integer.valueOf(Arrays.binarySearch(z, l, r + 1, (z[l] + z[r] + 1) / 2)) instanceof Integer b
                && Integer.valueOf(b >= 0 ? b : -b - 1) instanceof Integer j
                ? Math.min(Math.max(z[j] - z[l], z[r] - z[j]), j > l ? Math.max(z[j - 1] - z[l], z[r] - z[j - 1]) : Integer.MAX_VALUE) : 0).min().getAsInt() : "");
    }
}
