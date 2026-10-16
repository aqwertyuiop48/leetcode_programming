import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()}).ifPresent(v ->
            System.out.println(
                IntStream.range(0, 3).boxed().sorted(Comparator.<Integer>comparingInt(i -> -v[i]).thenComparingInt(i -> i)).toList() instanceof List<Integer> order
                ? IntStream.range(0, 3).mapToObj(i -> String.valueOf(order.indexOf(i) + 1)).collect(Collectors.joining(" "))
                : "")));
    }
}



