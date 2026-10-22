import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && new boolean[n + 1] instanceof boolean[] comp && new boolean[n + 1] instanceof boolean[] used && new ArrayList<String>() instanceof ArrayList<String> res
            && IntStream.rangeClosed(2, n).filter(i -> !comp[i]).allMatch(i -> IntStream.iterate(2 * i, j -> j <= n, j -> j + i).allMatch(j -> (comp[j] = true)))
            && IntStream.iterate(n / 2, p -> p >= 3, p -> p - 1).allMatch(p -> comp[p] || IntStream.rangeClosed(1, n / p).map(i -> i * p).filter(x -> !used[x]).toArray() instanceof int[] l0
                && (l0.length % 2 == 0 ? l0 : Arrays.stream(l0).filter(x -> x != 2 * p).toArray()) instanceof int[] l
                && IntStream.range(0, l.length / 2).allMatch(i -> (used[l[2 * i]] = true) && (used[l[2 * i + 1]] = true) && res.add(l[2 * i + 1] + " " + l[2 * i])))
            && IntStream.rangeClosed(1, n / 2).map(i -> 2 * i).filter(x -> !used[x]).toArray() instanceof int[] ev
            && IntStream.range(0, ev.length / 2).allMatch(i -> res.add(ev[2 * i] + " " + ev[2 * i + 1]))
            ? res.size() + (res.isEmpty() ? "" : "\n" + String.join("\n", res)) : "");
    }
}
