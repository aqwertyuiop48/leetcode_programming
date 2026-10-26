import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && new ArrayDeque<Integer>(IntStream.range(0, s.nextInt()).mapToObj(i -> s.nextInt()).toList()) instanceof ArrayDeque<Integer> a
            && new ArrayDeque<Integer>(IntStream.range(0, s.nextInt()).mapToObj(i -> s.nextInt()).toList()) instanceof ArrayDeque<Integer> b
            && new HashSet<String>() instanceof HashSet<String> seen && new int[]{0} instanceof int[] cnt
            && Stream.generate(() -> 0).takeWhile(z -> !a.isEmpty() && !b.isEmpty() && seen.add(a + "|" + b)).allMatch(z ->
                (Integer) a.poll() instanceof Integer x && (Integer) b.poll() instanceof Integer y && cnt[0]++ >= 0 && (x > y ? a.add(y) && a.add(x) : b.add(x) && b.add(y)))
            ? a.isEmpty() ? cnt[0] + " 2" : b.isEmpty() ? cnt[0] + " 1" : "-1" : "");
    }
}
