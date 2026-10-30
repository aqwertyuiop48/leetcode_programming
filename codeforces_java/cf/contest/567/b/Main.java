import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> s.next() + " " + s.next()).toArray(String[]::new) instanceof String[] e
            && new HashSet<String>() instanceof HashSet<String> seen
            && (Integer) (int) IntStream.range(0, n).filter(i -> seen.add(e[i].substring(2)) && e[i].charAt(0) == '-').count() instanceof Integer init
            && new int[]{init} instanceof int[] cur
            ? Math.max(init, IntStream.range(0, n).map(i -> cur[0] += e[i].charAt(0) == '+' ? 1 : -1).max().getAsInt())
            : 0);
    }
}
