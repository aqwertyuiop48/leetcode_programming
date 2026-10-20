import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s
            ? IntStream.rangeClosed('A', 'Z').map(ch -> new int[]{-1} instanceof int[] st
                ? (int) IntStream.range(0, s.length()).filter(i -> s.charAt(i) == ch && i % 2 != st[0] && (st[0] = i % 2) >= 0).count() : 0).max().getAsInt() : "");
    }
}
