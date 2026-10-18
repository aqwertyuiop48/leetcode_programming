import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] c
            ? IntStream.range(0, n).boxed().collect(Collectors.groupingBy(i -> c[i])).values().stream().mapToInt(pos -> new int[]{0} instanceof int[] l
                ? IntStream.range(0, pos.size()).map(r -> (l[0] = IntStream.iterate(l[0], x -> true, x -> x + 1).filter(x -> pos.get(r) - pos.get(x) - (r - x) <= k).findFirst().getAsInt()) >= 0 ? r - l[0] + 1 : 0).max().getAsInt() : 0).max().getAsInt()
            : 0);
    }
}
