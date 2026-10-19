import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).filter(x -> x != 0).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting())).values() instanceof Collection<Long> c
            ? c.stream().anyMatch(v -> v > 2) ? -1 : c.stream().filter(v -> v == 2).count() : "");
    }
}
