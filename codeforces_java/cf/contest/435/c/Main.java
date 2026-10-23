import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && new int[n + 1] instanceof int[] y && new int[n + 1] instanceof int[] x && IntStream.rangeClosed(1, n).allMatch(i -> (y[i] = y[i - 1] + (i % 2 == 1 ? 1 : -1) * a[i - 1]) > Integer.MIN_VALUE && (x[i] = x[i - 1] + a[i - 1]) > 0)
            && (Integer) x[n] instanceof Integer w && new int[w] instanceof int[] rowOf && new char[w] instanceof char[] chOf
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.range(0, a[i - 1]).allMatch(t -> (rowOf[x[i - 1] + t] = i % 2 == 1 ? y[i - 1] + t : y[i - 1] - t - 1) > Integer.MIN_VALUE && (chOf[x[i - 1] + t] = i % 2 == 1 ? '/' : (char) 92) > 0))
            ? IntStream.range(0, IntStream.of(y).max().getAsInt() - IntStream.of(y).min().getAsInt()).map(r -> IntStream.of(y).max().getAsInt() - 1 - r).mapToObj(r -> IntStream.range(0, w).mapToObj(c -> rowOf[c] == r ? String.valueOf(chOf[c]) : " ").collect(Collectors.joining())).collect(Collectors.joining("\n")) : "");
    }
}
