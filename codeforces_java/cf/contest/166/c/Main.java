import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer x
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            ? IntStream.rangeClosed(0, 2 * n + 2).filter(e -> IntStream.concat(Arrays.stream(a), IntStream.generate(() -> x).limit(e)).sorted().toArray() instanceof int[] b && b[(b.length - 1) / 2] == x).findFirst().getAsInt()
            : 0);
    }
}

