import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            ? IntStream.rangeClosed(t[0], t[1]).filter(p -> p > 1 && (p < 4 || p % 2 != 0) && IntStream.iterate(3, d -> d * d <= p, d -> d + 2).noneMatch(d -> p % d == 0)).count() : "");
    }
}
