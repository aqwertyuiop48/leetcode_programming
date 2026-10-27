import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            Optional.of(sc.next()).ifPresent(s ->
                Optional.of(sc.next()).ifPresent(p ->
                    System.out.println(
                        new int[26] instanceof int[] pc
                        && new int[26] instanceof int[] cnt
                        && new int[2] instanceof int[] st
                        && p.chars().allMatch(ch -> ++pc[ch - 'a'] > 0)
                        && IntStream.range(0, s.length()).allMatch(i ->
                            Integer.valueOf(s.charAt(i) - 'a') instanceof Integer a
                            && (a < 0 || ++cnt[a] != pc[a] + 1 || ++st[0] > 0)
                            && (i < p.length()
                                || (Integer.valueOf(s.charAt(i - p.length()) - 'a') instanceof Integer b
                                    && (b < 0 || cnt[b]-- != pc[b] + 1 || --st[0] >= 0)))
                            && (i < p.length() - 1 || st[0] != 0 || ++st[1] > 0))
                        ? st[1]
                        : -1))));
    }
}

