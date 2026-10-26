import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer n && sc.next() instanceof String s && sc.next() instanceof String t
            && (Integer) IntStream.range(0, n).filter(i -> s.charAt(i) != t.charAt(i)).min().getAsInt() instanceof Integer l
            && (Integer) IntStream.range(0, n).filter(i -> s.charAt(i) != t.charAt(i)).max().getAsInt() instanceof Integer r
            ? (s.substring(l + 1, r + 1).equals(t.substring(l, r)) ? 1 : 0) + (t.substring(l + 1, r + 1).equals(s.substring(l, r)) ? 1 : 0) : 0);
    }
}
