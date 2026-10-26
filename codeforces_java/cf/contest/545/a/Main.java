import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).map(j -> s.nextInt()).toArray()).toArray(int[][]::new) instanceof int[][] a
            && IntStream.range(0, n).filter(i -> IntStream.range(0, n).filter(j -> j != i).noneMatch(j -> a[i][j] == 1 || a[i][j] == 3 || a[j][i] == 2 || a[j][i] == 3)).boxed().toList() instanceof List<Integer> g
            ? g.size() + "\n" + g.stream().map(i -> String.valueOf(i + 1)).collect(Collectors.joining(" ")) : "");
    }
}
