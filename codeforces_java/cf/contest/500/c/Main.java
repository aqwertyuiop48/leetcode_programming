import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] w
            && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] last
            ? IntStream.range(0, m).map(i ->
                Integer.valueOf(sc.nextInt() - 1) instanceof Integer b
                && Integer.valueOf(IntStream.range(0, n).filter(x -> x != b && last[x] > last[b]).map(x -> w[x]).sum()) instanceof Integer cost
                && (last[b] = i) >= 0
                    ? cost
                    : 0).sum()
            : 0);
    }
}
