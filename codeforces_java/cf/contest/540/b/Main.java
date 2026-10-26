import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k && (Integer) s.nextInt() instanceof Integer p
            && (Integer) s.nextInt() instanceof Integer x && (Integer) s.nextInt() instanceof Integer y
            && IntStream.range(0, k).map(i -> s.nextInt()).toArray() instanceof int[] a
            && (Integer) Math.max(0, (n + 1) / 2 - (int) IntStream.of(a).filter(v -> v >= y).count()) instanceof Integer need
            ? need > n - k || IntStream.of(a).sum() + need * y + (n - k - need) > x ? "-1"
                : Stream.concat(Stream.generate(() -> "" + y).limit(need), Stream.generate(() -> "1").limit(n - k - need)).collect(Collectors.joining(" ")) : "");
    }
}
