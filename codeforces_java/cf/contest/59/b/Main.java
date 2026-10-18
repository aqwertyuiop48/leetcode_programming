import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
                && Integer.valueOf(Arrays.stream(a).sum()) instanceof Integer sum
                ? (sum % 2 == 1 ? sum : Arrays.stream(a).filter(x -> x % 2 == 1).min().stream().map(m -> sum - m).findFirst().orElse(0))
                : 0)));
    }
}




