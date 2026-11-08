import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Long.valueOf(t[0]) instanceof Long s && Long.valueOf(t[1]) instanceof Long x && Long.valueOf(s - x) instanceof Long d
            ? (d < 0 || d % 2 != 0 || ((d / 2) & x) != 0 ? 0L : (1L << Long.bitCount(x)) - (d == 0 ? 2L : 0L)) : "");
    }
}
