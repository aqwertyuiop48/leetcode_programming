import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && (Integer) s.nextInt() instanceof Integer n
            ? IntStream.range(0, n).mapToObj(i -> s.nextInt()).collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .values().stream().mapToLong(c -> c / 2).sum() / 2
            : 0L);
    }
}

