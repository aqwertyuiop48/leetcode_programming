import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next().toCharArray() instanceof char[] c
            && IntStream.range(0, c.length - 1).filter(i -> (c[i] - '0') % 2 == 0).toArray() instanceof int[] ev
            ? ev.length == 0 ? "-1"
                : (Integer) IntStream.of(ev).filter(i -> c[i] < c[c.length - 1]).findFirst().orElse(ev[ev.length - 1]) instanceof Integer p
                    && (c[c.length - 1] ^= c[p]) >= 0 && (c[p] ^= c[c.length - 1]) >= 0 && (c[c.length - 1] ^= c[p]) >= 0
                    ? new String(c) : ""
            : "");
    }
}
