import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] t
            ? IntStream.rangeClosed(1, n / 3).filter(d -> n % d == 0).boxed().flatMapToInt(d -> IntStream.range(0, d).map(o -> IntStream.iterate(o, i -> i < n, i -> i + d).map(i -> t[i]).sum())).max().getAsInt()
            : 0);
    }
}
