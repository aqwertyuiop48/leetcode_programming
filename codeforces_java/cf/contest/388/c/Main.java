import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> IntStream.generate(s::nextInt).limit(s.nextInt()).toArray()).toList() instanceof List<int[]> ps
            && Integer.valueOf(ps.stream().mapToInt(a -> Arrays.stream(a, 0, a.length / 2).sum()).sum()) instanceof Integer top
            && Integer.valueOf(ps.stream().mapToInt(a -> Arrays.stream(a, a.length - a.length / 2, a.length).sum()).sum()) instanceof Integer bot
            && ps.stream().filter(a -> a.length % 2 == 1).mapToInt(a -> a[a.length / 2]).boxed().sorted(Comparator.reverseOrder()).toList() instanceof List<Integer> mid
            && Integer.valueOf(IntStream.range(0, mid.size()).filter(i -> i % 2 == 0).map(mid::get).sum()) instanceof Integer cm
            && Integer.valueOf(mid.stream().mapToInt(v -> v).sum()) instanceof Integer tm
            ? (top + cm) + " " + (bot + tm - cm) : "");
    }
}
