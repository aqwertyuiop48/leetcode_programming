import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer f
            && IntStream.range(0, f).map(i -> sc.nextInt()).boxed().collect(Collectors.toSet()) instanceof Set<Integer> fav
            && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> sc.next() instanceof String nm && IntStream.range(0, sc.nextInt()).map(j -> sc.nextInt()).toArray() instanceof int[] ids
                && Long.valueOf(Arrays.stream(ids).filter(x -> fav.contains(x)).count()) instanceof Long a
                && Long.valueOf(Arrays.stream(ids).filter(x -> x > 0 && !fav.contains(x)).count()) instanceof Long b
                && Long.valueOf(Arrays.stream(ids).filter(x -> x == 0).count()) instanceof Long u
                ? new long[]{a + Math.min(u, f - a), a + Math.max(0, u - ((n - f) - b))} : null).toList() instanceof List<long[]> rg
            ? IntStream.range(0, m).mapToObj(i -> Long.valueOf(IntStream.range(0, m).filter(j -> j != i).mapToLong(j -> rg.get(j)[0]).max().orElse(-1)) instanceof Long othersMax
                && Long.valueOf(IntStream.range(0, m).filter(j -> j != i).mapToLong(j -> rg.get(j)[1]).max().orElse(-1)) instanceof Long othersMin
                ? rg.get(i)[1] >= othersMax ? "0" : rg.get(i)[0] < othersMin ? "1" : "2" : "").collect(Collectors.joining("\n")) : "");
    }
}
