import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim() instanceof String s
            && Integer.valueOf(s.length()) instanceof Integer n
            && new long[]{1, 1} instanceof long[] st
            && IntStream.rangeClosed(1, n).allMatch(i -> i < n && s.charAt(i - 1) + s.charAt(i) - 96 == 9 ? st[0]++ >= 0
                : (st[1] *= st[0] % 2 == 1 ? (st[0] + 1) / 2 : 1) > 0 && (st[0] = 1) > 0)
            ? st[1] : "");
    }
}
