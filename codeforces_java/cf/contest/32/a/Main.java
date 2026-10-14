import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nd ->
            System.out.println(
                IntStream.range(0, nd[0]).map(i -> s.nextInt()).toArray() instanceof int[] a
                ? IntStream.range(0, nd[0]).mapToLong(i -> IntStream.range(0, nd[0]).filter(j -> i != j && Math.abs(a[i] - a[j]) <= nd[1]).count()).sum()
                : 0)));
    }
}
