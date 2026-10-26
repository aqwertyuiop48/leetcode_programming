import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next().toCharArray() instanceof char[] a && s.next() instanceof String t
            && IntStream.iterate(a.length - 1, i -> i >= 0, i -> i - 1).filter(i -> a[i] != 'z').findFirst() instanceof OptionalInt p
            ? p.isPresent() && IntStream.range(0, a.length).allMatch(i -> i < p.getAsInt() || i == p.getAsInt() && (a[i]++ > 0) || i > p.getAsInt() && (a[i] = 'a') > 0)
                && new String(a).compareTo(t) < 0 ? new String(a) : "No such string" : "");
    }
}
