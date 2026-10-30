import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48 ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) == 1 : ps[2] == 0 || (v[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0)
            && new int[1] instanceof int[] d && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, v[0]).allMatch(i -> d[0] + v[1 + 2 * i] <= 500 ? (d[0] += v[1 + 2 * i]) >= -500 && sb.append('A') != null : (d[0] -= v[2 + 2 * i]) >= -500 && sb.append('G') != null)
            ? sb : "");
    }
}
