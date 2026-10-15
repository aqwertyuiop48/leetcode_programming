import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new int[]{sc.nextInt(), sc.nextInt()}).ifPresent(nm ->
            System.out.println(
                new int[]{1, nm[0]} instanceof int[] r
                && IntStream.range(0, nm[1]).allMatch(i -> sc.next() instanceof String t1 && sc.next() instanceof String t2 && sc.next() instanceof String d && sc.next() instanceof String t3
                    && Integer.valueOf(sc.nextInt()) instanceof Integer x
                    && (d.equals("left") ? (r[1] = Math.min(r[1], x - 1)) >= -1000 : (r[0] = Math.max(r[0], x + 1)) >= -1000))
                ? (r[0] > r[1] ? -1 : r[1] - r[0] + 1) : 0)));
    }
}

