import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(a -> System.out.println(
            IntStream.range(0, a[1]).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toArray(int[][]::new) instanceof int[][] r
            ? IntStream.rangeClosed(1, a[0]).mapToObj(d -> new int[]{d, (int) Arrays.stream(r).filter(p -> p[0] <= d && d <= p[1]).count()}).filter(p -> p[1] != 1).map(p -> p[0] + " " + p[1]).findFirst().orElse("OK")
            : "")));
    }
}




