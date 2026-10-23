import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && (m >= n - 1 && m <= 2 * (n + 1))
            && new StringBuilder() instanceof StringBuilder sb
            && new int[]{n, m, 2, 2} instanceof int[] st
            && IntStream.range(0, n + m).allMatch(i -> Boolean.valueOf(st[0] > 0 && st[2] != 0 && !(st[1] > st[0] && !(st[2] == 1 && st[3] == 1))) instanceof Boolean z
                && sb.append(z ? '0' : '1') != null
                && (st[3] = st[2]) >= 0
                && (st[2] = z ? 0 : 1) >= 0
                && (z ? st[0]-- : st[1]--) >= 0)
            ? sb.toString() : "-1");
    }
}
