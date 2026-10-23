import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && IntStream.rangeClosed(1, g0[0]).filter(i -> g0[i] == 1).toArray() instanceof int[] p1
            && IntStream.rangeClosed(1, g0[0]).filter(i -> g0[i] == 2).toArray() instanceof int[] p2
            && IntStream.rangeClosed(1, g0[0]).filter(i -> g0[i] == 3).toArray() instanceof int[] p3
            && Integer.valueOf(Math.min(p1.length, Math.min(p2.length, p3.length))) instanceof Integer k
            ? k + "\n" + IntStream.range(0, k).mapToObj(i -> p1[i] + " " + p2[i] + " " + p3[i] + "\n").collect(Collectors.joining())
            : "");
    }
}
