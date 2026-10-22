import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, n).map(i -> s.nextInt()).sorted().toArray() instanceof int[] a
            && IntStream.range(0, m).map(i -> s.nextInt()).sorted().toArray() instanceof int[] b
            && new int[1] instanceof int[] j
            ? n - Arrays.stream(a).filter(x -> IntStream.iterate(0, z -> j[0] < m && b[j[0]] < x, z -> z + 1).allMatch(z -> ++j[0] >= 0) && j[0] < m && ++j[0] > 0).count() : "");
    }
}
