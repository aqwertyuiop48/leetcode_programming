import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] a
            ? IntStream.range(1, n - 1)
                .map(k -> IntStream.range(0, n - 1).map(i -> i == k - 1 ? a[k + 1] - a[k - 1] : i == k ? 0 : a[i + 1] - a[i]).max().getAsInt())
                .min().getAsInt()
            : 0);
    }
}
