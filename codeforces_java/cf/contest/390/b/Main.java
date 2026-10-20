import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            ? IntStream.range(0, n).mapToLong(i -> Integer.valueOf(s.nextInt()) instanceof Integer b
                ? b >= 2 && b <= 2 * a[i] ? (long) (b / 2) * (b - b / 2) : -1L : 0L).sum() : "");
    }
}
