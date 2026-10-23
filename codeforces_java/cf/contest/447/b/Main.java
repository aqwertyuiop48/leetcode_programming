import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next() instanceof String t && (Integer) s.nextInt() instanceof Integer k && IntStream.range(0, 26).map(i -> s.nextInt()).toArray() instanceof int[] w
            ? IntStream.range(0, t.length()).mapToLong(i -> (i + 1L) * w[t.charAt(i) - 'a']).sum() + (long) IntStream.of(w).max().getAsInt() * ((long) (t.length() + 1 + t.length() + k) * k / 2) : 0);
    }
}
