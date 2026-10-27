import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toArray(int[][]::new) instanceof int[][] t
                && IntStream.range(0, n).map(i -> (int) IntStream.range(0, n).filter(j -> j != i && t[i][0] < t[j][1] && t[j][0] < t[i][1]).count()).toArray() instanceof int[] deg
                && (Integer) (IntStream.of(deg).sum() / 2) instanceof Integer total
                && IntStream.range(0, n).filter(i -> deg[i] == total).mapToObj(i -> String.valueOf(i + 1)).toList() instanceof List<String> res
                ? res.size() + "\n" + String.join(" ", res)
                : "")));
    }
}





