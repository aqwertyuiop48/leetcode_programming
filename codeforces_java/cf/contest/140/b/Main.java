import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> IntStream.range(0, n).map(j -> s.nextInt()).toArray()[0]).toArray() instanceof int[] fav
            && new int[n + 1] instanceof int[] rank
            && IntStream.range(0, n).allMatch(i -> (rank[s.nextInt()] = i) >= 0)
            ? IntStream.range(0, n).map(i -> fav[i] != i + 1
                    && IntStream.rangeClosed(1, fav[i]).filter(j -> j != i + 1).boxed().min(Comparator.comparingInt(j -> rank[j])).get() == fav[i]
                ? fav[i] : n).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}
