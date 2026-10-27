import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && new int[n + 1] instanceof int[] spf
            && IntStream.rangeClosed(2, n).filter(i -> spf[i] == 0).allMatch(i -> IntStream.iterate(i, j -> j <= n, j -> j + i).allMatch(j -> spf[j] != 0 || (spf[j] = i) > 0))
            && new int[n + 1] instanceof int[] owner
            && new boolean[n + 1] instanceof boolean[] on
            ? Stream.generate(() -> s.next() instanceof String op && Integer.valueOf(s.nextInt()) instanceof Integer i
                    && IntStream.iterate(i, x -> x > 1, x -> x / spf[x]).map(x -> spf[x]).distinct().toArray() instanceof int[] ps
                ? op.equals("+")
                    ? on[i] ? "Already on"
                    : Arrays.stream(ps).filter(p -> owner[p] != 0).findFirst().stream().mapToObj(p -> "Conflict with " + owner[p]).findFirst()
                        .orElseGet(() -> Arrays.stream(ps).allMatch(p -> (owner[p] = i) > 0) && (on[i] = true) ? "Success" : "")
                    : !on[i] ? "Already off"
                    : Arrays.stream(ps).allMatch(p -> (owner[p] = 0) == 0) && !(on[i] = false) ? "Success" : ""
                : "").limit(m).collect(Collectors.joining("\n"))
            : "");
    }
}

