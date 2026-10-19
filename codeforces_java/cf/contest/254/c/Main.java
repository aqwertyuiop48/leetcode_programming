import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next().toCharArray() instanceof char[] s && sc.next().toCharArray() instanceof char[] t
            && new int[26] instanceof int[] sur && new int[26] instanceof int[] rem
            && IntStream.range(0, s.length).allMatch(i -> ++sur[s[i] - 'A'] > -100000000 && ++rem[s[i] - 'A'] > 0 && --sur[t[i] - 'A'] < 100000000)
            && new int[26] instanceof int[] need
            && IntStream.range(0, 26).allMatch(c -> (need[c] = Math.max(0, -sur[c])) >= 0 && (sur[c] = Math.max(0, sur[c])) >= 0)
            ? Arrays.stream(sur).sum() + "\n" + IntStream.range(0, s.length).mapToObj(i -> Integer.valueOf(s[i] - 'A') instanceof Integer c
                && Integer.valueOf(IntStream.range(0, 26).filter(d -> need[d] > 0).findFirst().orElse(99)) instanceof Integer d
                && Integer.valueOf(rem[c]--) instanceof Integer left
                ? (sur[c] > 0 && (d < c || left == sur[c]) ? (char) ('A' + d) + "" + (--sur[c] < 100 && --need[d] < 100 ? "" : "") : String.valueOf(s[i])) : "").collect(Collectors.joining()) : "");
    }
}
