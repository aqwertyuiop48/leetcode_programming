import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).boxed().sorted(Comparator.reverseOrder()).toList() instanceof List<Integer> r
            ? String.format("%.10f", Math.PI * IntStream.range(0, n).mapToLong(i -> (i % 2 == 0 ? 1L : -1L) * r.get(i) * r.get(i)).sum())
            : "");
    }
}
