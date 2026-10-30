import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt() / 2, s.nextInt() / 2, s.nextInt()}).toArray(int[][]::new) instanceof int[][] c
            ? IntStream.range(0, 2).mapToObj(d -> IntStream.range(0, n).filter(i -> c[i][d] > 0)
                .mapToObj(i -> "(" + c[i][d] + "*((1-abs((t-" + i + ")))+abs((1-abs((t-" + i + "))))))").reduce((a, b) -> "(" + a + "+" + b + ")").orElse("0")).collect(Collectors.joining("\n")) : "");
    }
}
