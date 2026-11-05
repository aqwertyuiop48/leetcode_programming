import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next() != null && ("L" + s.next() + "R") instanceof String t
            && IntStream.range(0, t.length()).filter(i -> t.charAt(i) != '.').toArray() instanceof int[] p
            ? IntStream.range(0, p.length - 1).map(j -> t.charAt(p[j]) == t.charAt(p[j + 1]) ? 0 : t.charAt(p[j]) == 'L' ? p[j + 1] - p[j] - 1 : (p[j + 1] - p[j] - 1) % 2).sum() : 0);
    }
}

