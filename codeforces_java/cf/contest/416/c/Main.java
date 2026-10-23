import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt(), i + 1}).sorted((x, y) -> y[1] - x[1]).toArray(int[][]::new) instanceof int[][] rq
            && (Integer) s.nextInt() instanceof Integer k && IntStream.range(0, k).map(i -> s.nextInt()).toArray() instanceof int[] cap && new boolean[k] instanceof boolean[] used
            && Arrays.stream(rq).map(q -> IntStream.range(0, k).filter(t -> !used[t] && cap[t] >= q[0]).boxed().min(Comparator.comparingInt(t -> cap[t])).orElse(-1) instanceof Integer t && t >= 0 && (used[t] = true)
                ? new int[]{q[2], t + 1, q[1]} : null).filter(Objects::nonNull).toList() instanceof List<int[]> res
            ? res.size() + " " + res.stream().mapToInt(x -> x[2]).sum() + res.stream().map(x -> "\n" + x[0] + " " + x[1]).collect(Collectors.joining()) : "");
    }
}
