import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Integer.valueOf(s.nextInt()) instanceof Integer x
            && Integer.valueOf(s.nextInt()) instanceof Integer y
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, m).map(i -> s.nextInt()).toArray() instanceof int[] b
            && Stream.iterate(new int[]{0, 0}, st -> st[0] < n && st[1] < m, st -> b[st[1]] < a[st[0]] - x ? new int[]{st[0], st[1] + 1} : b[st[1]] > a[st[0]] + y ? new int[]{st[0] + 1, st[1]} : new int[]{st[0] + 1, st[1] + 1})
                .filter(st -> a[st[0]] - x <= b[st[1]] && b[st[1]] <= a[st[0]] + y).map(st -> (st[0] + 1) + " " + (st[1] + 1)).toList() instanceof List<String> pairs
            ? pairs.size() + (pairs.isEmpty() ? "" : "\n" + String.join("\n", pairs))
            : "");
    }
}

