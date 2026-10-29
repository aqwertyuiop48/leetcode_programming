import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && new int[n + 2] instanceof int[] a
            && IntStream.rangeClosed(1, n).allMatch(i -> (a[i] = s.nextInt()) >= 0) && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, m).allMatch(q -> Integer.valueOf(s.nextInt()) instanceof Integer x && Integer.valueOf(s.nextInt()) instanceof Integer y
                && (a[x - 1] += y - 1) >= 0 && (a[x + 1] += a[x] - y) >= 0 && (a[x] = 0) == 0)
            ? IntStream.rangeClosed(1, n).mapToObj(i -> "" + a[i]).collect(Collectors.joining("\n")) : "");
    }
}

