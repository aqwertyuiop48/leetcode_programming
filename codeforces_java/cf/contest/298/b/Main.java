import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer t && new int[]{sc.nextInt(), sc.nextInt()} instanceof int[] cur
            && new int[]{sc.nextInt(), sc.nextInt()} instanceof int[] e && sc.next() instanceof String w
            ? IntStream.range(0, t).filter(i -> (w.charAt(i) == 'E' && cur[0] < e[0] ? ++cur[0] : w.charAt(i) == 'W' && cur[0] > e[0] ? --cur[0] : w.charAt(i) == 'N' && cur[1] < e[1] ? ++cur[1] : w.charAt(i) == 'S' && cur[1] > e[1] ? --cur[1] : 0) > Integer.MIN_VALUE
                && cur[0] == e[0] && cur[1] == e[1]).map(i -> i + 1).boxed().findFirst().map(i -> (Object) i).orElse(-1) : "");
    }
}
