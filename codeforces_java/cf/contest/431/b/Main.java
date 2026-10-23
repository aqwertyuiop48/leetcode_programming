import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && IntStream.range(0, 25).map(i -> s.nextInt()).toArray() instanceof int[] g
            ? IntStream.range(0, 3125).mapToObj(c -> new int[]{c % 5, c / 5 % 5, c / 25 % 5, c / 125 % 5, c / 625}).filter(p -> IntStream.of(p).distinct().count() == 5)
                .mapToInt(p -> IntStream.range(0, 4).map(i -> (i < 2 ? 1 : 2) * (g[p[i] * 5 + p[i + 1]] + g[p[i + 1] * 5 + p[i]])).sum()).max().getAsInt() : 0);
    }
}
