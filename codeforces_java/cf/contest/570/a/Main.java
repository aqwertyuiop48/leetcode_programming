import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && (Integer) s.nextInt() instanceof Integer n
            && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, m).map(i -> IntStream.range(0, n).map(j -> s.nextInt()).toArray() instanceof int[] r
                ? IntStream.range(0, n).boxed().max(Comparator.comparingInt((Integer j) -> r[j]).thenComparing(Comparator.reverseOrder())).get() : 0).toArray() instanceof int[] w
            ? 1 + IntStream.range(0, n).boxed().max(Comparator.comparingLong((Integer j) -> Arrays.stream(w).filter(x -> x == j).count()).thenComparing(Comparator.reverseOrder())).get()
            : 0);
    }
}
