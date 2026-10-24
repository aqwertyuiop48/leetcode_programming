import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).map(j -> s.nextInt()).toArray()).map(l -> Optional.of(new int[n + 1]).filter(p -> IntStream.range(0, n).allMatch(q -> (p[l[q]] = q) >= 0)).get()).toArray(int[][]::new) instanceof int[][] fp
            && IntStream.range(0, n).map(j -> s.nextInt()).toArray() instanceof int[] al
            && new int[n + 1] instanceof int[] ra
            && IntStream.range(0, n).allMatch(i -> (ra[al[i]] = i) >= 0)
            ? IntStream.range(0, n).mapToObj(i -> IntStream.rangeClosed(1, n).filter(m -> m != 1 || i != 0).boxed()
                    .min(Comparator.comparingInt(m -> fp[i][IntStream.rangeClosed(1, m).filter(c -> c != i + 1).boxed().min(Comparator.comparingInt(c -> ra[c])).get()])).get())
                .map(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }


}
