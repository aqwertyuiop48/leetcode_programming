import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.println(
            sc.next() instanceof String a
            && sc.next() instanceof String b
            && new int[] {1, 0} instanceof int[] st
            ? b.chars().allMatch(c ->
                (a.indexOf(c, st[1]) >= 0 || ((st[0]++ | (st[1] = 0)) >= 0))
                && (st[1] = a.indexOf(c, st[1]) + 1) > 0)
                ? st[0]
                : -1
            : -1));
    }
}



