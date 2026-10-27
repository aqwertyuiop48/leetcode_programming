import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer v
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] b
            ? Math.min(v, IntStream.range(0, n).mapToDouble(i -> (double) b[i] / a[i]).min().getAsDouble() * Arrays.stream(a).sum()) : 0.0));
    }
}





