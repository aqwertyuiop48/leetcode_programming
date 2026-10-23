import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toArray(int[][]::new) instanceof int[][] t
            && new int[100001] instanceof int[] c && Arrays.stream(t).allMatch(x -> ++c[x[0]] > 0)
            ? Arrays.stream(t).map(x -> (n - 1 + c[x[1]]) + " " + (n - 1 - c[x[1]])).collect(Collectors.joining("\n")) : "");
    }
}
