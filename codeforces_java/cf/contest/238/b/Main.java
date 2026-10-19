import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Long.valueOf(s.nextLong()) instanceof Long h
            && IntStream.range(0, n).mapToLong(i -> s.nextLong()).toArray() instanceof long[] a
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong((Integer i) -> a[i]).thenComparingInt(i -> i)).mapToInt(Integer::intValue).toArray() instanceof int[] o
            && Arrays.stream(o).mapToLong(i -> a[i]).toArray() instanceof long[] b
            && Long.valueOf(b[n - 1] + b[n - 2] - (b[0] + b[1])) instanceof Long g1
            && Long.valueOf(n < 3 ? Long.MAX_VALUE : Math.max(b[n - 1] + b[n - 2], b[0] + b[n - 1] + h) - Math.min(b[0] + b[1] + h, b[1] + b[2])) instanceof Long g2
            ? g1 <= g2 ? g1 + "\n" + "2 ".repeat(n).trim() : g2 + "\n" + IntStream.range(0, n).mapToObj(i -> i == o[0] ? "1" : "2").collect(Collectors.joining(" ")) : "");
    }
}
