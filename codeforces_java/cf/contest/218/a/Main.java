import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.range(0, 2 * n + 1).map(i -> s.nextInt()).toArray() instanceof int[] y
            && new int[]{k} instanceof int[] left
            && IntStream.iterate(2 * n - 1, i -> i >= 1, i -> i - 2).allMatch(i -> left[0] <= 0 || !(y[i] - 1 > y[i - 1] && y[i] - 1 > y[i + 1]) || (--y[i] >= 0 && --left[0] >= 0 || true))
            ? Arrays.stream(y).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
