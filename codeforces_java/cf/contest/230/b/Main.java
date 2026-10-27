import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && new boolean[1000002] instanceof boolean[] comp
            && IntStream.rangeClosed(2, 1000).filter(i -> !comp[i]).allMatch(i -> IntStream.iterate(i * i, j -> j <= 1000001, j -> j + i).allMatch(j -> (comp[j] = true)))
            ? IntStream.range(0, n).mapToObj(i -> Long.valueOf(sc.nextLong()) instanceof Long x && Long.valueOf(Math.round(Math.sqrt(x))) instanceof Long r
                && r * r == x && r >= 2 && !comp[r.intValue()] ? "YES" : "NO").collect(Collectors.joining("\n")) : "");
    }
}

