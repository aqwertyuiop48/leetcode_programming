import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).map(i -> (s.nextInt() + m - 1) / m).toArray() instanceof int[] t
            ? IntStream.range(0, n).boxed().max(Comparator.comparingInt((Integer i) -> t[i]).thenComparing(Comparator.naturalOrder())).get() + 1 : 0);
    }
}
