import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s && sc.next() instanceof String t
            && new int[128] instanceof int[] cs && new int[128] instanceof int[] ct
            && s.chars().allMatch(c -> ++cs[c] > 0) && t.chars().allMatch(c -> ++ct[c] > 0)
            && (Integer) IntStream.range(0, 128).map(c -> Math.min(cs[c], ct[c])).sum() instanceof Integer yay
            && IntStream.range(0, 128).allMatch(c -> (Integer) Math.min(cs[c], ct[c]) instanceof Integer m && (cs[c] -= m) >= 0 && (ct[c] -= m) >= 0)
            ? yay + " " + IntStream.range(0, 128).filter(c -> Character.isLowerCase(c) || Character.isUpperCase(c)).map(c -> Math.min(cs[c], ct[Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c)])).sum() : "");
    }
}
