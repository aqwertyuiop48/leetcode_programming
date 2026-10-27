import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            (Integer) new Scanner(System.in).nextInt() instanceof Integer n
            && (Integer) IntStream.rangeClosed(2, 200000).filter(k -> (long) k * (k - 1) / 2 <= n).max().getAsInt() instanceof Integer k
            && IntStream.rangeClosed(2, k).boxed().flatMap(j -> IntStream.range(1, j).mapToObj(i -> new int[]{i, j})).toArray(int[][]::new) instanceof int[][] pairs
            ? k + "\n" + IntStream.rangeClosed(1, k)
                .mapToObj(day -> IntStream.range(0, pairs.length)
                    .filter(h -> pairs[h][0] == day || pairs[h][1] == day)
                    .mapToObj(h -> String.valueOf(h + 1)).collect(Collectors.joining(" ")))
                .collect(Collectors.joining("\n"))
            : "");
    }
}

