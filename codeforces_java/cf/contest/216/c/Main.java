import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && new int[n + m + 2] instanceof int[] h && new int[n + m + 2] instanceof int[] p
            && IntStream.rangeClosed(1, n + m).allMatch(t -> Integer.valueOf(Math.max(0, k - (p[t - 1] - p[Math.max(0, t - n)]))) instanceof Integer add
                && (h[t] = add + (p[t - 1] + add - p[Math.max(0, t - n + 1)] == 0 ? 1 : 0)) >= 0 && (p[t] = p[t - 1] + h[t]) >= 0)
            ? n < 2 ? "-1" : p[n + m] + "\n" + IntStream.rangeClosed(1, n + m).boxed().flatMap(t -> Collections.nCopies(h[t], t).stream()).map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
