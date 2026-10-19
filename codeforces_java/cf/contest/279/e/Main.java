import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next() instanceof String t && new int[]{0, 1 << 29} instanceof int[] d
            && IntStream.iterate(t.length() - 1, i -> i >= 0, i -> i - 1).allMatch(i -> t.charAt(i) == '0'
                ? Integer.valueOf(Math.min(d[0], d[1] + 1)) instanceof Integer n0 && (d[1] += 1) > 0 && (d[0] = n0) >= 0
                : Integer.valueOf(d[0] + 1) instanceof Integer m0 && Integer.valueOf(Math.min(d[0] + 1, d[1])) instanceof Integer m1 && (d[0] = m0) >= 0 && (d[1] = m1) >= 0)
            ? Math.min(d[0], d[1] + 1) : "");
    }
}
