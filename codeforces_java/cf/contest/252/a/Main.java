import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            ? IntStream.range(0, n).map(i -> IntStream.range(i, n).map(j -> IntStream.rangeClosed(i, j).map(k -> a[k]).reduce(0, (x, y) -> x ^ y)).max().getAsInt()).max().getAsInt() : "");
    }
}
