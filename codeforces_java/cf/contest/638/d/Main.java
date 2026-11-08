import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer a && Integer.valueOf(t[1]) instanceof Integer b && Integer.valueOf(t[2]) instanceof Integer c
            && Integer.valueOf((b + 2) * (c + 2)) instanceof Integer s0 && Integer.valueOf(c + 2) instanceof Integer s1
            && new int[(a + 2) * s0] instanceof int[] g && new int[]{s0, s1, 1} instanceof int[] dd
            && IntStream.range(0, a * b).filter(r -> IntStream.range(0, c).filter(z -> t[3 + r].charAt(z) == '1'
                && (g[(r / b + 1) * s0 + (r % b + 1) * s1 + z + 1] = 1) < 0).count() < 0).count() == 0
            ? IntStream.range(0, g.length).filter(p -> g[p] == 1 && IntStream.range(0, 9).anyMatch(q -> g[p - dd[q / 3]] == 1 && g[p + dd[q % 3]] == 1
                && (q / 3 == q % 3 || g[p - dd[q / 3] + dd[q % 3]] == 0))).count()
            : "");
    }
}
