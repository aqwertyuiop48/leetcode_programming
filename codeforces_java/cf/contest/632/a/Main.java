import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Long.valueOf(Long.parseLong(t[1]) / 2) instanceof Long h && new long[2] instanceof long[] st
            && IntStream.range(0, n).allMatch(i -> (st[1] += (st[0] = 2 * st[0] + (t[1 + n - i].length() > 4 ? 1 : 0)) * h) >= 0)
            ? st[1] : "");
    }
}
