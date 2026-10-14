import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && new int[n + 1][2] instanceof int[][] st
            && IntStream.range(0, n * (n - 1) / 2 - 1).allMatch(k -> Integer.valueOf(s.nextInt()) instanceof Integer w
                && Integer.valueOf(s.nextInt()) instanceof Integer l && st[w][1]++ + st[w][0]++ + st[l][0]++ >= 0)
            ? IntStream.rangeClosed(1, n).filter(i -> st[i][0] == n - 2).boxed()
                .sorted(Comparator.comparingInt((Integer i) -> -st[i][1])).map(String::valueOf).collect(Collectors.joining(" "))
            : ""));
    }
}

