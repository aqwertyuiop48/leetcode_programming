import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && IntStream.range(0, 4).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] t
            && IntStream.range(0, 4).filter(i -> IntStream.range(0, 4).filter(j -> j != i).allMatch(j -> t[i].length() >= 2 * t[j].length() - 2) || IntStream.range(0, 4).filter(j -> j != i).allMatch(j -> 2 * t[i].length() - 2 <= t[j].length())).toArray() instanceof int[] g
            ? g.length == 1 ? "ABCD".charAt(g[0]) : 'C' : 'C');
    }
}
