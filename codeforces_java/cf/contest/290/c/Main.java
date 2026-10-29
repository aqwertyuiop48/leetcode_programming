import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && IntStream.rangeClosed(1, n).mapToObj(i -> new long[]{IntStream.range(0, i).map(j -> a[j]).sum(), i}).reduce((x, y) -> x[0] * y[1] > y[0] * x[1] ? x : y) instanceof Optional<long[]> o
            ? String.format("%.6f", (double) o.get()[0] / o.get()[1]) : "");
    }
}

