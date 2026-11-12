import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).map(j -> s.nextInt()).toArray()).toArray(int[][]::new) instanceof int[][] d
            && IntStream.range(0, n).allMatch(k -> IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j -> (d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j])) >= 0 || true)))
            ? Arrays.stream(d).flatMapToInt(Arrays::stream).max().getAsInt()
            : "");
    }
}
