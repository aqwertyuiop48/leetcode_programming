import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).mapToLong(i -> s.nextLong()).toArray() instanceof long[] x
            ? IntStream.iterate(0, i -> i < n - 1 - i, i -> i + m).mapToLong(i -> 2 * (x[n - 1 - i] - x[i])).sum() : 0);
    }
}
