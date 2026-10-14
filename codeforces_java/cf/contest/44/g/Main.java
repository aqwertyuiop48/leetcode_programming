import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> System.out.println(
            IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()}).toArray(int[][]::new) instanceof int[][] p
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt((Integer i) -> p[i][4])).toList() instanceof List<Integer> o
            && new boolean[n] instanceof boolean[] dead
            ? IntStream.range(0, s.nextInt()).mapToObj(k -> new int[]{s.nextInt(), s.nextInt()}).map(q -> o.stream().filter(i -> !dead[i] && p[i][0] <= q[0] && q[0] <= p[i][1] && p[i][2] <= q[1] && q[1] <= p[i][3]).findFirst().map(i -> (dead[i] = true) ? i + 1 : 0).orElse(0)).map(String::valueOf).collect(Collectors.joining("\n"))
            : "")));
    }
}
