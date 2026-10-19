import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && sc.next() instanceof String s && sc.next() instanceof String t
            && IntStream.range(0, 2 * n).boxed().sorted(Comparator.comparingInt(i -> -(s.charAt(i) + t.charAt(i) - 96))).toList() instanceof List<Integer> o
            && Integer.valueOf(IntStream.range(0, 2 * n).map(r -> r % 2 == 0 ? s.charAt(o.get(r)) - '0' : '0' - t.charAt(o.get(r))).sum()) instanceof Integer d
            ? d > 0 ? "First" : d < 0 ? "Second" : "Draw" : "");
    }
}
