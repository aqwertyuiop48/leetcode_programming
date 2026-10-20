import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next() instanceof String t && new int[2] instanceof int[] st
            && t.chars().map(c -> c == 'M' ? ++st[0] : st[0] > 0 ? st[1] = Math.max(st[1] + 1, st[0]) : 0).sum() >= 0 ? st[1] : "");
    }
}
