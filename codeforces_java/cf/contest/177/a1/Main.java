import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).map(j -> s.nextInt()).toArray()).toList() instanceof List<int[]> g
            ? IntStream.range(0, n).map(i -> IntStream.range(0, n).filter(j -> i == j || i + j == n - 1 || i == n / 2 || j == n / 2).map(j -> g.get(i)[j]).sum()).sum()
            : 0);
    }
}
