import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> new int[]{s.nextInt(), s.nextInt()} instanceof int[] nm
                ? IntStream.range(0, nm[0]).mapToObj(i -> s.next()).toArray(String[]::new) : null)
            .map(g -> IntStream.range(0, g.length).mapToLong(i -> IntStream.range(0, g[i].length())
                .filter(j -> g[i].charAt(j) == 'W'
                    && (i > 0 && g[i - 1].charAt(j) == 'P' || i + 1 < g.length && g[i + 1].charAt(j) == 'P'
                        || j > 0 && g[i].charAt(j - 1) == 'P' || j + 1 < g[i].length() && g[i].charAt(j + 1) == 'P'))
                .count()).sum())
            .ifPresent(System.out::println);
    }
}
