import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && (Integer) s.nextInt() instanceof Integer k
            && IntStream.range(0, n).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] g
            ? IntStream.range(0, m).mapToObj(c -> String.valueOf(IntStream.range(0, n).map(i -> (c - i >= 0 && g[i].charAt(c - i) == 'R' ? 1 : 0) + (c + i < m && g[i].charAt(c + i) == 'L' ? 1 : 0) + (i % 2 == 0 && g[i].charAt(c) == 'U' ? 1 : 0)).sum())).collect(Collectors.joining(" ")) : "");
    }
}
