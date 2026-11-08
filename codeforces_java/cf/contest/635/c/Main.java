import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long s && Long.valueOf(sc.nextLong()) instanceof Long x
            ? (s < x || (s - x) % 2 != 0 || (((s - x) / 2) & x) != 0 ? 0L : (1L << Long.bitCount(x)) - (s == x ? 2 : 0))
            : 0L);
    }
}
