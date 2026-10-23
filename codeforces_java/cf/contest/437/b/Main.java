import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer sum && (Integer) s.nextInt() instanceof Integer lim && new int[]{sum} instanceof int[] rem
            && IntStream.rangeClosed(1, lim).map(i -> lim + 1 - i).filter(i -> (i & -i) <= rem[0] && (rem[0] -= i & -i) >= 0).boxed().toList() instanceof List<Integer> r
            ? rem[0] != 0 ? "-1" : r.size() + "\n" + r.stream().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
