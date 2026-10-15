import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                ((IntPredicate) x -> x > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(x)).noneMatch(d -> x % d == 0)) instanceof IntPredicate pr
                && Optional.of(n * (n + 1) / 2).get() instanceof Integer sum
                && Optional.of(sum % 2 == 1 && !pr.test(sum) && !pr.test(sum - 2) ? 3 : 0).get() instanceof Integer ex
                && Optional.of(pr.test(sum) ? 0 : IntStream.rangeClosed(2, sum).filter(p -> pr.test(p) && pr.test(sum - ex - p)).findFirst().getAsInt()).get() instanceof Integer p
                && new int[n + 1] instanceof int[] col
                && new int[]{p} instanceof int[] rem
                && IntStream.iterate(n, i -> i >= 1, i -> i - 1).allMatch(i -> (i != ex && i <= rem[0] ? (col[i] = 1) + (rem[0] -= i) : 0) >= 0)
                ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(i == ex ? 3 : col[i] + 1)).collect(Collectors.joining(" "))
                : "-1")));
    }
}


