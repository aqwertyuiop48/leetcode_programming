import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).mapToObj(j -> s.next()).collect(Collectors.joining())).toArray(String[]::new) instanceof String[] r
            && new int[]{n} instanceof int[] sz
            && (IntStream.range(0, 20).allMatch(t -> sz[0] % 2 == 0 && IntStream.range(0, sz[0] / 2).allMatch(i -> r[i].equals(r[sz[0] - 1 - i])) && (sz[0] /= 2) > 0) || true)
            ? sz[0] : 0);
    }
}
