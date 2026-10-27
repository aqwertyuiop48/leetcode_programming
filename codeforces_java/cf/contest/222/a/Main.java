import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            ? IntStream.range(k - 1, n).anyMatch(i -> a[i] != a[k - 1]) ? -1 : IntStream.range(0, k - 1).filter(i -> a[i] != a[k - 1]).map(i -> i + 1).max().orElse(0) : "");
    }
}

