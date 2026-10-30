import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println((Integer) new Scanner(System.in).nextInt() instanceof Integer n
            && IntStream.rangeClosed(2, n).filter(p -> IntStream.rangeClosed(2, (int) Math.sqrt(p)).noneMatch(d -> p % d == 0))
                .flatMap(p -> IntStream.iterate(p, q -> q <= n, q -> q * p)).boxed().collect(Collectors.toList()) instanceof List<Integer> l
            ? l.size() + "\n" + l.stream().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
